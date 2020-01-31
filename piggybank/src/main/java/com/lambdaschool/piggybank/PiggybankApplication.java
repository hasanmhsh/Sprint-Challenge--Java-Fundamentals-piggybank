package com.lambdaschool.piggybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiggybankApplication {


    public static void main(String[] args) {
        new PiggyBankWallet();
        System.out.println(PiggyBankWallet.currentPGWallet.getValue());
        System.out.println(PiggyBankWallet.currentPGWallet.getContents());

        //SpringApplication.run(PiggybankApplication.class, args);
    }

}
