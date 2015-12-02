package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SecondMarketSellMixin extends BondoraObjectMixin {

    @JsonProperty("LoanPartId")
    private String loanPartId;

    @JsonProperty("DesiredDiscountRate")
    private Integer desiredDiscountRate;
}
