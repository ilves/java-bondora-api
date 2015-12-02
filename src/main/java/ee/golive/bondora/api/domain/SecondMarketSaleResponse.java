package ee.golive.bondora.api.domain;

public class SecondMarketSaleResponse extends BondoraObject {
    private String id;
    private String loanPartId;
    private Integer desiredDiscountRate;

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

    public Integer getDesiredDiscountRate() {
        return desiredDiscountRate;
    }

    public void setDesiredDiscountRate(Integer desiredDiscountRate) {
        this.desiredDiscountRate = desiredDiscountRate;
    }
}
