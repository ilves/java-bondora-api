package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum  AuctionQuestionEmploymentStatus {

    UnEmployed(1),
    PartiallyEmployed(2),
    FullyEmployed(3),
    SelfEmployed(4),
    Entrepreneur(5),
    Retiree(6);

    private final int value;

    private AuctionQuestionEmploymentStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionEmploymentStatus getEnumFromValue(int value) {
        for (AuctionQuestionEmploymentStatus testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
