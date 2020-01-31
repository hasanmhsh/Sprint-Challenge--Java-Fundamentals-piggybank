package com.lambdaschool.piggybank;

public final class Dime extends Coin{
    // Constructors
    public Dime(){
        this(1L);
    }

    public Dime(long amount) {
        super(CurrencyClass.Dime, 0.1,amount);
    }
}
