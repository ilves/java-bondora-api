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
import ee.golive.bondora.api.domain.CollateralType;
import ee.golive.bondora.api.domain.TypeOfLiability;

import java.math.BigDecimal;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LiabilityMixin extends BondoraObjectMixin {

    @JsonProperty("IsRefinanced")
    private Boolean isRefinanced;

    @JsonProperty("TypeOfLiability")
    private TypeOfLiability typeOfLiability;

    @JsonProperty("Creditor")
    private String creditor;

    @JsonProperty("MonthlyPayment")
    private BigDecimal monthlyPayment;

    @JsonProperty("Outstanding")
    private BigDecimal outstanding;

    @JsonProperty("CollateralType")
    private CollateralType collateralType;
}
