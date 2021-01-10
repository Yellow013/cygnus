/**
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
 * 
 */
package io.cygnus.exchange.core.orderbook;

import java.util.Spliterator;
import java.util.function.Consumer;

import io.cygnus.exchange.core.orderbook.OrderBookDirectImpl.DirectOrder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class OrdersSpliterator implements Spliterator<DirectOrder> {

	private DirectOrder pointer;

	@Override
	public boolean tryAdvance(Consumer<? super DirectOrder> action) {
		if (pointer == null) {
			return false;
		} else {
			action.accept(pointer);
			pointer = pointer.getPrev();
			return true;
		}
	}

	@Override
	public Spliterator<DirectOrder> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return Long.MAX_VALUE;
	}

	@Override
	public int characteristics() {
		return Spliterator.ORDERED;
	}
}
