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
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.http.HttpMethod.POST;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class OAuthImplTest extends AbstractBondoraApiTest {

    @Test
    public void itShouldReturnValidAccessTokenWhenUsingRefreshToken() throws Exception {
        mockServer.expect(requestTo(bondoraOauthUrl("oauth/access_token")))
                .andExpect(method(POST))
                .andRespond(withSuccess(jsonResource("refreshToken"), MediaType.APPLICATION_JSON));
        AccessToken token = bondora.getOauthOperations().getAccessTokenByRefreshToken("abc");
        Assert.assertEquals("2xPQ1XFONL0B6o4j8ERRGdSgSZn5jjhRnGRIEWCspiaH6MlS", token.getAccessToken());
    }
}
