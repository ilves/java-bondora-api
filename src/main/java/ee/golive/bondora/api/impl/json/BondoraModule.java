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

package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import ee.golive.bondora.api.*;

public class BondoraModule extends SimpleModule {

    public BondoraModule() {
        super("BondoraModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(Auction.class, AuctionMixin.class);
        context.setMixInAnnotations(ApiError.class, ApiErrorMixin.class);
        context.setMixInAnnotations(ApiResultSingle.class, ApiResultSingleMixin.class);
        context.setMixInAnnotations(ApiResult.class, ApiResultMixin.class);
        context.setMixInAnnotations(ApiResultList.class, ApiResultListMixin.class);
        context.setMixInAnnotations(BidRequest.class, BidRequestMixin.class);
        context.setMixInAnnotations(BidSummary.class, BidSummaryMixin.class);
        context.setMixInAnnotations(UserOrganization.class, UserOrganizationMixin.class);
        context.setMixInAnnotations(SecondMarketItem.class, SecondMarketItemMixin.class);
    }
}