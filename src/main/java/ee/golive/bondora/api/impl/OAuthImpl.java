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

import ee.golive.bondora.api.domain.AccessToken;
import ee.golive.bondora.api.operations.OAuthOperations;
import ee.golive.bondora.api.util.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author Taavi Ilves, Golive OÜ, http://www.golive.ee/
 */
public class OAuthImpl implements OAuthOperations {

    private BondoraImpl api;

    public OAuthImpl(BondoraImpl api) {
        this.api = api;
    }

    @Override
    public String getAuthUrl(String[] scope) {
        return getAuthUrl(scope, null);
    }

    @Override
    public String getAuthUrl(String[] scope, String redirectUri) {
        return getAuthUrl(scope, redirectUri, null);
    }

    @Override
    public String getAuthUrl(String[] scope, String redirectUri, String state) {
        URIBuilder uri = URIBuilder.fromUri(api.getConfig().getAuthUrl());
        uri.queryParam("scope", String.join(" ", scope));
        uri.queryParam("redirect_uri", redirectUri);
        uri.queryParam("state", state);
        uri.queryParam("response_type", "code");
        uri.queryParam("client_id", api.getConfig().getClientId());
        return uri.build().toString();
    }

    @Override
    public String getAccessToken(String code) {
        return getAccessToken(code, null);
    }

    @Override
    public String getAccessToken(String code, String redirectUri) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "authorization_code");
        map.add("client_id", api.getConfig().getClientId());
        map.add("client_secret", api.getConfig().getSecret());
        map.add("code", code);
        map.add("redirect_uri", redirectUri);
        String path = api.getConfig().getAuthUrl() + "oauth/access_token";
        return api.postObject(path, map, AccessToken.class).getAccessToken();
    }
}