package cryptoTrader.strategy;

import cryptoTrader.tradeResult.TradeResult;

public class StrategyA implements StrategyInterface {

	@Override
	public TradeResult performTrade(String[] coinList, float[] coinPrices) {
		// TODO Auto-generated method stub
		// if the price of BTC is less than or equal to $50,000
		// and the price of ADA is more than $2
		// then buy 10 ADA coins
		return null;
	}

	@Override
	public String getStrategyName() {
		return "Strategy-A";
	}

}
