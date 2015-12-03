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
import java.util.List;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public class LoanPartDetails extends BondoraObject {
    private BigDecimal initialInterest;
    private String loanId;
    private Integer loanDuration;
    private Date lastPaymentDate;
    private BigDecimal repaidInterestsCurrentOwner;
    private BigDecimal lateChargesPaidCurrentOwner;
    private BigDecimal repaidTotalCurrentOwner;
    private BigDecimal totalRepaid;
    private List<DebtManagementEvent> debtManagmentEvents;
    private List<LoanTransfer> loanTransfers;
    private List<ScheduledPayment> scheduledPayments;

    public BigDecimal getInitialInterest() {
        return initialInterest;
    }

    public void setInitialInterest(BigDecimal initialInterest) {
        this.initialInterest = initialInterest;
    }

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

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public BigDecimal getRepaidInterestsCurrentOwner() {
        return repaidInterestsCurrentOwner;
    }

    public void setRepaidInterestsCurrentOwner(BigDecimal repaidInterestsCurrentOwner) {
        this.repaidInterestsCurrentOwner = repaidInterestsCurrentOwner;
    }

    public BigDecimal getLateChargesPaidCurrentOwner() {
        return lateChargesPaidCurrentOwner;
    }

    public void setLateChargesPaidCurrentOwner(BigDecimal lateChargesPaidCurrentOwner) {
        this.lateChargesPaidCurrentOwner = lateChargesPaidCurrentOwner;
    }

    public BigDecimal getRepaidTotalCurrentOwner() {
        return repaidTotalCurrentOwner;
    }

    public void setRepaidTotalCurrentOwner(BigDecimal repaidTotalCurrentOwner) {
        this.repaidTotalCurrentOwner = repaidTotalCurrentOwner;
    }

    public BigDecimal getTotalRepaid() {
        return totalRepaid;
    }

    public void setTotalRepaid(BigDecimal totalRepaid) {
        this.totalRepaid = totalRepaid;
    }

    public List<DebtManagementEvent> getDebtManagmentEvents() {
        return debtManagmentEvents;
    }

    public void setDebtManagmentEvents(List<DebtManagementEvent> debtManagmentEvents) {
        this.debtManagmentEvents = debtManagmentEvents;
    }

    public List<LoanTransfer> getLoanTransfers() {
        return loanTransfers;
    }

    public void setLoanTransfers(List<LoanTransfer> loanTransfers) {
        this.loanTransfers = loanTransfers;
    }

    public List<ScheduledPayment> getScheduledPayments() {
        return scheduledPayments;
    }

    public void setScheduledPayments(List<ScheduledPayment> scheduledPayments) {
        this.scheduledPayments = scheduledPayments;
    }
}