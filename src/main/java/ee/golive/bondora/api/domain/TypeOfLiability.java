package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TypeOfLiability {

    Loan(0),
    Lease(1),
    CreditCard(2),
    RevolvingCredit(3),
    PersonalGuaranty(4),
    BankGuaranty(5),
    Other(6),
    DebtCollection(7),
    Communication(101),
    Tv(102),
    Housing(103),
    School(104),
    OtherPayments(105),
    Provision(106),
    PaydayLoan(107);

    private final int value;

    private TypeOfLiability(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static TypeOfLiability getEnumFromValue(int value) {
        for (TypeOfLiability testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
