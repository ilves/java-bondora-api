package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CollateralType {

    RealEstate(0),
    Car(1),
    PersonalGuarantee(2),
    CompanyGuarantee(3),
    OtherGuarantee(4),
    Deposit(5),
    OtherCollateral(6),
    Without(7);

    private final int value;

    private CollateralType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static CollateralType getEnumFromValue(int value) {
        for (CollateralType testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
