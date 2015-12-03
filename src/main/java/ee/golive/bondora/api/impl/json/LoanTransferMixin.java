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

package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LoanTransferMixin extends BondoraObjectMixin {

    @JsonProperty("Date")
    private Date date;

    @JsonProperty("PrincipalAmount")
    private BigDecimal principalAmount;

    @JsonProperty("InterestAmount")
    private BigDecimal interestAmount;

    @JsonProperty("InterestAmountCarriedOver")
    private BigDecimal interestAmountCarriedOver;

    @JsonProperty("PenaltyAmountCarriedOver")
    private BigDecimal penaltyAmountCarriedOver;

    @JsonProperty("TotalAmount")
    private BigDecimal totalAmount;

}
