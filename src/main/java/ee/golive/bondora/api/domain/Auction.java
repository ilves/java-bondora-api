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
public class Auction extends BondoraObject {

    private String loanId;
    private String auctionId;
    private Integer loanNumber;
    private String userName;
    private Integer newCreditCustomer;
    private Date loanApplicationStartedDate;
    private Integer applicationSignedHour;
    private Integer applicationSignedWeekday;
    private AuctionIncomeVerificationStatus verificationType;
    private LanguageCode languageCode;
    private Integer age;
    private Sex gender;
    private String country;
    private Integer creditScore;
    private BigDecimal appliedAmount;
    private BigDecimal interest;
    private BigDecimal loanDuration;
    private String county;
    private String city;
    private AuctionPurpose useOfLoan;
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
    private Integer monthlyPaymentDay;
    private Date scoringDate;
    private Integer modelVersion;
    private BigDecimal expectedLoss;
    private String rating;
    private BigDecimal EADRate;
    private BigDecimal lossGivenDefault;
    private BigDecimal maturityFactor;
    private BigDecimal probabilityOfDefault;
    private BigDecimal expectedReturnAlpha;
    private BigDecimal interestRateAlpha;
    private BigDecimal liabilitiesTotal;
    private Date listedOnUTC;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public Integer getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(Integer loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(Integer newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    public Date getLoanApplicationStartedDate() {
        return loanApplicationStartedDate;
    }

    public void setLoanApplicationStartedDate(Date loanApplicationStartedDate) {
        this.loanApplicationStartedDate = loanApplicationStartedDate;
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

    public AuctionIncomeVerificationStatus getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(AuctionIncomeVerificationStatus verificationType) {
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

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(BigDecimal loanDuration) {
        this.loanDuration = loanDuration;
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

    public AuctionPurpose getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(AuctionPurpose useOfLoan) {
        this.useOfLoan = useOfLoan;
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

    public Integer getMonthlyPaymentDay() {
        return monthlyPaymentDay;
    }

    public void setMonthlyPaymentDay(Integer monthlyPaymentDay) {
        this.monthlyPaymentDay = monthlyPaymentDay;
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

    public BigDecimal getExpectedLoss() {
        return expectedLoss;
    }

    public void setExpectedLoss(BigDecimal expectedLoss) {
        this.expectedLoss = expectedLoss;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public BigDecimal getEADRate() {
        return EADRate;
    }

    public void setEADRate(BigDecimal EADRate) {
        this.EADRate = EADRate;
    }

    public BigDecimal getLossGivenDefault() {
        return lossGivenDefault;
    }

    public void setLossGivenDefault(BigDecimal lossGivenDefault) {
        this.lossGivenDefault = lossGivenDefault;
    }

    public BigDecimal getMaturityFactor() {
        return maturityFactor;
    }

    public void setMaturityFactor(BigDecimal maturityFactor) {
        this.maturityFactor = maturityFactor;
    }

    public BigDecimal getProbabilityOfDefault() {
        return probabilityOfDefault;
    }

    public void setProbabilityOfDefault(BigDecimal probabilityOfDefault) {
        this.probabilityOfDefault = probabilityOfDefault;
    }

    public BigDecimal getExpectedReturnAlpha() {
        return expectedReturnAlpha;
    }

    public void setExpectedReturnAlpha(BigDecimal expectedReturnAlpha) {
        this.expectedReturnAlpha = expectedReturnAlpha;
    }

    public BigDecimal getInterestRateAlpha() {
        return interestRateAlpha;
    }

    public void setInterestRateAlpha(BigDecimal interestRateAlpha) {
        this.interestRateAlpha = interestRateAlpha;
    }

    public BigDecimal getLiabilitiesTotal() {
        return liabilitiesTotal;
    }

    public void setLiabilitiesTotal(BigDecimal liabilitiesTotal) {
        this.liabilitiesTotal = liabilitiesTotal;
    }

    public Date getListedOnUTC() {
        return listedOnUTC;
    }

    public void setListedOnUTC(Date listedOnUTC) {
        this.listedOnUTC = listedOnUTC;
    }
}