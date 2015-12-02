/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

	@JsonProperty("")

	@JsonProperty("")
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
import ee.golive.bondora.api.domain.*;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AuctionMixin extends BondoraObjectMixin {

    @JsonProperty("LoanId")
    private String loanId;

	@JsonProperty("AuctionId")
    private String auctionId;

	@JsonProperty("LoanNumber")
    private Integer loanNumber;

	@JsonProperty("UserName")
    private String userName;

	@JsonProperty("NewCreditCustomer")
    private Integer newCreditCustomer;

	@JsonProperty("LoanApplicationStartedDate")
    private Date loanApplicationStartedDate;

	@JsonProperty("ApplicationSignedHour")
    private Integer applicationSignedHour;

	@JsonProperty("ApplicationSignedWeekday")
    private Integer applicationSignedWeekday;

	@JsonProperty("VerificationType")
    private AuctionIncomeVerificationStatus verificationType;

	@JsonProperty("LanguageCode")
    private LanguageCode languageCode;

	@JsonProperty("Age")
    private Integer age;

	@JsonProperty("Gender")
    private Sex gender;

	@JsonProperty("Country")
    private String country;

	@JsonProperty("CreditScore")
    private Integer creditScore;

	@JsonProperty("AppliedAmount")
    private BigDecimal appliedAmount;

	@JsonProperty("Interest")
    private BigDecimal interest;

	@JsonProperty("LoanDuration")
    private BigDecimal loanDuration;

	@JsonProperty("County")
    private String county;

	@JsonProperty("City")
    private String city;

	@JsonProperty("UseOfLoan")
    private AuctionPurpose useOfLoan;

	@JsonProperty("Education")
    private AuctionQuestionEducation education;

	@JsonProperty("MaritalStatus")
    private AuctionQuestionMaritalStatus maritalStatus;

	@JsonProperty("NrOfDependants")
    private String nrOfDependants;

	@JsonProperty("EmploymentStatus")
    private AuctionQuestionEmploymentStatus employmentStatus;

	@JsonProperty("EmploymentDurationCurrentEmployer")
    private String employmentDurationCurrentEmployer;

	@JsonProperty("WorkExperience")
    private String workExperience;

	@JsonProperty("OccupationArea")
    private AuctionQuestionOccupationArea occupationArea;

	@JsonProperty("HomeOwnershipType")
    private AuctionQuestionHomeOwnershipType homeOwnershipType;

	@JsonProperty("IncomeFromPrincipalEmployer")
    private BigDecimal incomeFromPrincipalEmployer;

	@JsonProperty("IncomeFromPension")
    private BigDecimal incomeFromPension;

	@JsonProperty("IncomeFromFamilyAllowance")
    private BigDecimal incomeFromFamilyAllowance;

	@JsonProperty("IncomeFromSocialWelfare")
    private BigDecimal incomeFromSocialWelfare;

	@JsonProperty("IncomeFromLeavePay")
    private BigDecimal incomeFromLeavePay;

	@JsonProperty("IncomeFromChildSupport")
    private BigDecimal incomeFromChildSupport;

	@JsonProperty("IncomeOther")
    private BigDecimal incomeOther;

	@JsonProperty("IncomeTotal")
    private BigDecimal incomeTotal;

	@JsonProperty("MonthlyPaymentDay")
    private Integer monthlyPaymentDay;

	@JsonProperty("ScoringDate")
    private Date scoringDate;

	@JsonProperty("ModelVersion")
    private Integer modelVersion;

	@JsonProperty("ExpectedLoss")
    private BigDecimal expectedLoss;

	@JsonProperty("Rating")
    private String rating;

	@JsonProperty("EADRate")
    private BigDecimal EADRate;

	@JsonProperty("LossGivenDefault")
    private BigDecimal lossGivenDefault;

	@JsonProperty("MaturityFactor")
    private BigDecimal maturityFactor;

	@JsonProperty("ProbabilityOfDefault")
    private BigDecimal probabilityOfDefault;

	@JsonProperty("ExpectedReturnAlpha")
    private BigDecimal expectedReturnAlpha;

	@JsonProperty("InterestRateAlpha")
    private BigDecimal interestRateAlpha;

	@JsonProperty("LiabilitiesTotal")
    private BigDecimal liabilitiesTotal;

	@JsonProperty("ListedOnUTC")
    private Date listedOnUTC;
}
