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

import ee.golive.bondora.api.domain.*;
import ee.golive.bondora.api.domain.requests.SecondMarketBuyRequest;
import ee.golive.bondora.api.domain.requests.SecondMarketSaleRequest;
import org.junit.Test;
import org.springframework.http.MediaType;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class SecondaryMarketImplTest extends AbstractBondoraApiTest {

    @Test
    public void getSecondaryMarketItems() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("secondarymarket")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("secondarymarket"), MediaType.APPLICATION_JSON));
        List<SecondaryMarketItem> items = bondora.getSecondMarketOperations().getItems().getPayload();
        assertEquals(2, items.size());
    }

    @Test
    public void getItem() throws Exception {
        String id = "422038e9-13e1-4f83-9e33-964611e11336";
        mockServer.expect(requestTo(bondoraUrl("secondarymarket/"+id)))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("secondaryMarketItem"), MediaType.APPLICATION_JSON));
        SecondaryMarketItemSummary item = bondora.getSecondMarketOperations().getItem(id).getPayload();
        assertEquals(BigDecimal.valueOf(700.0), item.getDesiredDiscountRate());
    }


    @Test
    public void getLoanPart() throws Exception {
        String id = "422038e9-13e1-4f83-9e33-964611e11336";
        mockServer.expect(requestTo(bondoraUrl("secondarymarket/loanpart/"+id)))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("loanpart"), MediaType.APPLICATION_JSON));
        LoanPartDetails details = bondora.getSecondMarketOperations().getLoanPart(id).getPayload();
        assertEquals(2, details.getDebtManagmentEvents().size());
    }

    @Test
    public void buy() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("secondarymarket/buy")))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("success"), MediaType.APPLICATION_JSON));
        SecondMarketBuyRequest request = new SecondMarketBuyRequest();
        request.getItemIds().add("422038e9-13e1-4f83-9e33-964611e11336");
        assertEquals(true, bondora.getSecondMarketOperations().buy(request).isSuccess());
    }

    @Test
    public void sell() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("secondarymarket/sell")))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("secondMarketSell"), MediaType.APPLICATION_JSON));
        SecondMarketSaleRequest request = new SecondMarketSaleRequest();
        SecondMarketSell sale = new SecondMarketSell();
        sale.setLoanPartId("422038e9-13e1-4f83-9e33-964611e11336");
        sale.setDesiredDiscountRate(-5);
        request.getItemList().add(sale);
        List<SecondMarketSaleResponse> responses = bondora.getSecondMarketOperations().sell(request).getPayload();
        assertEquals(2, responses.size());
    }

    @Test
    public void cancel() throws Exception {
        String id = "422038e9-13e1-4f83-9e33-964611e11336";
        mockServer.expect(requestTo(bondoraUrl("secondarymarket/cancel/"+id)))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("success"), MediaType.APPLICATION_JSON));
        assertEquals(true, bondora.getSecondMarketOperations().cancel(id).isSuccess());
    }

}
