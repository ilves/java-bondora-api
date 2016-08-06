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
import ee.golive.bondora.api.domain.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LoanDatasetItemMixin extends BondoraObjectMixin {

    @JsonProperty("ReportAsOfEOD")
    private Date reportAsOfEOD;

    @JsonProperty("LoanId")
    private String loanId;

    @JsonProperty("LoanNumber")
    private String loanNumber;

    @JsonProperty("CreditDecision")
    private Boolean creditDecision;

    @JsonProperty("WasFunded")
    private Boolean wasFunded;

    @JsonProperty("BidsInvestmentPlan")
    private BigDecimal bidsInvestmentPlan;

    @JsonProperty("BidsApi")
    private BigDecimal bidsApi;

    @JsonProperty("BidsManual")
    private BigDecimal bidsManual;

    @JsonProperty("IsBusinessLoan")
    private Boolean isBusinessLoan;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("NewCreditCustomer")
    private Boolean newCreditCustomer;

    @JsonProperty("LoanApplicationStartedDate")
    private Date loanApplicationStartedDate;

    @JsonProperty("LoanDate")
    private Date loanDate;

    @JsonProperty("ContractEndDate")
    private Date contractEndDate;

    @JsonProperty("FirstPaymentDate")
    private Date firstPaymentDate;

    @JsonProperty("MaturityDate_Original")
    private Date maturityDateOriginal;

    @JsonProperty("MaturityDate_Last")
    private Date maturityDateLast;

    @JsonProperty("Has1DPassedFromFirstPayment")
    private Boolean has1DPassedFromFirstPayment;

    @JsonProperty("Has14DPassedFromFirstPayment")
    private Boolean has14DPassedFromFirstPayment;

    @JsonProperty("Has30DPassedFromFirstPayment")
    private Boolean has30DPassedFromFirstPayment;

    @JsonProperty("Has60DPassedFromFirstPayment")
    private Boolean has60DPassedFromFirstPayment;

    @JsonProperty("ApplicationSignedHour")
    private Integer applicationSignedHour;

    @JsonProperty("ApplicationSignedWeekday")
    private Integer applicationSignedWeekday;

    @JsonProperty("VerificationType")
    private IncomeVerificationStatus verificationType;

    @JsonProperty("LanguageCode")
    private LanguageCode languageCode;

    @JsonProperty("Age")
    private Integer age;

    @JsonProperty("Gender")
    private Sex gender;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("County")
    private String county;

    @JsonProperty("City")
    private String city;

    @JsonProperty("CreditScore")
    private Integer creditScore;

    @JsonProperty("TotalNumDebts")
    private String totalNumDebts;

    @JsonProperty("TotalMaxDebtMonths")
    private String totalMaxDebtMonths;

    @JsonProperty("NumDebtsFinance")
    private String numDebtsFinance;

    @JsonProperty("MaxDebtMonthsFinance")
    private String maxDebtMonthsFinance;

    @JsonProperty("NumDebtsTelco")
    private String numDebtsTelco;

    @JsonProperty("MaxDebtMonthsTelco")
    private String maxDebtMonthsTelco;

    @JsonProperty("NumDebtsOther")
    private String numDebtsOther;

    @JsonProperty("MaxDebtMonthsOther")
    private String maxDebtMonthsOther;

    @JsonProperty("AppliedAmount")
    private BigDecimal appliedAmount;

    @JsonProperty("FundedAmount")
    private BigDecimal fundedAmount;

    @JsonProperty("Interest")
    private BigDecimal interest;

    @JsonProperty("IssuedInterest")
    private BigDecimal issuedInterest;

    @JsonProperty("LoanDuration")
    private Integer loanDuration;

    @JsonProperty("UseOfLoan")
    private AuctionPurpose useOfLoan;

    @JsonProperty("ApplicationType")
    private Integer applicationType;

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

    @JsonProperty("TotalLiabilitiesBeforeLoan")
    private Integer totalLiabilitiesBeforeLoan;

    @JsonProperty("DebtLiabilitiesBeforeLoan")
    private Integer debtLiabilitiesBeforeLoan;

    @JsonProperty("OtherLiabilitiesBeforeLoan")
    private Integer otherLiabilitiesBeforeLoan;

    @JsonProperty("TotalMonthlyLiabilities")
    private BigDecimal totalMonthlyLiabilities;

    @JsonProperty("DebtToIncome")
    private BigDecimal debtToIncome;

    @JsonProperty("FreeCash")
    private BigDecimal freeCash;

    @JsonProperty("NewLoanMonthlyPayment")
    private BigDecimal newLoanMonthlyPayment;

    @JsonProperty("AppliedAmountToIncome")
    private BigDecimal appliedAmountToIncome;

    @JsonProperty("LiabilitiesToIncome")
    private BigDecimal liabilitiesToIncome;

    @JsonProperty("NewPaymentToIncome")
    private BigDecimal newPaymentToIncome;

    @JsonProperty("CountOfBankCredits")
    private Integer countOfBankCredits;

    @JsonProperty("SumOfBankCredits")
    private BigDecimal sumOfBankCredits;

    @JsonProperty("CountOfPaydayLoans")
    private Integer countOfPaydayLoans;

    @JsonProperty("SumOfPaydayLoans")
    private BigDecimal sumOfPaydayLoans;

    @JsonProperty("CountOfOtherCredits")
    private Integer countOfOtherCredits;

    @JsonProperty("SumOfOtherCredits")
    private BigDecimal sumOfOtherCredits;

    @JsonProperty("NoOfPreviousApplications")
    private Integer noOfPreviousApplications;

    @JsonProperty("AmountOfPreviousApplications")
    private BigDecimal amountOfPreviousApplications;

    @JsonProperty("NoOfPreviousLoans")
    private Integer noOfPreviousLoans;

    @JsonProperty("AmountOfPreviousLoans")
    private BigDecimal amountOfPreviousLoans;

    @JsonProperty("NoOfInvestments")
    private Integer noOfInvestments;

    @JsonProperty("AmountOfInvestments")
    private BigDecimal amountOfInvestments;

    @JsonProperty("NoOfBids")
    private Integer noOfBids;

    @JsonProperty("AmountOfBids")
    private BigDecimal amountOfBids;

    @JsonProperty("PreviousRepayments")
    private BigDecimal previousRepayments;

    @JsonProperty("PreviousLateFeesPaid")
    private BigDecimal previousLateFeesPaid;

    @JsonProperty("PreviousEarlyRepayments")
    private BigDecimal previousEarlyRepayments;

    @JsonProperty("HasNewSchedule")
    private Boolean hasNewSchedule;

    @JsonProperty("BondoraCreditHistory")
    private String bondoraCreditHistory;

    @JsonProperty("NewOfferMade")
    private Boolean newOfferMade;

    @JsonProperty("MonthlyPaymentDay")
    private Integer monthlyPaymentDay;

    @JsonProperty("LastPaymentOn")
    private Date lastPaymentOn;

    @JsonProperty("OutstandingPrincipal")
    private BigDecimal outstandingPrincipal;

    @JsonProperty("UnpaidInterestOutstanding")
    private BigDecimal unpaidInterestOutstanding;

    @JsonProperty("InterestAndPenaltiesPaid")
    private BigDecimal interestAndPenaltiesPaid;

    @JsonProperty("CancelledWithin14Days")
    private Boolean cancelledWithin14Days;

    @JsonProperty("GracePeriodStart")
    private Date gracePeriodStart;

    @JsonProperty("GracePeriodEnd")
    private Date gracePeriodEnd;

    @JsonProperty("CurrentLoanHasBeenExtended")
    private Boolean currentLoanHasBeenExtended;

    @JsonProperty("InDebt1Day")
    private Boolean inDebt1Day;

    @JsonProperty("InDebt14Day")
    private Boolean inDebt14Day;

    @JsonProperty("InDebt30Day")
    private Boolean inDebt30Day;

    @JsonProperty("InDebt60Day")
    private Boolean inDebt60Day;

    @JsonProperty("IsFirstPaymentDefault")
    private Boolean isFirstPaymentDefault;

    @JsonProperty("LeftMoneyForFirstPayment")
    private Boolean leftMoneyForFirstPayment;

    @JsonProperty("CurrentDebtDays")
    private Integer currentDebtDays;

    @JsonProperty("PrincipalDebtAmount")
    private BigDecimal principalDebtAmount;

    @JsonProperty("InDebt1Day_StartDate")
    private Date inDebt1DayStartDate;

    @JsonProperty("InDebt1Day_Principal")
    private BigDecimal inDebt1DayPrincipal;

    @JsonProperty("InDebt1Day_PrincipalProportion")
    private BigDecimal inDebt1DayPrincipalProportion;

    @JsonProperty("InDebt1Day_Interest")
    private BigDecimal inDebt1DayInterest;

    @JsonProperty("InDebt1Day_Exposure")
    private BigDecimal inDebt1DayExposure;

    @JsonProperty("InDebt1Day_TotalRepayments")
    private BigDecimal inDebt1DayTotalRepayments;

    @JsonProperty("InDebt7Day_StartDate")
    private Date inDebt7DayStartDate;

    @JsonProperty("InDebt7Day_Principal")
    private BigDecimal inDebt7DayPrincipal;

    @JsonProperty("InDebt7Day_PrincipalProportion")
    private BigDecimal inDebt7DayPrincipalProportion;

    @JsonProperty("InDebt7Day_Interest")
    private BigDecimal inDebt7DayInterest;

    @JsonProperty("InDebt7Day_Exposure")
    private BigDecimal inDebt7DayExposure;

    @JsonProperty("InDebt7Day_TotalRepayments")
    private BigDecimal inDebt7DayTotalRepayments;

    @JsonProperty("InDebt14Day_StartDate")
    private Date inDebt14DayStartDate;

    @JsonProperty("InDebt14Day_Principal")
    private BigDecimal inDebt14DayPrincipal;

    @JsonProperty("InDebt14Day_PrincipalProportion")
    private BigDecimal inDebt14DayPrincipalProportion;

    @JsonProperty("InDebt14Day_Interest")
    private BigDecimal inDebt14DayInterest;

    @JsonProperty("InDebt14Day_Exposure")
    private BigDecimal inDebt14DayExposure;

    @JsonProperty("InDebt14Day_TotalRepayments")
    private BigDecimal inDebt14DayTotalRepayments;

    @JsonProperty("InDebt21Day_StartDate")
    private Date inDebt21DayStartDate;

    @JsonProperty("InDebt21Day_Principal")
    private BigDecimal inDebt21DayPrincipal;

    @JsonProperty("InDebt21Day_PrincipalProportion")
    private BigDecimal inDebt21DayPrincipalProportion;

    @JsonProperty("InDebt21Day_Interest")
    private BigDecimal inDebt21DayInterest;

    @JsonProperty("InDebt21Day_Exposure")
    private BigDecimal inDebt21DayExposure;

    @JsonProperty("InDebt21Day_TotalRepayments")
    private BigDecimal inDebt21DayTotalRepayments;

    @JsonProperty("InDebt30Day_StartDate")
    private Date inDebt30DayStartDate;

    @JsonProperty("InDebt30Day_Principal")
    private BigDecimal inDebt30DayPrincipal;

    @JsonProperty("InDebt30Day_PrincipalProportion")
    private BigDecimal inDebt30DayPrincipalProportion;

    @JsonProperty("InDebt30Day_Interest")
    private BigDecimal inDebt30DayInterest;

    @JsonProperty("InDebt30Day_Exposure")
    private BigDecimal inDebt30DayExposure;

    @JsonProperty("InDebt30Day_TotalRepayments")
    private BigDecimal inDebt30DayTotalRepayments;

    @JsonProperty("InDebt60Day_StartDate")
    private Date inDebt60DayStartDate;

    @JsonProperty("InDebt60Day_Principal")
    private BigDecimal inDebt60DayPrincipal;

    @JsonProperty("InDebt60Day_PrincipalProportion")
    private BigDecimal inDebt60DayPrincipalProportion;

    @JsonProperty("InDebt60Day_Interest")
    private BigDecimal inDebt60DayInterest;

    @JsonProperty("InDebt60Day_Exposure")
    private BigDecimal inDebt60DayExposure;

    @JsonProperty("InDebt60Day_TotalRepayments")
    private BigDecimal inDebt60DayTotalRepayments;

    @JsonProperty("DebtRestructuringDate")
    private Date debtRestructuringDate;

    @JsonProperty("Principal_at_DebtRestructuring")
    private BigDecimal principalAtDebtRestructuring;

    @JsonProperty("PrincipalProportion_at_DebtRestructuring")
    private BigDecimal principalProportionAtDebtRestructuring;

    @JsonProperty("Interest_at_DebtRestructuring")
    private BigDecimal interestAtDebtRestructuring;

    @JsonProperty("Exposure_at_DebtRestructuring")
    private BigDecimal exposureAtDebtRestructuring;

    @JsonProperty("TotalRepayments_at_DebtRestructuring")
    private BigDecimal totalRepaymentsAtDebtRestructuring;

    @JsonProperty("Default_StartDate")
    private Date defaultStartDate;

    @JsonProperty("Principal_at_Default")
    private BigDecimal principalAtDefault;

    @JsonProperty("PrincipalProportion_at_Default")
    private BigDecimal principalProportionAtDefault;

    @JsonProperty("InterestDebt_at_Default")
    private BigDecimal interestDebtAtDefault;

    @JsonProperty("Exposure_at_Default")
    private BigDecimal exposureAtDefault;

    @JsonProperty("TotalRepayments_at_Default")
    private BigDecimal totalRepaymentsAtDefault;

    @JsonProperty("DefaultedOnDay")
    private Integer defaultedOnDay;

    @JsonProperty("AD")
    private Integer AD;

    @JsonProperty("EAD1")
    private BigDecimal EAD1;

    @JsonProperty("EAD2")
    private BigDecimal EAD2;

    @JsonProperty("Recovery")
    private BigDecimal recovery;

    @JsonProperty("ScoringDate")
    private Date scoringDate;

    @JsonProperty("ModelVersion")
    private Integer modelVersion;

    @JsonProperty("EL")
    private BigDecimal EL;

    @JsonProperty("Rating")
    private String rating;

    @JsonProperty("IsInactiveDuplicate")
    private Boolean isInactiveDuplicate;

    @JsonProperty("AssociatedDuplicateLoanId")
    private String associatedDuplicateLoanId;

    @JsonProperty("CancelledWithin1Month")
    private Boolean cancelledWithin1Month;

    @JsonProperty("EarlyRepaidWithin14Days")
    private Boolean earlyRepaidWithin14Days;

    @JsonProperty("PostFundingCancellation")
    private Boolean postFundingCancellation;

    @JsonProperty("IdCancellation")
    private Boolean idCancellation;
}