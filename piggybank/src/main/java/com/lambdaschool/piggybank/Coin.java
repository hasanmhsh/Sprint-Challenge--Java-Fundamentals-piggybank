package com.lambdaschool.piggybank;

public abstract class Coin extends Money {
    // Fields
    protected double coinValue;
    protected long addedCoins;

    // Constructors
    public Coin(CurrencyClass coinClass, double coinValue) {
        this(coinClass ,coinValue, 1L);
    }

    public Coin(CurrencyClass coinClass, double coinValue, long addedCoins) {
        super(coinClass, coinValue*addedCoins);
        this.coinValue = coinValue;
        this.addedCoins = addedCoins;
    }

    // Properties

    @Override
    public String toString() {
        return  String.valueOf(addedCoins) + " " + super.cClass.name() +((addedCoins>1)?"s":"");
    }
}
