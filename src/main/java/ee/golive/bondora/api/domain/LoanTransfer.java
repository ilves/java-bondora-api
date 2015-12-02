package ee.golive.bondora.api.domain;

import java.math.BigDecimal;
import java.util.Date;

public class LoanTransfer extends BondoraObject {
    private Date date;
    private BigDecimal principalAmount;
    private BigDecimal interestAmount;
    private BigDecimal interestAmountCarriedOver;
    private BigDecimal penaltyAmountCarriedOver;
    private BigDecimal totalAmount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(BigDecimal principalAmount) {
        this.principalAmount = principalAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getInterestAmountCarriedOver() {
        return interestAmountCarriedOver;
    }

    public void setInterestAmountCarriedOver(BigDecimal interestAmountCarriedOver) {
        this.interestAmountCarriedOver = interestAmountCarriedOver;
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
