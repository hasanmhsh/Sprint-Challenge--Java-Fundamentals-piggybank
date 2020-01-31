package com.lambdaschool.piggybank;

public class Dollar extends Coin{
    // Constructors
    public Dollar(){
        this(1L);
    }

    public Dollar(long amount) {
        super(CurrencyClass.Dollar, 1.0,amount);
    }
}
