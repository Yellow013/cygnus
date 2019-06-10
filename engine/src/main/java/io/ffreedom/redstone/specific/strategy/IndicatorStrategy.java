package io.ffreedom.redstone.specific.strategy;

import io.ffreedom.polaris.financial.Instrument;
import io.ffreedom.polaris.market.api.MarketData;

public abstract class IndicatorStrategy<M extends MarketData> extends BaseStrategy<M> {

	protected IndicatorStrategy(int strategyId, int subAccountId, Instrument instrument) {
		super(strategyId, subAccountId, instrument);
	}

}
