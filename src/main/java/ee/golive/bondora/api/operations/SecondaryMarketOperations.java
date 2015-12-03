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

package ee.golive.bondora.api.operations;

import ee.golive.bondora.api.domain.LoanPartDetails;
import ee.golive.bondora.api.domain.SecondMarketSaleResponse;
import ee.golive.bondora.api.domain.SecondaryMarketItem;
import ee.golive.bondora.api.domain.SecondaryMarketItemSummary;
import ee.golive.bondora.api.domain.requests.SecondMarketBuyRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketSaleRequest;
import ee.golive.bondora.api.domain.responses.ApiResult;
import ee.golive.bondora.api.domain.responses.ApiResultList;
import ee.golive.bondora.api.domain.responses.ApiResultSingle;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public interface SecondaryMarketOperations {
    ApiResultSingle<SecondaryMarketItemSummary> getItem(String id);
    ApiResultList<SecondaryMarketItem> getItems();
    ApiResultList<SecondaryMarketItem> getItems(String query);
    ApiResultSingle<LoanPartDetails> getLoanPart(String id);
    ApiResult buy(SecondMarketBuyRequest request);
    ApiResultList<SecondMarketSaleResponse> sell(SecondMarketSaleRequest request);
    ApiResult cancel(String id);
}