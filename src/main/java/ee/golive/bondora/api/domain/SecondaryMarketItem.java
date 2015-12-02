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

public class SecondaryMarketItem extends LoanCommon {

    private String id;
    private BigDecimal price;
    private BigDecimal fee;
    private BigDecimal totalCost;
    private BigDecimal outstandingPayments;
    private BigDecimal desiredDiscountRate;
    private BigDecimal xirr;
    private Date listedOnDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getOutstandingPayments() {
        return outstandingPayments;
    }

    public void setOutstandingPayments(BigDecimal outstandingPayments) {
        this.outstandingPayments = outstandingPayments;
    }

    public BigDecimal getDesiredDiscountRate() {
        return desiredDiscountRate;
    }

    public void setDesiredDiscountRate(BigDecimal desiredDiscountRate) {
        this.desiredDiscountRate = desiredDiscountRate;
    }

    public BigDecimal getXirr() {
        return xirr;
    }

    public void setXirr(BigDecimal xirr) {
        this.xirr = xirr;
    }

    public Date getListedOnDate() {
        return listedOnDate;
    }

    public void setListedOnDate(Date listedOnDate) {
        this.listedOnDate = listedOnDate;
    }
}