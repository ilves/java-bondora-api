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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MyInvestmentItemMixin extends LoanCommonMixin {

    @JsonProperty("LoanId")
    private String loanId;

    @JsonProperty("LoanDuration")
    private Integer loanDuration;

    @JsonProperty("PurchaseDate")
    private Date purchaseDate;

    @JsonProperty("SoldDate")
    private Date soldDate;

    @JsonProperty("PurchasePrice")
    private BigDecimal purchasePrice;

    @JsonProperty("SalePrice")
    private BigDecimal salePrice;

    @JsonProperty("ListedInSecondMarketOn")
    private Date listedInSecondMarketOn;

    @JsonProperty("NoteLoanTransfersMainAmount")
    private BigDecimal noteLoanTransfersMainAmount;

    @JsonProperty("NoteLoanTransfersInterestAmount")
    private BigDecimal noteLoanTransfersInterestAmount;

    @JsonProperty("NoteLoanLateChargesPaid")
    private BigDecimal noteLoanLateChargesPaid;

    @JsonProperty("NoteLoanTransfersEarningsAmount")
    private BigDecimal noteLoanTransfersEarningsAmount;

    @JsonProperty("NoteLoanTransfersTotalRepaimentsAmount")
    private BigDecimal noteLoanTransfersTotalRepaimentsAmount;
}
