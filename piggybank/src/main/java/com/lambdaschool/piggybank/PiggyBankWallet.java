package com.lambdaschool.piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class PiggyBankWallet {
    public static PiggyBankWallet currentPGWallet;
    private ArrayList<Coin> wallet;
    PiggyBankWallet(){
        currentPGWallet = this;
        wallet = new ArrayList<>();
        wallet.add(new Quarter());
        wallet.add(new Dime());
        wallet.add(new Dollar(5));
        wallet.add(new Nickel(3));
        wallet.add(new Dime(7));
        wallet.add(new Dollar());
        wallet.add(new Penny(10));
    }

    @Override
    public String toString() {
        return "PiggyBankWallet{" +
                "currentPGWallet=" + currentPGWallet +
                ", wallet=" + wallet +
                '}';
    }

    public String getContents(){
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double totalMoney = 0.0;
        for(Coin coin :wallet){
            totalMoney += coin.getAmount();
        }
        String strAmount = fp.format(totalMoney);
        return String.format("The piggy bank holds %s",strAmount);
    }

    public String getValue(){
        String strValue = "";
        for (Coin coin : wallet){
            strValue += coin.toString() + '\n';
        }
        return strValue;
    }
}
