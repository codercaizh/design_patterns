package com.czh.strategy;

public class StrategyContext {
	public final static int REDUCE_STRATEGY = 0;
	public final static int RETURN_STRATEGY = 1;
	private Strategy strategy;
	
	public StrategyContext(int strategyType) {
		switch(strategyType) {
			case REDUCE_STRATEGY: setStrategy( new ReduceStrategy(200,100));break;
			case RETURN_STRATEGY: setStrategy( new ReturnStrategy(0.8));break;
			default:setStrategy(new NormalStrategy());
		}
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int getMoney(int money) {
		return getStrategy().getResult(money);
	}
	
}
