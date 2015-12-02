package ee.golive.bondora.api.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ScheduledPayment extends BondoraObject {
    private Date scheduledDate;
    private BigDecimal principalAmount;
    private BigDecimal principalAmountLeft;
    private BigDecimal interestAmount;
    private BigDecimal intrestAmountCarriedOver;
    private BigDecimal penaltyAmountCarriedOver;
    private BigDecimal totalAmount;

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public BigDecimal getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(BigDecimal principalAmount) {
        this.principalAmount = principalAmount;
    }

    public BigDecimal getPrincipalAmountLeft() {
        return principalAmountLeft;
    }

    public void setPrincipalAmountLeft(BigDecimal principalAmountLeft) {
        this.principalAmountLeft = principalAmountLeft;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getIntrestAmountCarriedOver() {
        return intrestAmountCarriedOver;
    }

    public void setIntrestAmountCarriedOver(BigDecimal intrestAmountCarriedOver) {
        this.intrestAmountCarriedOver = intrestAmountCarriedOver;
    }

    public BigDecimal getPenaltyAmountCarriedOver() {
        return penaltyAmountCarriedOver;
    }

    public void setPenaltyAmountCarriedOver(BigDecimal penaltyAmountCarriedOver) {
        this.penaltyAmountCarriedOver = penaltyAmountCarriedOver;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
