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
public enum AuctionIncomeVerificationStatus {

    Unknown(-1),
    NotVerified(1),
    VerifiedByPhone(2),
    VerifiedByOtherDocument(3),
    VerifiedByBankStatement(4);

    private final int value;

    AuctionIncomeVerificationStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static AuctionIncomeVerificationStatus getEnumFromValue(Integer value) {
        for (AuctionIncomeVerificationStatus testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        return Unknown;
    }
}
