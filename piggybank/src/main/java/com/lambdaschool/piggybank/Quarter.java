package com.lambdaschool.piggybank;

public class Quarter extends Coin{
    // Constructors
    public Quarter(){
        this(1L);
    }

    public Quarter(long amount) {
        super(CurrencyClass.Dime, 0.25,amount);
    }
}
