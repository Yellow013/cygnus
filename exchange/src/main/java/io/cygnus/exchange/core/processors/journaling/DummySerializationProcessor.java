package io.cygnus.exchange.core.processors.journaling;

import io.cygnus.exchange.core.ExchangeApi;
import io.cygnus.exchange.core.common.cmd.OrderCommand;
import io.cygnus.exchange.core.common.config.InitialStateConfiguration;
import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.WriteBytesMarshallable;

import java.util.NavigableMap;
import java.util.function.Function;

public class DummySerializationProcessor implements ISerializationProcessor {

	public static final DummySerializationProcessor INSTANCE = new DummySerializationProcessor();

	@Override
	public boolean storeData(long snapshotId, long seq, long timestampNs, SerializedModuleType type, int instanceId,
			WriteBytesMarshallable obj) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T loadData(long snapshotId, SerializedModuleType type, int instanceId,
			Function<BytesIn<?>, T> initFunc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void writeToJournal(OrderCommand cmd, long dSeq, boolean eob) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void enableJournaling(long afterSeq, ExchangeApi api) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NavigableMap<Long, SnapshotDescriptor> findAllSnapshotPoints() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void replayJournalStep(long snapshotId, long seqFrom, long seqTo, ExchangeApi exchangeApi) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long replayJournalFull(InitialStateConfiguration initialStateConfiguration, ExchangeApi exchangeApi) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void replayJournalFullAndThenEnableJouraling(InitialStateConfiguration initialStateConfiguration,
			ExchangeApi exchangeApi) {
		// do nothing
	}
}
