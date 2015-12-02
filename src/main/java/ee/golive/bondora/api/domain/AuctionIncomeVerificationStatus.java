package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AuctionIncomeVerificationStatus {
    NotVerified(1),
    VerifiedByPhone(2),
    VerifiedByOtherDocument(3),
    VerifiedByBankStatement(4);

    private final int value;

    private AuctionIncomeVerificationStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionIncomeVerificationStatus getEnumFromValue(int value) {
        for (AuctionIncomeVerificationStatus testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
