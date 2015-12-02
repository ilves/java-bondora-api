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
import ee.golive.bondora.api.domain.*;
import ee.golive.bondora.api.domain.requests.BidRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketBuyRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketSaleRequest;
import ee.golive.bondora.api.domain.results.ApiError;
import ee.golive.bondora.api.domain.results.ApiResult;
import ee.golive.bondora.api.domain.results.ApiResultList;
import ee.golive.bondora.api.domain.results.ApiResultSingle;
import ee.golive.bondora.api.impl.CustomDateDeseralizer;

import java.util.Date;

public class BondoraModule extends SimpleModule {

    public BondoraModule() {
        super("BondoraModule");
        addDeserializer(Date.class, new CustomDateDeseralizer());
    }

    @Override
    public void setupModule(SetupContext context) {
        super.setupModule(context);
        context.setMixInAnnotations(Auction.class, AuctionMixin.class);
        context.setMixInAnnotations(ApiError.class, ApiErrorMixin.class);
        context.setMixInAnnotations(ApiResultSingle.class, ApiResultSingleMixin.class);
        context.setMixInAnnotations(ApiResult.class, ApiResultMixin.class);
        context.setMixInAnnotations(ApiResultList.class, ApiResultListMixin.class);
        context.setMixInAnnotations(BidRequest.class, BidRequestMixin.class);
        context.setMixInAnnotations(BidSummary.class, BidSummaryMixin.class);
        context.setMixInAnnotations(SecondaryMarketItem.class, SecondMarketItemMixin.class);
        context.setMixInAnnotations(AccessToken.class, AccessTokenMixin.class);
        context.setMixInAnnotations(MyAccountBalance.class, MyAccountBalanceMixin.class);
        context.setMixInAnnotations(MyInvestmentItem.class, MyInvestmentItemMixin.class);
        context.setMixInAnnotations(DebtManagementEvent.class, DebtManagementEventMixin.class);
        context.setMixInAnnotations(LoanTransfer.class, LoanTransferMixin.class);
        context.setMixInAnnotations(ScheduledPayment.class, ScheduledPaymentMixin.class);
        context.setMixInAnnotations(LoanPartDetails.class, LoanPartDetailsMixin.class);
        context.setMixInAnnotations(SecondMarketBuyRequest.class, SecondMarketBuyRequestMixin.class);
        context.setMixInAnnotations(SecondMarketSell.class, SecondMarketSellMixin.class);
        context.setMixInAnnotations(SecondMarketSaleRequest.class, SecondMarketSaleRequestMixin.class);
        context.setMixInAnnotations(SecondMarketSaleResponse.class, SecondMarketSaleResponseMixin.class);
        context.setMixInAnnotations(SecondaryMarketItemSummary.class, SecondaryMarketItemSummaryMixin.class);
        context.setMixInAnnotations(BidResponse.class, BidResponseMixin.class);
        context.setMixInAnnotations(Liability.class, LiabilityMixin.class);
        context.setMixInAnnotations(Debt.class, DeptMixin.class);
        context.setMixInAnnotations(AuctionExtended.class, AuctionExtendedMixin.class);
    }
}