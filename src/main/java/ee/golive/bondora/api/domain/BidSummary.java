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

public class BidSummary extends BondoraObject {
    private String id;
    private String auctionId;
    private BigDecimal requestedBidAmount;
    private BigDecimal actualBidAmount;
    private BigDecimal requestedBidMinimumLimit;
    private Date bidRequestedDate;
    private Date bidProcessedDate;
    private Boolean isRequestBeingProcessed;
    private ApiAuctionBidRequestStatus statusCode;
    private ApiBidFailureReason failureReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public BigDecimal getRequestedBidAmount() {
        return requestedBidAmount;
    }

    public void setRequestedBidAmount(BigDecimal requestedBidAmount) {
        this.requestedBidAmount = requestedBidAmount;
    }

    public BigDecimal getActualBidAmount() {
        return actualBidAmount;
    }

    public void setActualBidAmount(BigDecimal actualBidAmount) {
        this.actualBidAmount = actualBidAmount;
    }

    public BigDecimal getRequestedBidMinimumLimit() {
        return requestedBidMinimumLimit;
    }

    public void setRequestedBidMinimumLimit(BigDecimal requestedBidMinimumLimit) {
        this.requestedBidMinimumLimit = requestedBidMinimumLimit;
    }

    public Date getBidRequestedDate() {
        return bidRequestedDate;
    }

    public void setBidRequestedDate(Date bidRequestedDate) {
        this.bidRequestedDate = bidRequestedDate;
    }

    public Date getBidProcessedDate() {
        return bidProcessedDate;
    }

    public void setBidProcessedDate(Date bidProcessedDate) {
        this.bidProcessedDate = bidProcessedDate;
    }

    public Boolean getIsRequestBeingProcessed() {
        return isRequestBeingProcessed;
    }

    public void setIsRequestBeingProcessed(Boolean isRequestBeingProcessed) {
        this.isRequestBeingProcessed = isRequestBeingProcessed;
    }

    public ApiAuctionBidRequestStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(ApiAuctionBidRequestStatus statusCode) {
        this.statusCode = statusCode;
    }

    public ApiBidFailureReason getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(ApiBidFailureReason failureReason) {
        this.failureReason = failureReason;
    }
}
