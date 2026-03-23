package edu.txst.midterm;

public class CoinCounter {
	private int coins;

	public int getCoins() {
		return coins;
	}

	public void increaseCoins() {
		coins++;
	}

	public void resetCoins() {
		coins = 0;
	}

	public CoinCounter() {
		coins = 0;
	}
}
