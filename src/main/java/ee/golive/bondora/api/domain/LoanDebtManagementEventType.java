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
public enum LoanDebtManagementEventType {
    Unknown(0),
    Message(1),
    SentToBailiff(2),
    ExpeditedPaymentOrderIssued(7),
    DebtFullyPaid(9),
    SentToDebtRegistry(14),
    DebtNotificationEmailSent(15),
    LoanDefaulted(16),
    DecisionMadeAndDeclared(20),
    DeceasedCustomer(22),
    CallMade(23),
    DebtNotificationSmsSent(24),
    Un1(25),
    Un2(26),
    Un3(27),
    Un4(28),
    Un5(29),
    InHouseCollection(30),
    DCA1(31),
    CurePeriod(32),
    DCA2(33),
    DCA3(34),
    PaymentOrder(35),
    CivilCase(36),
    Bailiff(37),
    Deceased(38),
    DebtRestructuring(39),
    Bankruptcy(40),
    CriminalCase(41),
    WriteOff(42);

    private final int value;

    LoanDebtManagementEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static LoanDebtManagementEventType getEnumFromValue(int value) {
        for (LoanDebtManagementEventType testEnum : values()) {
            if (testEnum.getValue() == value) {
                return testEnum;
            }
        }
        return Unknown;
    }
}
