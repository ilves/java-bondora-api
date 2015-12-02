package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.LoanDebtManagementEventType;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MyInvestmentItemMixin extends LoanCommonMixin {

    @JsonProperty("LoanId")
    private String loanId;

    @JsonProperty("LoanDuration")
    private Integer loanDuration;

    @JsonProperty("PurchaseDate")
    private Date purchaseDate;

    @JsonProperty("SoldDate")
    private Date soldDate;

    @JsonProperty("PurchasePrice")
    private BigDecimal purchasePrice;

    @JsonProperty("SalePrice")
    private BigDecimal salePrice;

    @JsonProperty("ListedInSecondMarketOn")
    private Date listedInSecondMarketOn;

    @JsonProperty("LatestDebtManagementStage")
    private LoanDebtManagementEventType latestDebtManagementStage;

    @JsonProperty("LatestDebtManagementDate")
    private Date latestDebtManagementDate;

    @JsonProperty("NoteLoanTransfersMainAmount")
    private BigDecimal noteLoanTransfersMainAmount;

    @JsonProperty("NoteLoanTransfersInterestAmount")
    private BigDecimal noteLoanTransfersInterestAmount;

    @JsonProperty("NoteLoanLateChargesPaid")
    private BigDecimal noteLoanLateChargesPaid;

    @JsonProperty("NoteLoanTransfersEarningsAmount")
    private BigDecimal noteLoanTransfersEarningsAmount;

    @JsonProperty("NoteLoanTransfersTotalRepaimentsAmount")
    private BigDecimal noteLoanTransfersTotalRepaimentsAmount;
}
