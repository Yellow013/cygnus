package io.cygnus.indicator.impl;

import java.time.Duration;

import io.cygnus.indicator.IndicatorEvent;
import io.cygnus.indicator.impl.EmaIndicator.EmaEvent;
import io.cygnus.indicator.impl.EmaIndicator.EmaPoint;
import io.cygnus.indicator.impl.base.FixedPeriodIndicator;
import io.horizon.structure.market.data.impl.BasicMarketData;
import io.horizon.structure.market.instrument.Instrument;
import io.horizon.structure.serial.TimePeriodSerial;
import io.mercury.common.collections.list.LongFixedLengthList;

public final class EmaIndicator extends FixedPeriodIndicator<EmaPoint, EmaEvent, BasicMarketData> {

	public EmaIndicator(Instrument instrument, Duration duration, int cycle) {
		super(instrument, duration);
	}

	@Override
	protected void handleMarketData(BasicMarketData marketData) {
		// TODO Auto-generated method stub
	}

	/**
	 * 
	 * @author yellow013
	 *
	 */
	public interface EmaEvent extends IndicatorEvent {

		@Override
		default String getEventName() {
			return "EmaEvent";
		}

		void onCurrentEmaPointAvgPriceChanged(EmaPoint point);

		void onStartEmaPoint(EmaPoint point);

		void onEndEmaPoint(EmaPoint point);

	}

	/**
	 * 
	 * @author yellow013
	 *
	 */
	public final class EmaPoint extends MaPoint {

		protected EmaPoint(int index, Instrument instrument, Duration duration, TimePeriodSerial timePeriod,
				LongFixedLengthList historyPriceRecorder) {
			super(index, instrument, duration, timePeriod, historyPriceRecorder);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected void handleMarketData0(BasicMarketData preMarketData) {
			// TODO Auto-generated method stub

		}

	}

}
