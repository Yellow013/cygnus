package io.cygnus.engine.position;

import io.horizon.structure.market.instrument.impl.ChinaStock;
import io.horizon.structure.position.PositionManager.PositionManagerBaseImpl;

public final class ChinaStockPositionManager extends PositionManagerBaseImpl<ChinaStockPosition> {

	public static final ChinaStockPositionManager Singleton = new ChinaStockPositionManager();

	private ChinaStockPositionManager() {
		super((accountId, instrument) -> {
			if (instrument instanceof ChinaStock) {
				return new ChinaStockPosition(accountId, (ChinaStock) instrument);
			} else {
				throw new IllegalArgumentException("Produce ChinaFutures Error");
			}
		});
	}

}
