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
public enum AuctionPurpose {

    LoanConsolidation(0),
    RealEstate(1),
    HomeImprovement(2),
    Business(3),
    Education(4),
    Travel(5),
    Vehicle(7),
    Other(7),
    Health(8),
    Unknown(102);

    private final int value;

    AuctionPurpose(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionPurpose getEnumFromValue(int value) {
        for (AuctionPurpose testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        throw new IllegalArgumentException("AuctionPurpose value not implemented: " + value);
    }
}
