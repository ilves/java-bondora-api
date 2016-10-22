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

package ee.golive.bondora.api.util;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import javax.net.ssl.SSLContext;

public class HttpClientFactory {

    private static CloseableHttpClient client;

    public static HttpComponentsClientHttpRequestFactory getHttpsClient() {
        try {
            SSLContext sslContext = SSLContexts.custom().loadTrustMaterial((x509Certificates, s) -> true).build();
            HttpClientBuilder builder = HttpClientBuilder.create().setSSLContext(sslContext);
            PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
            connManager.setMaxTotal(5);
            connManager.setDefaultMaxPerRoute(4);
            HttpHost host = new HttpHost("api.bondora.com", 443);
            connManager.setMaxPerRoute(new HttpRoute(host), 5);
            builder.setConnectionManager(connManager);
            return new HttpComponentsClientHttpRequestFactory(builder.build());
        } catch (Exception e) {

        }
        return null;
    }
}