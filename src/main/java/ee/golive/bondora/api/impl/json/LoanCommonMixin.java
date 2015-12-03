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
import ee.golive.bondora.api.domain.AuctionIncomeVerificationStatus;
import ee.golive.bondora.api.domain.AuctionPurpose;
import ee.golive.bondora.api.domain.Sex;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LoanCommonMixin extends BondoraObjectMixin {

    @JsonProperty("LoanPartId")
    private String loanPartId;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("AuctionId")
    private String auctionId;

    @JsonProperty("AuctionName")
    private String auctionName;

    @JsonProperty("AuctionNumber")
    private Integer auctionNumber;

    @JsonProperty("AuctionBidNumber")
    private Integer auctionBidNumber;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("CreditScore")
    private Integer creditScore;

    @JsonProperty("Rating")
    private String rating;

    @JsonProperty("Interest")
    private BigDecimal interest;

    @JsonProperty("UseOfLoan")
    private AuctionPurpose useOfLoan;

    @JsonProperty("IncomeVerificationStatus")
    private AuctionIncomeVerificationStatus incomeVerificationStatus;

    @JsonProperty("LoanStatusCode")
    private Integer loanStatusCode;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("Gender")
    private Sex gender;

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
    private BigDecimal nextPaymentSum;

    @JsonProperty("NrOfScheduledPayments")
    private Integer nrOfScheduledPayments;

    @JsonProperty("PrincipalRepaid")
    private BigDecimal principalRepaid;

    @JsonProperty("InterestRepaid")
    private BigDecimal interestRepaid;

    @JsonProperty("LateAmountPaid")
    private BigDecimal lateAmountPaid;

    @JsonProperty("PrincipalRemaining")
    private BigDecimal principalRemaining;

    @JsonProperty("PrincipalLateAmount")
    private BigDecimal principalLateAmount;

    @JsonProperty("InterestLateAmount")
    private BigDecimal interestLateAmount;

    @JsonProperty("PenaltyLateAmount")
    private BigDecimal penaltyLateAmount;

    @JsonProperty("LateAmountTotal")
    private BigDecimal lateAmountTotal;
}
