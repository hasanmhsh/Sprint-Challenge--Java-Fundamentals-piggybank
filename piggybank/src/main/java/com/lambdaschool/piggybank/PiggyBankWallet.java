package com.lambdaschool.piggybank;

import java.util.ArrayList;
import java.util.HashMap;

public class PiggyBankWallet {
    public final PiggyBankWallet currentPGWallet;
    private ArrayList<Money> wallet;
    PiggyBankWallet(){
        currentPGWallet = this;
        wallet = new ArrayList<>();
    }
}
