package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.DebtManagementEvent;
import ee.golive.bondora.api.domain.LoanTransfer;
import ee.golive.bondora.api.domain.ScheduledPayment;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

abstract class LoanPartDetailsMixin extends LoanCommonMixin {

    @JsonProperty("InitialInterest")
    private BigDecimal initialInterest;

    @JsonProperty("LoanId")
    private String loanId;

    @JsonProperty("LoanDuration")
    private Integer loanDuration;

    @JsonProperty("LastPaymentDate")
    private Date lastPaymentDate;

    @JsonProperty("RepaidInterestsCurrentOwner")
    private BigDecimal repaidInterestsCurrentOwner;

    @JsonProperty("LateChargesPaidCurrentOwner")
    private BigDecimal lateChargesPaidCurrentOwner;

    @JsonProperty("RepaidTotalCurrentOwner")
    private BigDecimal repaidTotalCurrentOwner;

    @JsonProperty("TotalRepaid")
    private BigDecimal totalRepaid;

    @JsonProperty("DebtManagmentEvents")
    private List<DebtManagementEvent> debtManagmentEvents;

    @JsonProperty("LoanTransfers")
    private List<LoanTransfer> loanTransfers;

    @JsonProperty("ScheduledPayments")
    private List<ScheduledPayment> scheduledPayments;
}
