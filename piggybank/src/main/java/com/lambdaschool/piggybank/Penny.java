package com.lambdaschool.piggybank;

public class Penny extends Coin{
    // Constructors
    public Penny(long amount) {
        super(CurrencyClass.Dime, 0.01,amount);
    }
}
