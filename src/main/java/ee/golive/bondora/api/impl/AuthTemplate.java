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

import ee.golive.bondora.api.ApiResult;
import ee.golive.bondora.api.AuthOperations;
import ee.golive.bondora.api.AuthTokenResult;
import ee.golive.bondora.api.UserCredentials;

public class AuthTemplate implements AuthOperations {

    private BondoraTemplate api;

    public AuthTemplate(BondoraTemplate api) {
        this.api = api;
    }

    @Override
    public AuthTokenResult login(String username, String password) {
        UserCredentials userCredentials = new UserCredentials(username, password);
        return api.postObject("login", userCredentials, AuthTokenResult.class);
    }

    @Override
    public boolean logout() {
        return api.postObject("logout", null, ApiResult.class).isSuccess();
    }
}
