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
import ee.golive.bondora.api.impl.json.BondoraModule;
import ee.golive.bondora.api.util.URIBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is the central class for interacting with Bondora.
 * @author Taavi Ilves
 */
public class BondoraTemplate implements Bondora {

    private AccessToken accessToken;

    public static String API_URL = "https://api-sandbox.bondora.com:443/api/";

    public static String API_VERSION = "v1";

    private RestTemplate restTemplate;

    private AuthTemplate authOperations;

    private AuctionTemplate auctionOperations;

    private UserTemplate userOperations;

    private ObjectMapper objectMapper;

    public BondoraTemplate(String accessToken) {
        this.accessToken = new AccessToken(accessToken);
        initialize();
    }

    public BondoraTemplate() {
        this(null);
    }

    private void initialize() {
        authOperations = new AuthTemplate(this);
        auctionOperations = new AuctionTemplate(this);
        userOperations = new UserTemplate(this);
        restTemplate = createRestTemplate();
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    @Override
    public AuthTemplate getAuthOperations() {
        return authOperations;
    }

    @Override
    public AuctionTemplate getAuctionOperations() {
        return auctionOperations;
    }

    @Override
    public UserTemplate getUserOperations() {
        return userOperations;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken.setToken(accessToken);
    }

    public MappingJackson2HttpMessageConverter getJsonMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new BondoraModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    public <T> T fetchObject(String resource, MultiValueMap<String, String> queryParameters, ParameterizedTypeReference<T> responseType) {
        URI uri = URIBuilder.fromUri(getApiUrl(resource)).queryParams(queryParameters).build();
        return getRestTemplate().exchange(uri, HttpMethod.GET, null, responseType).getBody();
    }

    public <T> T postObject(String resource, Object entity, ParameterizedTypeReference<T> responseType) {
        URI uri = URIBuilder.fromUri(getApiUrl(resource)).build();
        HttpEntity<?> httpEntity = new HttpEntity<Object>(entity, null);
        return getRestTemplate().exchange(uri, HttpMethod.POST, httpEntity, responseType).getBody();
    }

    public <T> T fetchObject(String resource, ParameterizedTypeReference<T> responseType) {
        return fetchObject(resource, null, responseType);
    }

    public <T> T postObject(String resource, Object entity, Class<T> type) {
        URI uri = URIBuilder.fromUri(getApiUrl(resource)).build();
        return getRestTemplate().postForObject(uri, entity, type);
    }

    private String getApiUrl(String resource) {
        return API_URL + API_VERSION + "/" + resource;
    }

    private RestTemplate createRestTemplate() {
        List<HttpMessageConverter<?>> messageConverters = getMessageConverters();
        RestTemplate restTemplate = new RestTemplate(messageConverters);
        restTemplate.setInterceptors(Collections.singletonList(new TokenInterceptor(accessToken)));
        return restTemplate;
    }

    protected List<HttpMessageConverter<?>> getMessageConverters() {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(getJsonMessageConverter());
        return messageConverters;
    }

    /**
     * Helper class for Bondora access token
     */
    final public class AccessToken {

        private String token;

        public AccessToken(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}