package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.CollateralType;
import ee.golive.bondora.api.domain.TypeOfLiability;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LiabilityMixin extends BondoraObjectMixin {

    @JsonProperty("IsRefinanced")
    private Boolean isRefinanced;

    @JsonProperty("TypeOfLiability")
    private TypeOfLiability typeOfLiability;

    @JsonProperty("Creditor")
    private String creditor;

    @JsonProperty("MonthlyPayment")
    private BigDecimal monthlyPayment;

    @JsonProperty("Outstanding")
    private BigDecimal outstanding;

    @JsonProperty("CollateralType")
    private CollateralType collateralType;
}
