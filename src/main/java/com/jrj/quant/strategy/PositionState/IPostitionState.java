package com.jrj.quant.strategy.PositionState;

import com.jrj.quant.broker.Order;
import com.jrj.quant.broker.OrderEvent;
import com.jrj.quant.strategy.Position;

public interface IPostitionState {
	void onEnter(Position postition);
	void canSubmitOrder(Position position,Order order);
	void onOrderEvent(Position position,OrderEvent orderEvent);
	boolean isOpen(Position position);
	/**
	 * 
	 * @param position
	 * @param stopPrice
	 * @param limitPrice
	 * @param goodTillCanceled 取消前有效指令 open ordered  在成交或取消之前仍有效力的交易指令
	 */
	void exit(Position position,Double stopPrice,Double limitPrice,Boolean goodTillCanceled);
}