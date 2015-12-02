package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

abstract class ScheduledPaymentMixin extends BondoraObjectMixin {

    @JsonProperty("ScheduledDate")
    private Date scheduledDate;

    @JsonProperty("PrincipalAmount")
    private BigDecimal principalAmount;

    @JsonProperty("PrincipalAmountLeft")
    private BigDecimal principalAmountLeft;

    @JsonProperty("InterestAmount")
    private BigDecimal interestAmount;

    @JsonProperty("IntrestAmountCarriedOver")
    private BigDecimal intrestAmountCarriedOver;

    @JsonProperty("PenaltyAmountCarriedOver")
    private BigDecimal penaltyAmountCarriedOver;

    @JsonProperty("TotalAmount")
    private BigDecimal totalAmount;

}
