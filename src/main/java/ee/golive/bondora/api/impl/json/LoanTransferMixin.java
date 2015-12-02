package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LoanTransferMixin extends BondoraObjectMixin {

    @JsonProperty("Date")
    private Date date;

    @JsonProperty("PrincipalAmount")
    private BigDecimal principalAmount;

    @JsonProperty("InterestAmount")
    private BigDecimal interestAmount;

    @JsonProperty("InterestAmountCarriedOver")
    private BigDecimal interestAmountCarriedOver;

    @JsonProperty("PenaltyAmountCarriedOver")
    private BigDecimal penaltyAmountCarriedOver;

    @JsonProperty("TotalAmount")
    private BigDecimal totalAmount;

}
