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

package ee.golive.bondora.api.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public class LoanDatasetItem  extends BondoraObject {
    private Date reportAsOfEOD;
    private String loanId;
    private String loanNumber;
    private Boolean creditDecision;
    private Boolean wasFunded;
    private BigDecimal bidsInvestmentPlan;
    private BigDecimal bidsApi;
    private BigDecimal bidsManual;
    private Boolean isBusinessLoan;
    private String userName;
    private Boolean newCreditCustomer;
    private Date loanApplicationStartedDate;
    private Date loanDate;
    private Date contractEndDate;
    private Date firstPaymentDate;
    private Date maturityDateOriginal;
    private Date maturityDateLast;
    private Boolean has1DPassedFromFirstPayment;
    private Boolean has14DPassedFromFirstPayment;
    private Boolean has30DPassedFromFirstPayment;
    private Boolean has60DPassedFromFirstPayment;
    private Integer applicationSignedHour;
    private Integer applicationSignedWeekday;
    private IncomeVerificationStatus verificationType;
    private LanguageCode languageCode;
    private Integer age;
    private Sex gender;
    private String country;
    private String county;
    private String city;
    private Integer creditScore;
    private String totalNumDebts;
    private String totalMaxDebtMonths;
    private String numDebtsFinance;
    private String maxDebtMonthsFinance;
    private String numDebtsTelco;
    private String maxDebtMonthsTelco;
    private String numDebtsOther;
    private String maxDebtMonthsOther;
    private BigDecimal appliedAmount;
    private BigDecimal fundedAmount;
    private BigDecimal interest;
    private BigDecimal issuedInterest;
    private Integer loanDuration;
    private AuctionPurpose useOfLoan;
    private Integer applicationType;
    private AuctionQuestionEducation education;
    private AuctionQuestionMaritalStatus maritalStatus;
    private String nrOfDependants;
    private AuctionQuestionEmploymentStatus employmentStatus;
    private String employmentDurationCurrentEmployer;
    private String workExperience;
    private AuctionQuestionOccupationArea occupationArea;
    private AuctionQuestionHomeOwnershipType homeOwnershipType;
    private BigDecimal incomeFromPrincipalEmployer;
    private BigDecimal incomeFromPension;
    private BigDecimal incomeFromFamilyAllowance;
    private BigDecimal incomeFromSocialWelfare;
    private BigDecimal incomeFromLeavePay;
    private BigDecimal incomeFromChildSupport;
    private BigDecimal incomeOther;
    private BigDecimal incomeTotal;
    private Integer totalLiabilitiesBeforeLoan;
    private Integer debtLiabilitiesBeforeLoan;
    private Integer otherLiabilitiesBeforeLoan;
    private BigDecimal totalMonthlyLiabilities;
    private BigDecimal debtToIncome;
    private BigDecimal freeCash;
    private BigDecimal newLoanMonthlyPayment;
    private BigDecimal appliedAmountToIncome;
    private BigDecimal liabilitiesToIncome;
    private BigDecimal newPaymentToIncome;
    private Integer countOfBankCredits;
    private BigDecimal sumOfBankCredits;
    private Integer countOfPaydayLoans;
    private BigDecimal sumOfPaydayLoans;
    private Integer countOfOtherCredits;
    private BigDecimal sumOfOtherCredits;
    private Integer noOfPreviousApplications;
    private BigDecimal amountOfPreviousApplications;
    private Integer noOfPreviousLoans;
    private BigDecimal amountOfPreviousLoans;
    private Integer noOfInvestments;
    private BigDecimal amountOfInvestments;
    private Integer noOfBids;
    private BigDecimal amountOfBids;
    private BigDecimal previousRepayments;
    private BigDecimal previousLateFeesPaid;
    private BigDecimal previousEarlyRepayments;
    private Boolean hasNewSchedule;
    private String bondoraCreditHistory;
    private Boolean newOfferMade;
    private Integer monthlyPaymentDay;
    private Date lastPaymentOn;
    private BigDecimal outstandingPrincipal;
    private BigDecimal unpaidInterestOutstanding;
    private BigDecimal interestAndPenaltiesPaid;
    private Boolean cancelledWithin14Days;
    private Date gracePeriodStart;
    private Date gracePeriodEnd;
    private Boolean currentLoanHasBeenExtended;
    private Boolean inDebt1Day;
    private Boolean inDebt14Day;
    private Boolean inDebt30Day;
    private Boolean inDebt60Day;
    private Boolean isFirstPaymentDefault;
    private Boolean leftMoneyForFirstPayment;
    private Integer currentDebtDays;
    private BigDecimal principalDebtAmount;
    private Date inDebt1DayStartDate;
    private BigDecimal inDebt1DayPrincipal;
    private BigDecimal inDebt1DayPrincipalProportion;
    private BigDecimal inDebt1DayInterest;
    private BigDecimal inDebt1DayExposure;
    private BigDecimal inDebt1DayTotalRepayments;
    private Date inDebt7DayStartDate;
    private BigDecimal inDebt7DayPrincipal;
    private BigDecimal inDebt7DayPrincipalProportion;
    private BigDecimal inDebt7DayInterest;
    private BigDecimal inDebt7DayExposure;
    private BigDecimal inDebt7DayTotalRepayments;
    private Date inDebt14DayStartDate;
    private BigDecimal inDebt14DayPrincipal;
    private BigDecimal inDebt14DayPrincipalProportion;
    private BigDecimal inDebt14DayInterest;
    private BigDecimal inDebt14DayExposure;
    private BigDecimal inDebt14DayTotalRepayments;
    private Date inDebt21DayStartDate;
    private BigDecimal inDebt21DayPrincipal;
    private BigDecimal inDebt21DayPrincipalProportion;
    private BigDecimal inDebt21DayInterest;
    private BigDecimal inDebt21DayExposure;
    private BigDecimal inDebt21DayTotalRepayments;
    private Date inDebt30DayStartDate;
    private BigDecimal inDebt30DayPrincipal;
    private BigDecimal inDebt30DayPrincipalProportion;
    private BigDecimal inDebt30DayInterest;
    private BigDecimal inDebt30DayExposure;
    private BigDecimal inDebt30DayTotalRepayments;
    private Date inDebt60DayStartDate;
    private BigDecimal inDebt60DayPrincipal;
    private BigDecimal inDebt60DayPrincipalProportion;
    private BigDecimal inDebt60DayInterest;
    private BigDecimal inDebt60DayExposure;
    private BigDecimal inDebt60DayTotalRepayments;
    private Date debtRestructuringDate;
    private BigDecimal principalAtDebtRestructuring;
    private BigDecimal principalProportionAtDebtRestructuring;
    private BigDecimal interestAtDebtRestructuring;
    private BigDecimal exposureAtDebtRestructuring;
    private BigDecimal totalRepaymentsAtDebtRestructuring;
    private Date defaultStartDate;
    private BigDecimal principalAtDefault;
    private BigDecimal principalProportionAtDefault;
    private BigDecimal interestDebtAtDefault;
    private BigDecimal exposureAtDefault;
    private BigDecimal totalRepaymentsAtDefault;
    private Integer defaultedOnDay;
    private Integer AD;
    private BigDecimal EAD1;
    private BigDecimal EAD2;
    private BigDecimal recovery;
    private Date scoringDate;
    private Integer modelVersion;
    private BigDecimal EL;
    private String rating;
    private Boolean isInactiveDuplicate;
    private String associatedDuplicateLoanId;
    private Boolean cancelledWithin1Month;
    private Boolean earlyRepaidWithin14Days;
    private Boolean postFundingCancellation;
    private Boolean idCancellation;

    public Date getReportAsOfEOD() {
        return reportAsOfEOD;
    }

    public void setReportAsOfEOD(Date reportAsOfEOD) {
        this.reportAsOfEOD = reportAsOfEOD;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public Boolean getCreditDecision() {
        return creditDecision;
    }

    public void setCreditDecision(Boolean creditDecision) {
        this.creditDecision = creditDecision;
    }

    public Boolean getWasFunded() {
        return wasFunded;
    }

    public void setWasFunded(Boolean wasFunded) {
        this.wasFunded = wasFunded;
    }

    public BigDecimal getBidsInvestmentPlan() {
        return bidsInvestmentPlan;
    }

    public void setBidsInvestmentPlan(BigDecimal bidsInvestmentPlan) {
        this.bidsInvestmentPlan = bidsInvestmentPlan;
    }

    public BigDecimal getBidsApi() {
        return bidsApi;
    }

    public void setBidsApi(BigDecimal bidsApi) {
        this.bidsApi = bidsApi;
    }

    public BigDecimal getBidsManual() {
        return bidsManual;
    }

    public void setBidsManual(BigDecimal bidsManual) {
        this.bidsManual = bidsManual;
    }

    public Boolean getIsBusinessLoan() {
        return isBusinessLoan;
    }

    public void setIsBusinessLoan(Boolean isBusinessLoan) {
        this.isBusinessLoan = isBusinessLoan;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(Boolean newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    public Date getLoanApplicationStartedDate() {
        return loanApplicationStartedDate;
    }

    public void setLoanApplicationStartedDate(Date loanApplicationStartedDate) {
        this.loanApplicationStartedDate = loanApplicationStartedDate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Date getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public void setFirstPaymentDate(Date firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }

    public Date getMaturityDateOriginal() {
        return maturityDateOriginal;
    }

    public void setMaturityDateOriginal(Date maturityDateOriginal) {
        this.maturityDateOriginal = maturityDateOriginal;
    }

    public Date getMaturityDateLast() {
        return maturityDateLast;
    }

    public void setMaturityDateLast(Date maturityDateLast) {
        this.maturityDateLast = maturityDateLast;
    }

    public Boolean getHas1DPassedFromFirstPayment() {
        return has1DPassedFromFirstPayment;
    }

    public void setHas1DPassedFromFirstPayment(Boolean has1DPassedFromFirstPayment) {
        this.has1DPassedFromFirstPayment = has1DPassedFromFirstPayment;
    }

    public Boolean getHas14DPassedFromFirstPayment() {
        return has14DPassedFromFirstPayment;
    }

    public void setHas14DPassedFromFirstPayment(Boolean has14DPassedFromFirstPayment) {
        this.has14DPassedFromFirstPayment = has14DPassedFromFirstPayment;
    }

    public Boolean getHas30DPassedFromFirstPayment() {
        return has30DPassedFromFirstPayment;
    }

    public void setHas30DPassedFromFirstPayment(Boolean has30DPassedFromFirstPayment) {
        this.has30DPassedFromFirstPayment = has30DPassedFromFirstPayment;
    }

    public Boolean getHas60DPassedFromFirstPayment() {
        return has60DPassedFromFirstPayment;
    }

    public void setHas60DPassedFromFirstPayment(Boolean has60DPassedFromFirstPayment) {
        this.has60DPassedFromFirstPayment = has60DPassedFromFirstPayment;
    }

    public Integer getApplicationSignedHour() {
        return applicationSignedHour;
    }

    public void setApplicationSignedHour(Integer applicationSignedHour) {
        this.applicationSignedHour = applicationSignedHour;
    }

    public Integer getApplicationSignedWeekday() {
        return applicationSignedWeekday;
    }

    public void setApplicationSignedWeekday(Integer applicationSignedWeekday) {
        this.applicationSignedWeekday = applicationSignedWeekday;
    }

    public IncomeVerificationStatus getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(IncomeVerificationStatus verificationType) {
        this.verificationType = verificationType;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getTotalNumDebts() {
        return totalNumDebts;
    }

    public void setTotalNumDebts(String totalNumDebts) {
        this.totalNumDebts = totalNumDebts;
    }

    public String getTotalMaxDebtMonths() {
        return totalMaxDebtMonths;
    }

    public void setTotalMaxDebtMonths(String totalMaxDebtMonths) {
        this.totalMaxDebtMonths = totalMaxDebtMonths;
    }

    public String getNumDebtsFinance() {
        return numDebtsFinance;
    }

    public void setNumDebtsFinance(String numDebtsFinance) {
        this.numDebtsFinance = numDebtsFinance;
    }

    public String getMaxDebtMonthsFinance() {
        return maxDebtMonthsFinance;
    }

    public void setMaxDebtMonthsFinance(String maxDebtMonthsFinance) {
        this.maxDebtMonthsFinance = maxDebtMonthsFinance;
    }

    public String getNumDebtsTelco() {
        return numDebtsTelco;
    }

    public void setNumDebtsTelco(String numDebtsTelco) {
        this.numDebtsTelco = numDebtsTelco;
    }

    public String getMaxDebtMonthsTelco() {
        return maxDebtMonthsTelco;
    }

    public void setMaxDebtMonthsTelco(String maxDebtMonthsTelco) {
        this.maxDebtMonthsTelco = maxDebtMonthsTelco;
    }

    public String getNumDebtsOther() {
        return numDebtsOther;
    }

    public void setNumDebtsOther(String numDebtsOther) {
        this.numDebtsOther = numDebtsOther;
    }

    public String getMaxDebtMonthsOther() {
        return maxDebtMonthsOther;
    }

    public void setMaxDebtMonthsOther(String maxDebtMonthsOther) {
        this.maxDebtMonthsOther = maxDebtMonthsOther;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public BigDecimal getFundedAmount() {
        return fundedAmount;
    }

    public void setFundedAmount(BigDecimal fundedAmount) {
        this.fundedAmount = fundedAmount;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getIssuedInterest() {
        return issuedInterest;
    }

    public void setIssuedInterest(BigDecimal issuedInterest) {
        this.issuedInterest = issuedInterest;
    }

    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    public AuctionPurpose getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(AuctionPurpose useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    public Integer getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
    }

    public AuctionQuestionEducation getEducation() {
        return education;
    }

    public void setEducation(AuctionQuestionEducation education) {
        this.education = education;
    }

    public AuctionQuestionMaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(AuctionQuestionMaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNrOfDependants() {
        return nrOfDependants;
    }

    public void setNrOfDependants(String nrOfDependants) {
        this.nrOfDependants = nrOfDependants;
    }

    public AuctionQuestionEmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(AuctionQuestionEmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmploymentDurationCurrentEmployer() {
        return employmentDurationCurrentEmployer;
    }

    public void setEmploymentDurationCurrentEmployer(String employmentDurationCurrentEmployer) {
        this.employmentDurationCurrentEmployer = employmentDurationCurrentEmployer;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public AuctionQuestionOccupationArea getOccupationArea() {
        return occupationArea;
    }

    public void setOccupationArea(AuctionQuestionOccupationArea occupationArea) {
        this.occupationArea = occupationArea;
    }

    public AuctionQuestionHomeOwnershipType getHomeOwnershipType() {
        return homeOwnershipType;
    }

    public void setHomeOwnershipType(AuctionQuestionHomeOwnershipType homeOwnershipType) {
        this.homeOwnershipType = homeOwnershipType;
    }

    public BigDecimal getIncomeFromPrincipalEmployer() {
        return incomeFromPrincipalEmployer;
    }

    public void setIncomeFromPrincipalEmployer(BigDecimal incomeFromPrincipalEmployer) {
        this.incomeFromPrincipalEmployer = incomeFromPrincipalEmployer;
    }

    public BigDecimal getIncomeFromPension() {
        return incomeFromPension;
    }

    public void setIncomeFromPension(BigDecimal incomeFromPension) {
        this.incomeFromPension = incomeFromPension;
    }

    public BigDecimal getIncomeFromFamilyAllowance() {
        return incomeFromFamilyAllowance;
    }

    public void setIncomeFromFamilyAllowance(BigDecimal incomeFromFamilyAllowance) {
        this.incomeFromFamilyAllowance = incomeFromFamilyAllowance;
    }

    public BigDecimal getIncomeFromSocialWelfare() {
        return incomeFromSocialWelfare;
    }

    public void setIncomeFromSocialWelfare(BigDecimal incomeFromSocialWelfare) {
        this.incomeFromSocialWelfare = incomeFromSocialWelfare;
    }

    public BigDecimal getIncomeFromLeavePay() {
        return incomeFromLeavePay;
    }

    public void setIncomeFromLeavePay(BigDecimal incomeFromLeavePay) {
        this.incomeFromLeavePay = incomeFromLeavePay;
    }

    public BigDecimal getIncomeFromChildSupport() {
        return incomeFromChildSupport;
    }

    public void setIncomeFromChildSupport(BigDecimal incomeFromChildSupport) {
        this.incomeFromChildSupport = incomeFromChildSupport;
    }

    public BigDecimal getIncomeOther() {
        return incomeOther;
    }

    public void setIncomeOther(BigDecimal incomeOther) {
        this.incomeOther = incomeOther;
    }

    public BigDecimal getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(BigDecimal incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public Integer getTotalLiabilitiesBeforeLoan() {
        return totalLiabilitiesBeforeLoan;
    }

    public void setTotalLiabilitiesBeforeLoan(Integer totalLiabilitiesBeforeLoan) {
        this.totalLiabilitiesBeforeLoan = totalLiabilitiesBeforeLoan;
    }

    public Integer getDebtLiabilitiesBeforeLoan() {
        return debtLiabilitiesBeforeLoan;
    }

    public void setDebtLiabilitiesBeforeLoan(Integer debtLiabilitiesBeforeLoan) {
        this.debtLiabilitiesBeforeLoan = debtLiabilitiesBeforeLoan;
    }

    public Integer getOtherLiabilitiesBeforeLoan() {
        return otherLiabilitiesBeforeLoan;
    }

    public void setOtherLiabilitiesBeforeLoan(Integer otherLiabilitiesBeforeLoan) {
        this.otherLiabilitiesBeforeLoan = otherLiabilitiesBeforeLoan;
    }

    public BigDecimal getTotalMonthlyLiabilities() {
        return totalMonthlyLiabilities;
    }

    public void setTotalMonthlyLiabilities(BigDecimal totalMonthlyLiabilities) {
        this.totalMonthlyLiabilities = totalMonthlyLiabilities;
    }

    public BigDecimal getDebtToIncome() {
        return debtToIncome;
    }

    public void setDebtToIncome(BigDecimal debtToIncome) {
        this.debtToIncome = debtToIncome;
    }

    public BigDecimal getFreeCash() {
        return freeCash;
    }

    public void setFreeCash(BigDecimal freeCash) {
        this.freeCash = freeCash;
    }

    public BigDecimal getNewLoanMonthlyPayment() {
        return newLoanMonthlyPayment;
    }

    public void setNewLoanMonthlyPayment(BigDecimal newLoanMonthlyPayment) {
        this.newLoanMonthlyPayment = newLoanMonthlyPayment;
    }

    public BigDecimal getAppliedAmountToIncome() {
        return appliedAmountToIncome;
    }

    public void setAppliedAmountToIncome(BigDecimal appliedAmountToIncome) {
        this.appliedAmountToIncome = appliedAmountToIncome;
    }

    public BigDecimal getLiabilitiesToIncome() {
        return liabilitiesToIncome;
    }

    public void setLiabilitiesToIncome(BigDecimal liabilitiesToIncome) {
        this.liabilitiesToIncome = liabilitiesToIncome;
    }

    public BigDecimal getNewPaymentToIncome() {
        return newPaymentToIncome;
    }

    public void setNewPaymentToIncome(BigDecimal newPaymentToIncome) {
        this.newPaymentToIncome = newPaymentToIncome;
    }

    public Integer getCountOfBankCredits() {
        return countOfBankCredits;
    }

    public void setCountOfBankCredits(Integer countOfBankCredits) {
        this.countOfBankCredits = countOfBankCredits;
    }

    public BigDecimal getSumOfBankCredits() {
        return sumOfBankCredits;
    }

    public void setSumOfBankCredits(BigDecimal sumOfBankCredits) {
        this.sumOfBankCredits = sumOfBankCredits;
    }

    public Integer getCountOfPaydayLoans() {
        return countOfPaydayLoans;
    }

    public void setCountOfPaydayLoans(Integer countOfPaydayLoans) {
        this.countOfPaydayLoans = countOfPaydayLoans;
    }

    public BigDecimal getSumOfPaydayLoans() {
        return sumOfPaydayLoans;
    }

    public void setSumOfPaydayLoans(BigDecimal sumOfPaydayLoans) {
        this.sumOfPaydayLoans = sumOfPaydayLoans;
    }

    public Integer getCountOfOtherCredits() {
        return countOfOtherCredits;
    }

    public void setCountOfOtherCredits(Integer countOfOtherCredits) {
        this.countOfOtherCredits = countOfOtherCredits;
    }

    public BigDecimal getSumOfOtherCredits() {
        return sumOfOtherCredits;
    }

    public void setSumOfOtherCredits(BigDecimal sumOfOtherCredits) {
        this.sumOfOtherCredits = sumOfOtherCredits;
    }

    public Integer getNoOfPreviousApplications() {
        return noOfPreviousApplications;
    }

    public void setNoOfPreviousApplications(Integer noOfPreviousApplications) {
        this.noOfPreviousApplications = noOfPreviousApplications;
    }

    public BigDecimal getAmountOfPreviousApplications() {
        return amountOfPreviousApplications;
    }

    public void setAmountOfPreviousApplications(BigDecimal amountOfPreviousApplications) {
        this.amountOfPreviousApplications = amountOfPreviousApplications;
    }

    public Integer getNoOfPreviousLoans() {
        return noOfPreviousLoans;
    }

    public void setNoOfPreviousLoans(Integer noOfPreviousLoans) {
        this.noOfPreviousLoans = noOfPreviousLoans;
    }

    public BigDecimal getAmountOfPreviousLoans() {
        return amountOfPreviousLoans;
    }

    public void setAmountOfPreviousLoans(BigDecimal amountOfPreviousLoans) {
        this.amountOfPreviousLoans = amountOfPreviousLoans;
    }

    public Integer getNoOfInvestments() {
        return noOfInvestments;
    }

    public void setNoOfInvestments(Integer noOfInvestments) {
        this.noOfInvestments = noOfInvestments;
    }

    public BigDecimal getAmountOfInvestments() {
        return amountOfInvestments;
    }

    public void setAmountOfInvestments(BigDecimal amountOfInvestments) {
        this.amountOfInvestments = amountOfInvestments;
    }

    public Integer getNoOfBids() {
        return noOfBids;
    }

    public void setNoOfBids(Integer noOfBids) {
        this.noOfBids = noOfBids;
    }

    public BigDecimal getAmountOfBids() {
        return amountOfBids;
    }

    public void setAmountOfBids(BigDecimal amountOfBids) {
        this.amountOfBids = amountOfBids;
    }

    public BigDecimal getPreviousRepayments() {
        return previousRepayments;
    }

    public void setPreviousRepayments(BigDecimal previousRepayments) {
        this.previousRepayments = previousRepayments;
    }

    public BigDecimal getPreviousLateFeesPaid() {
        return previousLateFeesPaid;
    }

    public void setPreviousLateFeesPaid(BigDecimal previousLateFeesPaid) {
        this.previousLateFeesPaid = previousLateFeesPaid;
    }

    public BigDecimal getPreviousEarlyRepayments() {
        return previousEarlyRepayments;
    }

    public void setPreviousEarlyRepayments(BigDecimal previousEarlyRepayments) {
        this.previousEarlyRepayments = previousEarlyRepayments;
    }

    public Boolean getHasNewSchedule() {
        return hasNewSchedule;
    }

    public void setHasNewSchedule(Boolean hasNewSchedule) {
        this.hasNewSchedule = hasNewSchedule;
    }

    public String getBondoraCreditHistory() {
        return bondoraCreditHistory;
    }

    public void setBondoraCreditHistory(String bondoraCreditHistory) {
        this.bondoraCreditHistory = bondoraCreditHistory;
    }

    public Boolean getNewOfferMade() {
        return newOfferMade;
    }

    public void setNewOfferMade(Boolean newOfferMade) {
        this.newOfferMade = newOfferMade;
    }

    public Integer getMonthlyPaymentDay() {
        return monthlyPaymentDay;
    }

    public void setMonthlyPaymentDay(Integer monthlyPaymentDay) {
        this.monthlyPaymentDay = monthlyPaymentDay;
    }

    public Date getLastPaymentOn() {
        return lastPaymentOn;
    }

    public void setLastPaymentOn(Date lastPaymentOn) {
        this.lastPaymentOn = lastPaymentOn;
    }

    public BigDecimal getOutstandingPrincipal() {
        return outstandingPrincipal;
    }

    public void setOutstandingPrincipal(BigDecimal outstandingPrincipal) {
        this.outstandingPrincipal = outstandingPrincipal;
    }

    public BigDecimal getUnpaidInterestOutstanding() {
        return unpaidInterestOutstanding;
    }

    public void setUnpaidInterestOutstanding(BigDecimal unpaidInterestOutstanding) {
        this.unpaidInterestOutstanding = unpaidInterestOutstanding;
    }

    public BigDecimal getInterestAndPenaltiesPaid() {
        return interestAndPenaltiesPaid;
    }

    public void setInterestAndPenaltiesPaid(BigDecimal interestAndPenaltiesPaid) {
        this.interestAndPenaltiesPaid = interestAndPenaltiesPaid;
    }

    public Boolean getCancelledWithin14Days() {
        return cancelledWithin14Days;
    }

    public void setCancelledWithin14Days(Boolean cancelledWithin14Days) {
        this.cancelledWithin14Days = cancelledWithin14Days;
    }

    public Date getGracePeriodStart() {
        return gracePeriodStart;
    }

    public void setGracePeriodStart(Date gracePeriodStart) {
        this.gracePeriodStart = gracePeriodStart;
    }

    public Date getGracePeriodEnd() {
        return gracePeriodEnd;
    }

    public void setGracePeriodEnd(Date gracePeriodEnd) {
        this.gracePeriodEnd = gracePeriodEnd;
    }

    public Boolean getCurrentLoanHasBeenExtended() {
        return currentLoanHasBeenExtended;
    }

    public void setCurrentLoanHasBeenExtended(Boolean currentLoanHasBeenExtended) {
        this.currentLoanHasBeenExtended = currentLoanHasBeenExtended;
    }

    public Boolean getInDebt1Day() {
        return inDebt1Day;
    }

    public void setInDebt1Day(Boolean inDebt1Day) {
        this.inDebt1Day = inDebt1Day;
    }

    public Boolean getInDebt14Day() {
        return inDebt14Day;
    }

    public void setInDebt14Day(Boolean inDebt14Day) {
        this.inDebt14Day = inDebt14Day;
    }

    public Boolean getInDebt30Day() {
        return inDebt30Day;
    }

    public void setInDebt30Day(Boolean inDebt30Day) {
        this.inDebt30Day = inDebt30Day;
    }

    public Boolean getInDebt60Day() {
        return inDebt60Day;
    }

    public void setInDebt60Day(Boolean inDebt60Day) {
        this.inDebt60Day = inDebt60Day;
    }

    public Boolean getIsFirstPaymentDefault() {
        return isFirstPaymentDefault;
    }

    public void setIsFirstPaymentDefault(Boolean isFirstPaymentDefault) {
        this.isFirstPaymentDefault = isFirstPaymentDefault;
    }

    public Boolean getLeftMoneyForFirstPayment() {
        return leftMoneyForFirstPayment;
    }

    public void setLeftMoneyForFirstPayment(Boolean leftMoneyForFirstPayment) {
        this.leftMoneyForFirstPayment = leftMoneyForFirstPayment;
    }

    public Integer getCurrentDebtDays() {
        return currentDebtDays;
    }

    public void setCurrentDebtDays(Integer currentDebtDays) {
        this.currentDebtDays = currentDebtDays;
    }

    public BigDecimal getPrincipalDebtAmount() {
        return principalDebtAmount;
    }

    public void setPrincipalDebtAmount(BigDecimal principalDebtAmount) {
        this.principalDebtAmount = principalDebtAmount;
    }

    public Date getInDebt1DayStartDate() {
        return inDebt1DayStartDate;
    }

    public void setInDebt1DayStartDate(Date inDebt1DayStartDate) {
        this.inDebt1DayStartDate = inDebt1DayStartDate;
    }

    public BigDecimal getInDebt1DayPrincipal() {
        return inDebt1DayPrincipal;
    }

    public void setInDebt1DayPrincipal(BigDecimal inDebt1DayPrincipal) {
        this.inDebt1DayPrincipal = inDebt1DayPrincipal;
    }

    public BigDecimal getInDebt1DayPrincipalProportion() {
        return inDebt1DayPrincipalProportion;
    }

    public void setInDebt1DayPrincipalProportion(BigDecimal inDebt1DayPrincipalProportion) {
        this.inDebt1DayPrincipalProportion = inDebt1DayPrincipalProportion;
    }

    public BigDecimal getInDebt1DayInterest() {
        return inDebt1DayInterest;
    }

    public void setInDebt1DayInterest(BigDecimal inDebt1DayInterest) {
        this.inDebt1DayInterest = inDebt1DayInterest;
    }

    public BigDecimal getInDebt1DayExposure() {
        return inDebt1DayExposure;
    }

    public void setInDebt1DayExposure(BigDecimal inDebt1DayExposure) {
        this.inDebt1DayExposure = inDebt1DayExposure;
    }

    public BigDecimal getInDebt1DayTotalRepayments() {
        return inDebt1DayTotalRepayments;
    }

    public void setInDebt1DayTotalRepayments(BigDecimal inDebt1DayTotalRepayments) {
        this.inDebt1DayTotalRepayments = inDebt1DayTotalRepayments;
    }

    public Date getInDebt7DayStartDate() {
        return inDebt7DayStartDate;
    }

    public void setInDebt7DayStartDate(Date inDebt7DayStartDate) {
        this.inDebt7DayStartDate = inDebt7DayStartDate;
    }

    public BigDecimal getInDebt7DayPrincipal() {
        return inDebt7DayPrincipal;
    }

    public void setInDebt7DayPrincipal(BigDecimal inDebt7DayPrincipal) {
        this.inDebt7DayPrincipal = inDebt7DayPrincipal;
    }

    public BigDecimal getInDebt7DayPrincipalProportion() {
        return inDebt7DayPrincipalProportion;
    }

    public void setInDebt7DayPrincipalProportion(BigDecimal inDebt7DayPrincipalProportion) {
        this.inDebt7DayPrincipalProportion = inDebt7DayPrincipalProportion;
    }

    public BigDecimal getInDebt7DayInterest() {
        return inDebt7DayInterest;
    }

    public void setInDebt7DayInterest(BigDecimal inDebt7DayInterest) {
        this.inDebt7DayInterest = inDebt7DayInterest;
    }

    public BigDecimal getInDebt7DayExposure() {
        return inDebt7DayExposure;
    }

    public void setInDebt7DayExposure(BigDecimal inDebt7DayExposure) {
        this.inDebt7DayExposure = inDebt7DayExposure;
    }

    public BigDecimal getInDebt7DayTotalRepayments() {
        return inDebt7DayTotalRepayments;
    }

    public void setInDebt7DayTotalRepayments(BigDecimal inDebt7DayTotalRepayments) {
        this.inDebt7DayTotalRepayments = inDebt7DayTotalRepayments;
    }

    public Date getInDebt14DayStartDate() {
        return inDebt14DayStartDate;
    }

    public void setInDebt14DayStartDate(Date inDebt14DayStartDate) {
        this.inDebt14DayStartDate = inDebt14DayStartDate;
    }

    public BigDecimal getInDebt14DayPrincipal() {
        return inDebt14DayPrincipal;
    }

    public void setInDebt14DayPrincipal(BigDecimal inDebt14DayPrincipal) {
        this.inDebt14DayPrincipal = inDebt14DayPrincipal;
    }

    public BigDecimal getInDebt14DayPrincipalProportion() {
        return inDebt14DayPrincipalProportion;
    }

    public void setInDebt14DayPrincipalProportion(BigDecimal inDebt14DayPrincipalProportion) {
        this.inDebt14DayPrincipalProportion = inDebt14DayPrincipalProportion;
    }

    public BigDecimal getInDebt14DayInterest() {
        return inDebt14DayInterest;
    }

    public void setInDebt14DayInterest(BigDecimal inDebt14DayInterest) {
        this.inDebt14DayInterest = inDebt14DayInterest;
    }

    public BigDecimal getInDebt14DayExposure() {
        return inDebt14DayExposure;
    }

    public void setInDebt14DayExposure(BigDecimal inDebt14DayExposure) {
        this.inDebt14DayExposure = inDebt14DayExposure;
    }

    public BigDecimal getInDebt14DayTotalRepayments() {
        return inDebt14DayTotalRepayments;
    }

    public void setInDebt14DayTotalRepayments(BigDecimal inDebt14DayTotalRepayments) {
        this.inDebt14DayTotalRepayments = inDebt14DayTotalRepayments;
    }

    public Date getInDebt21DayStartDate() {
        return inDebt21DayStartDate;
    }

    public void setInDebt21DayStartDate(Date inDebt21DayStartDate) {
        this.inDebt21DayStartDate = inDebt21DayStartDate;
    }

    public BigDecimal getInDebt21DayPrincipal() {
        return inDebt21DayPrincipal;
    }

    public void setInDebt21DayPrincipal(BigDecimal inDebt21DayPrincipal) {
        this.inDebt21DayPrincipal = inDebt21DayPrincipal;
    }

    public BigDecimal getInDebt21DayPrincipalProportion() {
        return inDebt21DayPrincipalProportion;
    }

    public void setInDebt21DayPrincipalProportion(BigDecimal inDebt21DayPrincipalProportion) {
        this.inDebt21DayPrincipalProportion = inDebt21DayPrincipalProportion;
    }

    public BigDecimal getInDebt21DayInterest() {
        return inDebt21DayInterest;
    }

    public void setInDebt21DayInterest(BigDecimal inDebt21DayInterest) {
        this.inDebt21DayInterest = inDebt21DayInterest;
    }

    public BigDecimal getInDebt21DayExposure() {
        return inDebt21DayExposure;
    }

    public void setInDebt21DayExposure(BigDecimal inDebt21DayExposure) {
        this.inDebt21DayExposure = inDebt21DayExposure;
    }

    public BigDecimal getInDebt21DayTotalRepayments() {
        return inDebt21DayTotalRepayments;
    }

    public void setInDebt21DayTotalRepayments(BigDecimal inDebt21DayTotalRepayments) {
        this.inDebt21DayTotalRepayments = inDebt21DayTotalRepayments;
    }

    public Date getInDebt30DayStartDate() {
        return inDebt30DayStartDate;
    }

    public void setInDebt30DayStartDate(Date inDebt30DayStartDate) {
        this.inDebt30DayStartDate = inDebt30DayStartDate;
    }

    public BigDecimal getInDebt30DayPrincipal() {
        return inDebt30DayPrincipal;
    }

    public void setInDebt30DayPrincipal(BigDecimal inDebt30DayPrincipal) {
        this.inDebt30DayPrincipal = inDebt30DayPrincipal;
    }

    public BigDecimal getInDebt30DayPrincipalProportion() {
        return inDebt30DayPrincipalProportion;
    }

    public void setInDebt30DayPrincipalProportion(BigDecimal inDebt30DayPrincipalProportion) {
        this.inDebt30DayPrincipalProportion = inDebt30DayPrincipalProportion;
    }

    public BigDecimal getInDebt30DayInterest() {
        return inDebt30DayInterest;
    }

    public void setInDebt30DayInterest(BigDecimal inDebt30DayInterest) {
        this.inDebt30DayInterest = inDebt30DayInterest;
    }

    public BigDecimal getInDebt30DayExposure() {
        return inDebt30DayExposure;
    }

    public void setInDebt30DayExposure(BigDecimal inDebt30DayExposure) {
        this.inDebt30DayExposure = inDebt30DayExposure;
    }

    public BigDecimal getInDebt30DayTotalRepayments() {
        return inDebt30DayTotalRepayments;
    }

    public void setInDebt30DayTotalRepayments(BigDecimal inDebt30DayTotalRepayments) {
        this.inDebt30DayTotalRepayments = inDebt30DayTotalRepayments;
    }

    public Date getInDebt60DayStartDate() {
        return inDebt60DayStartDate;
    }

    public void setInDebt60DayStartDate(Date inDebt60DayStartDate) {
        this.inDebt60DayStartDate = inDebt60DayStartDate;
    }

    public BigDecimal getInDebt60DayPrincipal() {
        return inDebt60DayPrincipal;
    }

    public void setInDebt60DayPrincipal(BigDecimal inDebt60DayPrincipal) {
        this.inDebt60DayPrincipal = inDebt60DayPrincipal;
    }

    public BigDecimal getInDebt60DayPrincipalProportion() {
        return inDebt60DayPrincipalProportion;
    }

    public void setInDebt60DayPrincipalProportion(BigDecimal inDebt60DayPrincipalProportion) {
        this.inDebt60DayPrincipalProportion = inDebt60DayPrincipalProportion;
    }

    public BigDecimal getInDebt60DayInterest() {
        return inDebt60DayInterest;
    }

    public void setInDebt60DayInterest(BigDecimal inDebt60DayInterest) {
        this.inDebt60DayInterest = inDebt60DayInterest;
    }

    public BigDecimal getInDebt60DayExposure() {
        return inDebt60DayExposure;
    }

    public void setInDebt60DayExposure(BigDecimal inDebt60DayExposure) {
        this.inDebt60DayExposure = inDebt60DayExposure;
    }

    public BigDecimal getInDebt60DayTotalRepayments() {
        return inDebt60DayTotalRepayments;
    }

    public void setInDebt60DayTotalRepayments(BigDecimal inDebt60DayTotalRepayments) {
        this.inDebt60DayTotalRepayments = inDebt60DayTotalRepayments;
    }

    public Date getDebtRestructuringDate() {
        return debtRestructuringDate;
    }

    public void setDebtRestructuringDate(Date debtRestructuringDate) {
        this.debtRestructuringDate = debtRestructuringDate;
    }

    public BigDecimal getPrincipalAtDebtRestructuring() {
        return principalAtDebtRestructuring;
    }

    public void setPrincipalAtDebtRestructuring(BigDecimal principalAtDebtRestructuring) {
        this.principalAtDebtRestructuring = principalAtDebtRestructuring;
    }

    public BigDecimal getPrincipalProportionAtDebtRestructuring() {
        return principalProportionAtDebtRestructuring;
    }

    public void setPrincipalProportionAtDebtRestructuring(BigDecimal principalProportionAtDebtRestructuring) {
        this.principalProportionAtDebtRestructuring = principalProportionAtDebtRestructuring;
    }

    public BigDecimal getInterestAtDebtRestructuring() {
        return interestAtDebtRestructuring;
    }

    public void setInterestAtDebtRestructuring(BigDecimal interestAtDebtRestructuring) {
        this.interestAtDebtRestructuring = interestAtDebtRestructuring;
    }

    public BigDecimal getExposureAtDebtRestructuring() {
        return exposureAtDebtRestructuring;
    }

    public void setExposureAtDebtRestructuring(BigDecimal exposureAtDebtRestructuring) {
        this.exposureAtDebtRestructuring = exposureAtDebtRestructuring;
    }

    public BigDecimal getTotalRepaymentsAtDebtRestructuring() {
        return totalRepaymentsAtDebtRestructuring;
    }

    public void setTotalRepaymentsAtDebtRestructuring(BigDecimal totalRepaymentsAtDebtRestructuring) {
        this.totalRepaymentsAtDebtRestructuring = totalRepaymentsAtDebtRestructuring;
    }

    public Date getDefaultStartDate() {
        return defaultStartDate;
    }

    public void setDefaultStartDate(Date defaultStartDate) {
        this.defaultStartDate = defaultStartDate;
    }

    public BigDecimal getPrincipalAtDefault() {
        return principalAtDefault;
    }

    public void setPrincipalAtDefault(BigDecimal principalAtDefault) {
        this.principalAtDefault = principalAtDefault;
    }

    public BigDecimal getPrincipalProportionAtDefault() {
        return principalProportionAtDefault;
    }

    public void setPrincipalProportionAtDefault(BigDecimal principalProportionAtDefault) {
        this.principalProportionAtDefault = principalProportionAtDefault;
    }

    public BigDecimal getInterestDebtAtDefault() {
        return interestDebtAtDefault;
    }

    public void setInterestDebtAtDefault(BigDecimal interestDebtAtDefault) {
        this.interestDebtAtDefault = interestDebtAtDefault;
    }

    public BigDecimal getExposureAtDefault() {
        return exposureAtDefault;
    }

    public void setExposureAtDefault(BigDecimal exposureAtDefault) {
        this.exposureAtDefault = exposureAtDefault;
    }

    public BigDecimal getTotalRepaymentsAtDefault() {
        return totalRepaymentsAtDefault;
    }

    public void setTotalRepaymentsAtDefault(BigDecimal totalRepaymentsAtDefault) {
        this.totalRepaymentsAtDefault = totalRepaymentsAtDefault;
    }

    public Integer getDefaultedOnDay() {
        return defaultedOnDay;
    }

    public void setDefaultedOnDay(Integer defaultedOnDay) {
        this.defaultedOnDay = defaultedOnDay;
    }

    public Integer getAD() {
        return AD;
    }

    public void setAD(Integer AD) {
        this.AD = AD;
    }

    public BigDecimal getEAD1() {
        return EAD1;
    }

    public void setEAD1(BigDecimal EAD1) {
        this.EAD1 = EAD1;
    }

    public BigDecimal getEAD2() {
        return EAD2;
    }

    public void setEAD2(BigDecimal EAD2) {
        this.EAD2 = EAD2;
    }

    public BigDecimal getRecovery() {
        return recovery;
    }

    public void setRecovery(BigDecimal recovery) {
        this.recovery = recovery;
    }

    public Date getScoringDate() {
        return scoringDate;
    }

    public void setScoringDate(Date scoringDate) {
        this.scoringDate = scoringDate;
    }

    public Integer getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(Integer modelVersion) {
        this.modelVersion = modelVersion;
    }

    public BigDecimal getEL() {
        return EL;
    }

    public void setEL(BigDecimal EL) {
        this.EL = EL;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Boolean getIsInactiveDuplicate() {
        return isInactiveDuplicate;
    }

    public void setIsInactiveDuplicate(Boolean isInactiveDuplicate) {
        this.isInactiveDuplicate = isInactiveDuplicate;
    }

    public String getAssociatedDuplicateLoanId() {
        return associatedDuplicateLoanId;
    }

    public void setAssociatedDuplicateLoanId(String associatedDuplicateLoanId) {
        this.associatedDuplicateLoanId = associatedDuplicateLoanId;
    }

    public Boolean getCancelledWithin1Month() {
        return cancelledWithin1Month;
    }

    public void setCancelledWithin1Month(Boolean cancelledWithin1Month) {
        this.cancelledWithin1Month = cancelledWithin1Month;
    }

    public Boolean getEarlyRepaidWithin14Days() {
        return earlyRepaidWithin14Days;
    }

    public void setEarlyRepaidWithin14Days(Boolean earlyRepaidWithin14Days) {
        this.earlyRepaidWithin14Days = earlyRepaidWithin14Days;
    }

    public Boolean getPostFundingCancellation() {
        return postFundingCancellation;
    }

    public void setPostFundingCancellation(Boolean postFundingCancellation) {
        this.postFundingCancellation = postFundingCancellation;
    }

    public Boolean getIdCancellation() {
        return idCancellation;
    }

    public void setIdCancellation(Boolean idCancellation) {
        this.idCancellation = idCancellation;
    }
}
