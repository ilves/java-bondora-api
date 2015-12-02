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

import ee.golive.bondora.api.domain.LoanPartDetails;
import ee.golive.bondora.api.domain.SecondMarketSaleResponse;
import ee.golive.bondora.api.domain.SecondaryMarketItem;
import ee.golive.bondora.api.domain.SecondaryMarketItemSummary;
import ee.golive.bondora.api.domain.requests.SecondMarketBuyRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketSaleRequest;
import ee.golive.bondora.api.domain.results.ApiResult;
import ee.golive.bondora.api.domain.results.ApiResultList;
import ee.golive.bondora.api.domain.results.ApiResultSingle;
import ee.golive.bondora.api.operations.SecondaryMarketOperations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class SecondaryMarketImpl implements SecondaryMarketOperations {

    private BondoraImpl api;

    public SecondaryMarketImpl(BondoraImpl api) {
        this.api = api;
    }

    @Override
    public ApiResultSingle<SecondaryMarketItemSummary> getItem(String id) {
        ParameterizedTypeReference<ApiResultSingle<SecondaryMarketItemSummary>> reference
                = new ParameterizedTypeReference<ApiResultSingle<SecondaryMarketItemSummary>>() {};
        return (api.fetchObject(api.apiUrl("secondarymarket/" + id), reference));
    }

    @Override
    public ApiResultList<SecondaryMarketItem> getItems() {
        return getItems(null);
    }

    @Override
    public ApiResultList<SecondaryMarketItem> getItems(String query) {
        ParameterizedTypeReference<ApiResultList<SecondaryMarketItem>> reference
                = new ParameterizedTypeReference<ApiResultList<SecondaryMarketItem>>() {};
        return (api.fetchObject(api.apiUrl("secondarymarket"), getQueryParameters(query), reference));
    }

    @Override
    public ApiResultSingle<LoanPartDetails> getLoanPart(String id) {
        ParameterizedTypeReference<ApiResultSingle<LoanPartDetails>> reference
                = new ParameterizedTypeReference<ApiResultSingle<LoanPartDetails>>() {};
        return (api.fetchObject(api.apiUrl("secondarymarket/loanpart/" + id), reference));
    }

    @Override
    public ApiResult buy(SecondMarketBuyRequest request) {
        return api.postObject(api.apiUrl("secondarymarket/buy"), request, ApiResult.class);
    }

    @Override
    public ApiResultList<SecondMarketSaleResponse> sell(SecondMarketSaleRequest request) {
        ParameterizedTypeReference<ApiResultList<SecondMarketSaleResponse>> reference
                = new ParameterizedTypeReference<ApiResultList<SecondMarketSaleResponse>>() {};
        return (api.postObject(api.apiUrl("secondarymarket/sell"), request, reference));
    }

    @Override
    public ApiResult cancel(String id) {
        return api.postObject(api.apiUrl("secondarymarket/cancel/" + id), ApiResult.class);
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