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
import ee.golive.bondora.api.domain.requests.SecondMarketBuyRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketSaleRequest;
import ee.golive.bondora.api.domain.responses.ApiResult;
import ee.golive.bondora.api.domain.responses.ApiResultList;
import ee.golive.bondora.api.domain.responses.ApiResultSingle;
import ee.golive.bondora.api.exceptions.BondoraException;
import ee.golive.bondora.api.operations.ReportOperations;
import ee.golive.bondora.api.operations.SecondaryMarketOperations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public class ReportImpl implements ReportOperations {

    private BondoraImpl api;

    public ReportImpl(BondoraImpl api) {
        this.api = api;
    }

    @Override
    public ApiResultList<LoanDatasetItem> getLoanDataset(String query) throws BondoraException {
        ParameterizedTypeReference<ApiResultList<LoanDatasetItem>> reference
                = new ParameterizedTypeReference<ApiResultList<LoanDatasetItem>>() {};
        return (api.fetchObject(api.apiUrl("loandataset"), getQueryParameters(query), reference));
    }

    private MultiValueMap<String, String> getQueryParameters(String query) {
        MultiValueMap<String, String> queryParameters = new LinkedMultiValueMap<>();
        if (query != null && query.length() > 0 && query.indexOf('=') > 0) {
            for(String param : query.split("&")) {
                String[] params = param.split("=");
                queryParameters.add(params[0], params[1]);
            }
        }
        return queryParameters;
    }
}
