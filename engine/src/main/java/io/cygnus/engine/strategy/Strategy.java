package io.cygnus.engine.strategy;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import org.eclipse.collections.api.list.ImmutableList;

import io.horizon.definition.account.Account;
import io.horizon.definition.account.SubAccount;
import io.horizon.definition.adaptor.Adaptor;
import io.horizon.definition.event.handler.AdaptorEventHandler;
import io.horizon.definition.event.handler.MarketDataHandler;
import io.horizon.definition.event.handler.OrderHandler;
import io.horizon.definition.market.data.MarketData;
import io.horizon.definition.market.instrument.Instrument;
import io.mercury.common.fsm.Enable;

public interface Strategy<M extends MarketData> extends
		// 用于控制可用状态
		Enable<Strategy<M>>,
		// 用于确定优先级
		Comparable<Strategy<M>>,
		// 集成行情处理
		MarketDataHandler<M>,
		// 集成订单处理
		OrderHandler,
		// 集成AdaptorEvent处理
		AdaptorEventHandler {

	int strategyId();

	String strategyName();

	@Nonnull
	SubAccount getSubAccount();

	@Nonnull
	Account getAccount();

	@Nonnull
	ImmutableList<Instrument> instruments();

	void initialize(@Nonnull Supplier<Boolean> initializer);

	void addAdaptor(@Nonnull Adaptor adaptor);

	void onStrategyEvent(@Nonnull StrategyEvent event);

	void onThrowable(Throwable throwable) throws StrategyException;

	@Override
	default int compareTo(Strategy<M> o) {
		return this.strategyId() < o.strategyId() ? -1 : this.strategyId() > o.strategyId() ? 1 : 0;
	}

}