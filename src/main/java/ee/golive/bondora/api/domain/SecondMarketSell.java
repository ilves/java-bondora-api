package ee.golive.bondora.api.domain;

public class SecondMarketSell extends BondoraObject {
    private String loanPartId;
    private Integer desiredDiscountRate;

    public String getLoanPartId() {
        return loanPartId;
    }

    public void setLoanPartId(String loanPartId) {
        this.loanPartId = loanPartId;
    }

    public Integer getDesiredDiscountRate() {
        return desiredDiscountRate;
    }

    public void setDesiredDiscountRate(Integer desiredDiscountRate) {
        this.desiredDiscountRate = desiredDiscountRate;
    }
}
