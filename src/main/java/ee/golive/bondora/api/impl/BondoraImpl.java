/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.golive.bondora.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.golive.bondora.api.Bondora;
import ee.golive.bondora.api.BondoraConfig;
import ee.golive.bondora.api.domain.responses.ApiResult;
import ee.golive.bondora.api.exceptions.BondoraException;
import ee.golive.bondora.api.impl.json.BondoraModule;
import ee.golive.bondora.api.operations.*;
import ee.golive.bondora.api.util.HttpClientFactory;
import ee.golive.bondora.api.util.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public class BondoraImpl implements Bondora {

    private String accessToken;

    private RestOperations restTemplate;

    private AuctionOperations auctionOperations;

    private SecondaryMarketOperations secondaryMarketOperations;

    private OAuthOperations oAuthOperations;

    private AccountOperations accountOperations;

    private ReportOperations reportOperations;

    private BondoraConfig config;

    public BondoraImpl(BondoraConfig config, String accessToken) {
        this.accessToken = accessToken;
        this.config = config;
        initialize();
    }

    public BondoraImpl(BondoraConfig config) {
        this(config, null);
    }

    public BondoraImpl() {
        this(null);
    }

    private void initialize() {
        auctionOperations = new AuctionImpl(this);
        accountOperations = new AccountImpl(this);
        secondaryMarketOperations = new SecondaryMarketImpl(this);
        reportOperations = new ReportImpl(this);
        oAuthOperations = new OAuthImpl(this);
        restTemplate = createRestTemplate();
    }

    public RestOperations getRestTemplate() {
        return restTemplate;
    }

    @Override
    public AuctionOperations getAuctionOperations() {
        return auctionOperations;
    }

    @Override
    public SecondaryMarketOperations getSecondMarketOperations() {
        return secondaryMarketOperations;
    }

    @Override
    public AccountOperations getAccountOperations() {
        return accountOperations;
    }

    @Override
    public ReportOperations getReportOperations() {
        return reportOperations;
    }

    @Override
    public OAuthOperations getOauthOperations() {
        return oAuthOperations;
    }

    @Override
    public void setConfig(BondoraConfig config) {
        this.config = config;
    }

    @Override
    public BondoraConfig getConfig() {
        return config;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    public MappingJackson2HttpMessageConverter getJsonMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new BondoraModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    public <T> T fetchObject(String resource, MultiValueMap<String, String> queryParameters,
                             ParameterizedTypeReference<T> responseType) throws BondoraException {
        URI uri = URIBuilder.fromUri(resource).queryParams(queryParameters).build();
        ResponseEntity<T> response = getRestTemplate().exchange(uri, HttpMethod.GET, null, responseType);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new BondoraException("", (ApiResult) response.getBody(), response.getStatusCode());
    }

    public <T> T postObject(String resource, Object entity, ParameterizedTypeReference<T> responseType)
            throws BondoraException {
        URI uri = URIBuilder.fromUri(resource).build();
        HttpEntity<?> httpEntity = new HttpEntity<>(entity, null);
        ResponseEntity<T> response = getRestTemplate().exchange(uri, HttpMethod.POST, httpEntity, responseType);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new BondoraException("", (ApiResult) response.getBody(), response.getStatusCode());
    }

    public <T> T fetchObject(String resource, ParameterizedTypeReference<T> responseType) throws BondoraException {
        return fetchObject(resource, null, responseType);
    }

    public <T> T postObject(String resource, Object entity, Class<T> type) throws BondoraException  {
        URI uri = URIBuilder.fromUri(resource).build();
        HttpEntity<?> httpEntity = new HttpEntity<>(entity, null);
        ResponseEntity<T> response = getRestTemplate().exchange(uri, HttpMethod.POST, httpEntity, type);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new BondoraException("", (ApiResult) response.getBody(), response.getStatusCode());
    }

    public <T> T postObject(String resource, Class<T> type) throws BondoraException  {
        return postObject(resource, null, type);
    }

    public String apiUrl(String resource) {
        return getConfig().getApiUrl() + resource;
    }

    private RestTemplate createRestTemplate() {
        List<HttpMessageConverter<?>> messageConverters = getMessageConverters();
        RestTemplate restTemplate = new RestTemplate(messageConverters);
        restTemplate.setRequestFactory(HttpClientFactory.getHttpsClient());
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new TokenInterceptor(this));
        //interceptors.add(new LoggingRequestInterceptor());
        restTemplate.setInterceptors(interceptors);
        return restTemplate;
    }

    protected List<HttpMessageConverter<?>> getMessageConverters() {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(getJsonMessageConverter());
        return messageConverters;
    }
}