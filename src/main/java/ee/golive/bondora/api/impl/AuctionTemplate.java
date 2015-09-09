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

import ee.golive.bondora.api.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class AuctionTemplate implements AuctionOperations {

    private BondoraTemplate api;

    public AuctionTemplate(BondoraTemplate api) {
        this.api = api;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Auction> getAuctions() {
        return getAuctions(null);
    }

    @Override
    public List<Auction> getAuctions(String query) {
        ParameterizedTypeReference reference = new ParameterizedTypeReference<ApiResultList<Auction>>() {};
        return ((ApiResultList<Auction>) api.fetchObject("auctions", getQueryParameters(query), reference)).getPayload();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Auction getAuction(String id) {
        ParameterizedTypeReference reference = new ParameterizedTypeReference<ApiResultSingle<Auction>>() {};
        return ((ApiResultSingle<Auction>) api.fetchObject("auction/" + id, reference)).getPayload();
    }

    @Override
    public boolean bid(String organizationId, List<Bid> bids) {
        BidRequest request = new BidRequest();
        request.setOrganizationId(organizationId);
        request.setBids(bids);
        return api.postObject("bid", request, ApiResult.class).isSuccess();
    }

    @Override
    public List<BidSummary> getBids() {
        return getBids(null);
    }

    @Override
    public List<BidSummary> getBids(String query) {
        ParameterizedTypeReference reference = new ParameterizedTypeReference<ApiResultList<BidSummary>>() {};
        return ((ApiResultList<BidSummary>) api.fetchObject("bids", getQueryParameters(query), reference)).getPayload();
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