package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AuctionQuestionMaritalStatus {
    Married(1),
    Cohabitant(2),
    Single(3),
    Divorced(4),
    Widow(5);

    private final int value;

    private AuctionQuestionMaritalStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionMaritalStatus getEnumFromValue(int value) {
        for (AuctionQuestionMaritalStatus testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
