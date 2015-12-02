package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class DeptMixin extends BondoraObjectMixin {

    @JsonProperty("StartDate")
    private Date startDate;

    @JsonProperty("EndDate")
    private Date endDate;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("MaxAmount")
    private String maxAmount;

    @JsonProperty("Industry")
    private String industry;

    @JsonProperty("Reporter")
    private String reporter;
}
