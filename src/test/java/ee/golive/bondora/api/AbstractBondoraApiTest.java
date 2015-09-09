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

import ee.golive.bondora.api.impl.BondoraTemplate;
import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.web.client.MockRestServiceServer;

public class AbstractBondoraApiTest {

    protected BondoraTemplate bondora;
    protected BondoraTemplate appBondora;
    protected MockRestServiceServer mockServer;
    protected MockRestServiceServer appFacebookMockServer;

    @Before
    public void setup() {
        bondora = createBondoraTemplate();
        mockServer = MockRestServiceServer.createServer(bondora.getRestTemplate());

        appBondora = new BondoraTemplate("");
        appFacebookMockServer = MockRestServiceServer.createServer(appBondora.getRestTemplate());
    }

    protected BondoraTemplate createBondoraTemplate() {
        return new BondoraTemplate("");
    }

    protected Resource jsonResource(String filename) {
        return new ClassPathResource(filename + ".json", getClass());
    }

    protected String bondoraUrl(String path) {
        return BondoraTemplate.API_URL + BondoraTemplate.API_VERSION + "/" + path;
    }
}
