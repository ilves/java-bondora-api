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

import ee.golive.bondora.api.domain.responses.ApiError;
import ee.golive.bondora.api.exceptions.BondoraException;
import ee.golive.bondora.api.impl.BondoraImpl;
import org.junit.Test;

import java.util.Date;

public class RunTest {

    @Test
    public void test() {
        BondoraConfig config = new BondoraConfig();
        config.setApiUrl("https://api.bondora.com/api/v1/");
        config.setAuthUrl("https://www.bondora.com/oauth/authorize?scope=BidsRead BidsEdit Investments SmBuy SmSell");
        config.setClientId("50f4f8a41e4347d3be708fc42e3d4e50");
        config.setSecret("PlyZy7q4s2Y7GwdNX7vF9RE0A2OjO3uyO6rP2DgjEzYyM4nC");
        config.setTokenUrl("https://api.bondora.com/oauth/access_token");
        Bondora bondora = new BondoraImpl(config, "fNnougukdGYqxPi2pi7ahFXLdkJVd7gZNN35U1HvWTcwImob");

        int n = 0;
        while(n < 4) {
            try {
                bondora.getAccountOperations().getInvestments("x=y");
            } catch (BondoraException e) {
                System.out.println(e.getHttpStatus());
                for(ApiError error : e.getResponse().getErrors()) {
                    System.out.println(error.getDetails());
                }
            }
            n++;
        }
    }
}
