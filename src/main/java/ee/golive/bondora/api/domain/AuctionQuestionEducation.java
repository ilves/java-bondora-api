package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AuctionQuestionEducation {
    Primary(1),
    Basic(2),
    Vocational(3),
    Secondary(4),
    Higher(5);

    private final int value;

    private AuctionQuestionEducation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionEducation getEnumFromValue(int value) {
        for (AuctionQuestionEducation testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
