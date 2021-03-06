/*
 * Copyright 2019 Maksim Zheravin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cygnus.exchange.tests.perf.modules;

import io.cygnus.exchange.core.common.config.LoggingConfiguration;
import io.cygnus.exchange.core.orderbook.IOrderBook;
import io.cygnus.exchange.core.orderbook.OrderBookDirectImpl;
import io.cygnus.exchange.core.orderbook.OrderBookEventsHelper;
import io.cygnus.exchange.tests.util.TestConstants;
import io.mercury.common.collections.art.ObjectsPool;

public class ITOrderBookDirectImpl extends ITOrderBookBase {

    @Override
    protected IOrderBook createNewOrderBook() {

        return new OrderBookDirectImpl(
                TestConstants.SYMBOLSPEC_EUR_USD,
                ObjectsPool.createDefaultPool(),
                OrderBookEventsHelper.NON_POOLED_EVENTS_HELPER,
                LoggingConfiguration.DEFAULT);
    }
}
