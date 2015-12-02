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

import java.math.BigDecimal;
import java.util.Date;

public class SecondaryMarketItemSummary extends BondoraObject {

    private String id;
    private Integer number;
    private Date startDate;
    private Date plannedCloseDate;
    private Date actualCloseDate;
    private Date userCancelledOn;
    private String loanPartId;
    private BigDecimal desiredDiscountRate;
    private SecondMarketListingStatusCode statusCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPlannedCloseDate() {
        return plannedCloseDate;
    }

    public void setPlannedCloseDate(Date plannedCloseDate) {
        this.plannedCloseDate = plannedCloseDate;
    }

    public Date getActualCloseDate() {
        return actualCloseDate;
    }

    public void setActualCloseDate(Date actualCloseDate) {
        this.actualCloseDate = actualCloseDate;
    }

    public Date getUserCancelledOn() {
        return userCancelledOn;
    }

    public void setUserCancelledOn(Date userCancelledOn) {
        this.userCancelledOn = userCancelledOn;
    }

    public String getLoanPartId() {
        return loanPartId;
    }

    public void setLoanPartId(String loanPartId) {
        this.loanPartId = loanPartId;
    }

    public BigDecimal getDesiredDiscountRate() {
        return desiredDiscountRate;
    }

    public void setDesiredDiscountRate(BigDecimal desiredDiscountRate) {
        this.desiredDiscountRate = desiredDiscountRate;
    }

    public SecondMarketListingStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(SecondMarketListingStatusCode statusCode) {
        this.statusCode = statusCode;
    }
}