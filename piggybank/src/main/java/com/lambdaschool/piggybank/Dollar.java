package com.lambdaschool.piggybank;

public final class Dollar extends Coin{
    // Constructors
    public Dollar(){
        this(1L);
    }

    public Dollar(long amount) {
        super(CurrencyClass.$, 1.0,amount);
    }

    @Override
    public String toString(){
        return "$"+String.valueOf(addedCoins);
    }
}
