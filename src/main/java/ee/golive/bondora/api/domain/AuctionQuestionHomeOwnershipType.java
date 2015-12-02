package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AuctionQuestionHomeOwnershipType {

    Homeless(0),
    Owner(1),
    LivingWithParents(2),
    TenantFurnished(3),
    TenantUnfurnished(4),
    CouncilTenant(5),
    JointTenant(6),
    JointOwner(7),
    OwnerMortgage(8),
    OwnerEncumbrance(9);

    private final int value;

    private AuctionQuestionHomeOwnershipType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionHomeOwnershipType getEnumFromValue(int value) {
        for (AuctionQuestionHomeOwnershipType testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
