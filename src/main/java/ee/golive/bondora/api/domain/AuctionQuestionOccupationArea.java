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
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public enum  AuctionQuestionOccupationArea {

    Unknown(-1),
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

    AuctionQuestionOccupationArea(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionQuestionOccupationArea getEnumFromValue(Integer value) {
        for (AuctionQuestionOccupationArea testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        return Unknown;
    }
}
