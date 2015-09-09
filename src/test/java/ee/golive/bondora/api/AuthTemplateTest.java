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

import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class AuthTemplateTest extends AbstractBondoraApiTest {

    @Test
    public void login() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("login")))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("loginSuccess"), MediaType.APPLICATION_JSON));

        bondora.getAuthOperations().login("myusername", "mypassword");
    }

    @Test
    public void logout() throws Exception {
        mockServer.expect(requestTo(bondoraUrl("logout")))
                .andExpect(method(POST))
                .andRespond(withSuccess("{\"Success\":true,\"Errors\": null}", MediaType.APPLICATION_JSON));

        bondora.getAuthOperations().logout();
    }
}
