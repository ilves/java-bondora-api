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

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SecondMarketItemMixin extends BondoraObjectMixin {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("loanPartId")
    private String loanPartId;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("auctionId")
    private String auctionId;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("CreditScore")
    private String creditScore;

    @JsonProperty("Rating")
    private String rating;

    @JsonProperty("Interest")
    private String interest;

    @JsonProperty("loanStatusCode")
    private Integer loanStatusCode;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("Xirr")
    private Double xirr;

    @JsonProperty("AuctionName")
    private String auctionName;

    @JsonProperty("AuctionNumber")
    private Integer auctionNumber;

    @JsonProperty("AuctionBidNumber")
    private Integer auctionBidNumber;

    @JsonProperty("DateOfBirth")
    private Date dateOfBirth;

    @JsonProperty("SignedDate")
    private Date signedDate;

    @JsonProperty("ReScheduledOn")
    private Date reScheduledOn;

    @JsonProperty("DebtOccuredOn")
    private Date debtOccuredOn;

    @JsonProperty("DebtOccuredOnForSecondary")
    private Date debtOccuredOnForSecondary;

    @JsonProperty("NextPaymentNr")
    private Integer nextPaymentNr;

    @JsonProperty("NextPaymentDate")
    private Date nextPaymentDate;

    @JsonProperty("NextPaymentSum")
    private Double nextPaymentSum;

    @JsonProperty("NrOfScheduledPayments")
    private Integer nrOfScheduledPayments;

    @JsonProperty("PrincipalRepaid")
    private Double principalRepaid;

    @JsonProperty("InterestRepaid")
    private Double interestRepaid;

    @JsonProperty("LateAmountPaid")
    private Double lateAmountPaid;

    @JsonProperty("PrincipalRemaining")
    private Double principalRemaining;

    @JsonProperty("PrincipalLateAmount")
    private Double principalLateAmount;

    @JsonProperty("InterestLateAmount")
    private Double interestLateAmount;

    @JsonProperty("PenaltyLateAmount")
    private Double penaltyLateAmount;

    @JsonProperty("LateAmountTotal")
    private Double lateAmountTotal;

    @JsonProperty("Price")
    private Double price;

    @JsonProperty("Fee")
    private Double fee;

    @JsonProperty("TotalCost")
    private Double totalCost;

    @JsonProperty("OutstandingPayments")
    private Double outstandingPayments;

    @JsonProperty("DesiredDiscountRate")
    private Double desiredDiscountRate;

    @JsonProperty("ListedOnDate")
    private Date listedOnDate;

}
