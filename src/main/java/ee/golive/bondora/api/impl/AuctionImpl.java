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

import ee.golive.bondora.api.domain.*;
import ee.golive.bondora.api.domain.requests.BidRequest;
import ee.golive.bondora.api.domain.results.ApiResult;
import ee.golive.bondora.api.domain.results.ApiResultList;
import ee.golive.bondora.api.domain.results.ApiResultSingle;
import ee.golive.bondora.api.operations.AuctionOperations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class AuctionImpl implements AuctionOperations {

    private BondoraImpl api;

    public AuctionImpl(BondoraImpl api) {
        this.api = api;
    }

    @Override
    public ApiResultList<Auction> getAuctions() {
        return getAuctions(null);
    }

    @Override
    public ApiResultList<Auction> getAuctions(String query) {
        ParameterizedTypeReference<ApiResultList<Auction>> reference =
                new ParameterizedTypeReference<ApiResultList<Auction>>() {};
        return (api.fetchObject(api.apiUrl("auctions"), getQueryParameters(query), reference));
    }

    @Override
    public ApiResultSingle<BidSummary> getBid(String id) {
        ParameterizedTypeReference<ApiResultSingle<BidSummary>> reference =
                new ParameterizedTypeReference<ApiResultSingle<BidSummary>>() {};
        return (api.fetchObject(api.apiUrl("bid/" + id), reference));
    }

    @Override
    public ApiResultSingle<Auction> getAuction(String id) {
        ParameterizedTypeReference<ApiResultSingle<Auction>> reference =
                new ParameterizedTypeReference<ApiResultSingle<Auction>>() {};
        return (api.fetchObject(api.apiUrl("auction/" + id), reference));
    }

    @Override
    public ApiResultList<BidResponse> bid(BidRequest request) {
        ParameterizedTypeReference<ApiResultList<BidResponse>> reference
                = new ParameterizedTypeReference<ApiResultList<BidResponse>>() {};
        return (api.postObject(api.apiUrl("bid"), request, reference));
    }

    @Override
    public ApiResult cancelBid(String id) {
        return api.postObject(api.apiUrl("bid/" + id + "/cancel"), ApiResult.class);
    }

    @Override
    public ApiResultList<BidSummary> getBids() {
        return getBids(null);
    }

    @Override
    public ApiResultList<BidSummary> getBids(String query) {
        ParameterizedTypeReference<ApiResultList<BidSummary>> reference
                = new ParameterizedTypeReference<ApiResultList<BidSummary>>() {};
        return (api.fetchObject(api.apiUrl("bids"), getQueryParameters(query), reference));
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