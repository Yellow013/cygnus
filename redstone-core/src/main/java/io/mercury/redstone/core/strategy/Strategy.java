package io.mercury.redstone.core.strategy;

import java.util.function.Supplier;

import org.eclipse.collections.api.list.ImmutableList;

import io.mercury.common.fsm.Enable;
import io.mercury.financial.instrument.Instrument;
import io.mercury.financial.market.impl.BasicMarketData;
import io.mercury.redstone.core.adaptor.Adaptor;
import io.mercury.redstone.core.adaptor.AdaptorEvent;
import io.mercury.redstone.core.order.Order;

public interface Strategy extends Enable<Strategy> {

	int strategyId();

	String strategyName();

	int subAccountId();

	ImmutableList<Instrument> instruments();

	void addAdaptor(Adaptor adaptor);

	void initialization(Supplier<Boolean> initializer);

	void onAdaptorEvent(AdaptorEvent event);

	void onStrategyEvent(StrategyEvent event);

	void onMarketData(BasicMarketData marketData);

	void onOrder(Order order);

	void onError(Throwable throwable);

}