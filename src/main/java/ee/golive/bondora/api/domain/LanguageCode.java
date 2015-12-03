/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.golive.bondora.api.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Taavi Ilves, Golive O�, http://www.golive.ee/
 */
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

    LanguageCode(int value) {
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
