package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;

abstract class SecondMarketSaleResponseMixin extends BondoraObjectMixin {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("LoanPartId")
    private String loanPartId;

    @JsonProperty("DesiredDiscountRate")
    private Integer desiredDiscountRate;
}
