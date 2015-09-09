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

package ee.golive.bondora.api;

import org.junit.Test;
import org.springframework.http.MediaType;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class AuctionTemplateTest extends AbstractBondoraApiTest {

    @Test
    public void getAuction() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("auction/ca0182f1-fbcc-4b9d-a685-ee2bbdebe97b")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("auction"), MediaType.APPLICATION_JSON));

        Auction auction = bondora.getAuctionOperations().getAuction("ca0182f1-fbcc-4b9d-a685-ee2bbdebe97b");
        assertFoundJohnSmithLoan(auction);
    }

    @Test
    public void getAuctions() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("auctions")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("auctions"), MediaType.APPLICATION_JSON));

        List<Auction> auctions = bondora.getAuctionOperations().getAuctions();
        assertEquals(2, auctions.size());
        assertFoundJohnSmithLoan(auctions.get(0));
    }

    @Test
    public void getAuctionsByQuery() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("auctions?Countries=EE%2CFI&AgeMax=50")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("auctions"), MediaType.APPLICATION_JSON));

        bondora.getAuctionOperations().getAuctions("Countries=EE,FI&AgeMax=50");
    }

    @Test
    public void getBids() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("bids")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("bids"), MediaType.APPLICATION_JSON));

        List<BidSummary> bids = bondora.getAuctionOperations().getBids();
        assertEquals(3, bids.size());
    }

    @Test
    public void getBidsByQuery() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("bids?bidStatus=1&startDate=2011-01-01")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("bids"), MediaType.APPLICATION_JSON));

        List<BidSummary> bids = bondora.getAuctionOperations().getBids("bidStatus=1&startDate=2011-01-01");
        assertEquals(3, bids.size());
    }

    @Test
    public void addBid() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("bid")))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("bidResultSuccess"), MediaType.APPLICATION_JSON));

        List<Bid> bids = new LinkedList<>();
        bids.add(new Bid("50000", 50.0, 10.0));
        boolean bidResult = bondora.getAuctionOperations().bid("12345", bids);
        assertTrue(bidResult);
    }

    private void assertFoundJohnSmithLoan(Auction auction) {
        assertEquals("ca0182f1-fbcc-4b9d-a685-ee2bbdebe97b", auction.getLoanId());
    }
}
