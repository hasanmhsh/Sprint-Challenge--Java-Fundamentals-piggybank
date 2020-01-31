package com.lambdaschool.piggybank;

public final class Quarter extends Coin{
    // Constructors
    public Quarter(){
        this(1L);
    }

    public Quarter(long amount) {
        super(CurrencyClass.Quarter, 0.25,amount);
    }
}
