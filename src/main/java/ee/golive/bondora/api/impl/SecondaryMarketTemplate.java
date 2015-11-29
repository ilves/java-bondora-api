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

import ee.golive.bondora.api.ApiResultList;
import ee.golive.bondora.api.SecondMarketItem;
import ee.golive.bondora.api.SecondaryMarketOperations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class SecondaryMarketTemplate implements SecondaryMarketOperations {

    private BondoraTemplate api;

    public SecondaryMarketTemplate(BondoraTemplate api) {
        this.api = api;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SecondMarketItem> getAuctions() {
        return getAuctions(null);
    }

    @Override
    public List<SecondMarketItem> getAuctions(String query) {
        ParameterizedTypeReference reference = new ParameterizedTypeReference<ApiResultList<SecondMarketItem>>() {};
        return ((ApiResultList<SecondMarketItem>) api.fetchObject("secondarymarket", getQueryParameters(query), reference)).getPayload();
    }

    private MultiValueMap<String, String> getQueryParameters(String query) {
        MultiValueMap<String, String> queryParameters = new LinkedMultiValueMap<>();
        if (query != null) {
            for(String param : query.split("&")) {
                String[] params = param.split("=");
                queryParameters.add(params[0], params[1]);
            }
        }
        return queryParameters;
    }
}