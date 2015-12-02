package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LoanDebtManagementEventType {
    Message(1),
    SentToBailiff(2),
    ExpeditedPaymentOrderIssued(7),
    DebtFullyPaid(9),
    SentToDebtRegistry(14),
    DebtNotificationEmailSent(15),
    LoanDefaulted(16),
    DecisionMadeAndDeclared(20),
    DeceasedCustomer(22),
    CallMade(23),
    DebtNotificationSmsSent(24);

    private final int value;

    private LoanDebtManagementEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static LoanDebtManagementEventType getEnumFromValue(int value) {
        for (LoanDebtManagementEventType testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
