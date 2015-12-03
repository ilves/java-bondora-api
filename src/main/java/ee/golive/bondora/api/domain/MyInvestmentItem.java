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
public class MyInvestmentItem extends LoanCommon {

    private String loanId;
    private Integer loanDuration;
    private Date purchaseDate;
    private Date soldDate;
    private BigDecimal purchasePrice;
    private BigDecimal salePrice;
    private Date listedInSecondMarketOn;
    private LoanDebtManagementEventType latestDebtManagementStage;
    private Date latestDebtManagementDate;
    private BigDecimal noteLoanTransfersMainAmount;
    private BigDecimal noteLoanTransfersInterestAmount;
    private BigDecimal noteLoanLateChargesPaid;
    private BigDecimal noteLoanTransfersEarningsAmount;
    private BigDecimal noteLoanTransfersTotalRepaimentsAmount;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Date getListedInSecondMarketOn() {
        return listedInSecondMarketOn;
    }

    public void setListedInSecondMarketOn(Date listedInSecondMarketOn) {
        this.listedInSecondMarketOn = listedInSecondMarketOn;
    }

    public LoanDebtManagementEventType getLatestDebtManagementStage() {
        return latestDebtManagementStage;
    }

    public void setLatestDebtManagementStage(LoanDebtManagementEventType latestDebtManagementStage) {
        this.latestDebtManagementStage = latestDebtManagementStage;
    }

    public Date getLatestDebtManagementDate() {
        return latestDebtManagementDate;
    }

    public void setLatestDebtManagementDate(Date latestDebtManagementDate) {
        this.latestDebtManagementDate = latestDebtManagementDate;
    }

    public BigDecimal getNoteLoanTransfersMainAmount() {
        return noteLoanTransfersMainAmount;
    }

    public void setNoteLoanTransfersMainAmount(BigDecimal noteLoanTransfersMainAmount) {
        this.noteLoanTransfersMainAmount = noteLoanTransfersMainAmount;
    }

    public BigDecimal getNoteLoanTransfersInterestAmount() {
        return noteLoanTransfersInterestAmount;
    }

    public void setNoteLoanTransfersInterestAmount(BigDecimal noteLoanTransfersInterestAmount) {
        this.noteLoanTransfersInterestAmount = noteLoanTransfersInterestAmount;
    }

    public BigDecimal getNoteLoanLateChargesPaid() {
        return noteLoanLateChargesPaid;
    }

    public void setNoteLoanLateChargesPaid(BigDecimal noteLoanLateChargesPaid) {
        this.noteLoanLateChargesPaid = noteLoanLateChargesPaid;
    }

    public BigDecimal getNoteLoanTransfersEarningsAmount() {
        return noteLoanTransfersEarningsAmount;
    }

    public void setNoteLoanTransfersEarningsAmount(BigDecimal noteLoanTransfersEarningsAmount) {
        this.noteLoanTransfersEarningsAmount = noteLoanTransfersEarningsAmount;
    }

    public BigDecimal getNoteLoanTransfersTotalRepaimentsAmount() {
        return noteLoanTransfersTotalRepaimentsAmount;
    }

    public void setNoteLoanTransfersTotalRepaimentsAmount(BigDecimal noteLoanTransfersTotalRepaimentsAmount) {
        this.noteLoanTransfersTotalRepaimentsAmount = noteLoanTransfersTotalRepaimentsAmount;
    }
}