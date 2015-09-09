
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

package ee.golive.bondora.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.golive.bondora.api.ApiResultList;
import ee.golive.bondora.api.UserOperations;
import ee.golive.bondora.api.UserOrganization;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

public class UserTemplate implements UserOperations {

    private BondoraTemplate api;

    private ObjectMapper objectMapper;

    public UserTemplate(BondoraTemplate api) {
        this.api = api;
    }

    @Override
    public List<UserOrganization> getUserOrganizations() {
        ParameterizedTypeReference reference = new ParameterizedTypeReference<ApiResultList<UserOrganization>>() {};
        return ((ApiResultList<UserOrganization>) api.fetchObject("userorganizations", reference)).getPayload();
    }
}
