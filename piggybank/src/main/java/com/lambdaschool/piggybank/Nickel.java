package com.lambdaschool.piggybank;

public class Nickel extends Coin{
    // Constructors
    public Nickel(){
        this(1L);
    }

    public Nickel(long amount) {
        super(CurrencyClass.Nickel, 0.05,amount);
    }
}
