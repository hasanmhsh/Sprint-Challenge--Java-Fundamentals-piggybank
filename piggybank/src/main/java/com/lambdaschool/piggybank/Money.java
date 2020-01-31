package com.lambdaschool.piggybank;

public abstract class Money {
    // Fields
    protected CurrencyClass cClass;
    protected double amount;

    // Constructors

    public Money(CurrencyClass cClass, double amount) {
        this.cClass = cClass;
        this.amount = amount;
    }

    // Propeties
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Other methods

    @Override
    public String toString() {
        return "Money{" +
                "cClass=" + cClass +
                ", amount=" + amount +
                '}';
    }
}
