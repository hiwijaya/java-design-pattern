package com.hiwijaya.pattern.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Account account1 = new Account.Builder("007")
                .owner("Happy Indra Wijaya")
                .branch("Jakarta")
                .balance(10000000L)
                .rate(2.5)
                .build();

        Account account2 = new Account.Builder("008")
                .owner("Saras")
                .branch("Ambon")
                .rate(1.5)
                .build();


    }

}
