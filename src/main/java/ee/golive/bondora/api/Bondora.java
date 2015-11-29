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

/**
 * Interface specifying a basic set of operations for interacting with Bondora.
 * Implemented by {@link ee.golive.bondora.api.impl.BondoraTemplate}.
 * @author Taavi Ilves
 */
public interface Bondora {

    /**
     * API for working with auctions and bidding.
     * @return {@link AuctionOperations}
     */
    AuctionOperations getAuctionOperations();

    /**
     * API for working with secondMarket
     * @return {@link SecondaryMarketOperations}
     */
    SecondaryMarketOperations getSecondMarketOperations();

    /**
     * API for working with user related operations.
     * @return {@link UserOperations}
     */
    UserOperations getUserOperations();

    /**
     * Sets authentication token
     * @param token authentication token
     */
    void setAccessToken(String token);
}