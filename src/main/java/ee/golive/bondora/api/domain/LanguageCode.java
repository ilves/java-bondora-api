package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LanguageCode {
    Et(1),
    En(2),
    Ru(3),
    Fi(4),
    De(5),
    Es(6),
    Pl(7),
    Lv(8),
    Sk(9),
    Sl(10),
    Bg(11),
    Hr(12),
    Cs(13),
    Da(14),
    Fr(15),
    El(16),
    Hu(17),
    Lt(18),
    Nl(19),
    Pt(20),
    Ro(21),
    Sv(22),
    It(23);

    private final int value;

    private LanguageCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static LanguageCode getEnumFromValue(int value) {
        for (LanguageCode testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException();
    }
}
