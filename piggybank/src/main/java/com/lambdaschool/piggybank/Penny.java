package com.lambdaschool.piggybank;

public final class Penny extends Coin{
    // Constructors
    public Penny(){
        this(1L);
    }

    public Penny(long amount) {
        super(CurrencyClass.Penny, 0.01,amount);
    }

    @Override
    public String toString(){
        return String.valueOf(addedCoins) +" "+ ((addedCoins>1)?"Pennies":"Penny");
    }
}
