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

import ee.golive.bondora.api.domain.AuctionPurpose;
import ee.golive.bondora.api.domain.LoanDebtManagementEventType;
import ee.golive.bondora.api.domain.MyAccountBalance;
import ee.golive.bondora.api.domain.MyInvestmentItem;
import org.junit.Test;
import org.springframework.http.MediaType;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class AccountImplTest extends AbstractBondoraApiTest {

    @Test
    public void getAccountBalance() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("account/balance")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("myAccountBalance"), MediaType.APPLICATION_JSON));
        MyAccountBalance balance = bondora.getAccountOperations().getAccountBalance().getPayload();
        assertEquals(BigDecimal.valueOf(1.0), balance.getBalance());
        assertEquals(BigDecimal.valueOf(2.0), balance.getReserved());
        assertEquals(BigDecimal.valueOf(3.0), balance.getBidRequestAmount());
        assertEquals(BigDecimal.valueOf(-4.0), balance.getTotalAvailable());
    }

    @Test
    public void getInvestments() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("account/investments")))
                .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("myInvestments"), MediaType.APPLICATION_JSON));
        List<MyInvestmentItem> investments = bondora.getAccountOperations().getInvestments(null).getPayload();
        assertEquals(2, investments.size());
        assertEquals("c4ffc8a5-ac36-4896-9381-b242f13996da", investments.get(1).getLoanPartId());
        assertEquals(AuctionPurpose.Health, investments.get(0).getUseOfLoan());
        assertEquals(LoanDebtManagementEventType.DecisionMadeAndDeclared,
                investments.get(0).getLatestDebtManagementStage());
    }
}
