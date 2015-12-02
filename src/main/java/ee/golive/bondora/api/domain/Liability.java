package ee.golive.bondora.api.domain;

import java.math.BigDecimal;

public class Liability extends BondoraObject {
    private Boolean isRefinanced;
    private TypeOfLiability typeOfLiability;
    private String creditor;
    private BigDecimal monthlyPayment;
    private BigDecimal outstanding;
    private CollateralType collateralType;
}
