package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum  AuctionQuestionOccupationArea {

    Other(1),
    Mining(2),
    Processing(3),
    Energy(4),
    Utilities(5),
    Construction(6),
    Retail(7),
    Transport(8),
    Hospitality(9),
    Telecom(10),
    Finance(11),
    RealEstate(12),
    Research(13),
    Administrative(14),
    CivilService(15),
    Education(16),
    Healthcare(17),
    Art(18),
    Agriculture(19);

    private final int value;

    private AuctionQuestionOccupationArea(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionOccupationArea getEnumFromValue(int value) {
        for (AuctionQuestionOccupationArea testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
