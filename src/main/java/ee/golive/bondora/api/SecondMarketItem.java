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

package ee.golive.bondora.api;

import java.util.Date;

public class SecondMarketItem extends BondoraObject {

    private String id;
    private String loanPartId;
    private Double amount;
    private String auctionId;
    private String country;
    private String creditScore;
    private String rating;
    private String interest;
    private Integer loanStatusCode;
    private String userName;
    private Double xirr;
    private String auctionName;
    private Integer auctionNumber;
    private Integer auctionBidNumber;
    private Date dateOfBirth;
    private Date signedDate;
    private Date reScheduledOn;
    private Date debtOccuredOn;
    private Date debtOccuredOnForSecondary;
    private Integer nextPaymentNr;
    private Date nextPaymentDate;
    private Double nextPaymentSum;
    private Integer nrOfScheduledPayments;
    private Double principalRepaid;
    private Double interestRepaid;
    private Double lateAmountPaid;
    private Double principalRemaining;
    private Double principalLateAmount;
    private Double interestLateAmount;
    private Double penaltyLateAmount;
    private Double lateAmountTotal;
    private Double price;
    private Double fee;
    private Double totalCost;
    private Double outstandingPayments;
    private Double desiredDiscountRate;
    private Date listedOnDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanPartId() {
        return loanPartId;
    }

    public void setLoanPartId(String loanPartId) {
        this.loanPartId = loanPartId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getLoanStatusCode() {
        return loanStatusCode;
    }

    public void setLoanStatusCode(Integer loanStatusCode) {
        this.loanStatusCode = loanStatusCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getXirr() {
        return xirr;
    }

    public void setXirr(Double xirr) {
        this.xirr = xirr;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public Integer getAuctionNumber() {
        return auctionNumber;
    }

    public void setAuctionNumber(Integer auctionNumber) {
        this.auctionNumber = auctionNumber;
    }

    public Integer getAuctionBidNumber() {
        return auctionBidNumber;
    }

    public void setAuctionBidNumber(Integer auctionBidNumber) {
        this.auctionBidNumber = auctionBidNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public Date getReScheduledOn() {
        return reScheduledOn;
    }

    public void setReScheduledOn(Date reScheduledOn) {
        this.reScheduledOn = reScheduledOn;
    }

    public Date getDebtOccuredOn() {
        return debtOccuredOn;
    }

    public void setDebtOccuredOn(Date debtOccuredOn) {
        this.debtOccuredOn = debtOccuredOn;
    }

    public Date getDebtOccuredOnForSecondary() {
        return debtOccuredOnForSecondary;
    }

    public void setDebtOccuredOnForSecondary(Date debtOccuredOnForSecondary) {
        this.debtOccuredOnForSecondary = debtOccuredOnForSecondary;
    }

    public Integer getNextPaymentNr() {
        return nextPaymentNr;
    }

    public void setNextPaymentNr(Integer nextPaymentNr) {
        this.nextPaymentNr = nextPaymentNr;
    }

    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public Double getNextPaymentSum() {
        return nextPaymentSum;
    }

    public void setNextPaymentSum(Double nextPaymentSum) {
        this.nextPaymentSum = nextPaymentSum;
    }

    public Integer getNrOfScheduledPayments() {
        return nrOfScheduledPayments;
    }

    public void setNrOfScheduledPayments(Integer nrOfScheduledPayments) {
        this.nrOfScheduledPayments = nrOfScheduledPayments;
    }

    public Double getPrincipalRepaid() {
        return principalRepaid;
    }

    public void setPrincipalRepaid(Double principalRepaid) {
        this.principalRepaid = principalRepaid;
    }

    public Double getLateAmountPaid() {
        return lateAmountPaid;
    }

    public void setLateAmountPaid(Double lateAmountPaid) {
        this.lateAmountPaid = lateAmountPaid;
    }

    public Double getInterestRepaid() {
        return interestRepaid;
    }

    public void setInterestRepaid(Double interestRepaid) {
        this.interestRepaid = interestRepaid;
    }

    public Double getPrincipalRemaining() {
        return principalRemaining;
    }

    public void setPrincipalRemaining(Double principalRemaining) {
        this.principalRemaining = principalRemaining;
    }

    public Double getPrincipalLateAmount() {
        return principalLateAmount;
    }

    public void setPrincipalLateAmount(Double principalLateAmount) {
        this.principalLateAmount = principalLateAmount;
    }

    public Double getInterestLateAmount() {
        return interestLateAmount;
    }

    public void setInterestLateAmount(Double interestLateAmount) {
        this.interestLateAmount = interestLateAmount;
    }

    public Double getPenaltyLateAmount() {
        return penaltyLateAmount;
    }

    public void setPenaltyLateAmount(Double penaltyLateAmount) {
        this.penaltyLateAmount = penaltyLateAmount;
    }

    public Double getLateAmountTotal() {
        return lateAmountTotal;
    }

    public void setLateAmountTotal(Double lateAmountTotal) {
        this.lateAmountTotal = lateAmountTotal;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getOutstandingPayments() {
        return outstandingPayments;
    }

    public void setOutstandingPayments(Double outstandingPayments) {
        this.outstandingPayments = outstandingPayments;
    }

    public Double getDesiredDiscountRate() {
        return desiredDiscountRate;
    }

    public void setDesiredDiscountRate(Double desiredDiscountRate) {
        this.desiredDiscountRate = desiredDiscountRate;
    }

    public Date getListedOnDate() {
        return listedOnDate;
    }

    public void setListedOnDate(Date listedOnDate) {
        this.listedOnDate = listedOnDate;
    }
}