package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.SecondMarketListingStatusCode;

import java.math.BigDecimal;
import java.util.Date;

abstract class SecondaryMarketItemSummaryMixin extends BondoraObjectMixin {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Number")
    private Integer number;

    @JsonProperty("StartDate")
    private Date startDate;

    @JsonProperty("PlannedCloseDate")
    private Date plannedCloseDate;

    @JsonProperty("ActualCloseDate")
    private Date actualCloseDate;

    @JsonProperty("UserCancelledOn")
    private Date userCancelledOn;

    @JsonProperty("LoanPart_id")
    private String loanPartId;

    @JsonProperty("DesiredDiscountRate")
    private BigDecimal desiredDiscountRate;

    @JsonProperty("StatusCode")
    private SecondMarketListingStatusCode statusCode;

}
