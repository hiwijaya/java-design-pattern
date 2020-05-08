package com.hiwijaya.pattern.builder;


public class Account {

    private String accountNumber;
    private String owner;
    private String branch;
    private Long balance;
    private Double interestRate;
    // many more..

    // it will make Account object can only be produce via Builder
    private Account(){
        // constructor is now private
    }



    /*
    * Builder
    *
    * The Builder pattern allows us to write readable, understandable code to set up complex objects.
    * The builder will contain all of the fields that exist on the class itself.
    *
    * */
    public static class Builder {

        private String accountNumber;   //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private Long balance;
        private Double interestRate;


        public Builder(String accountNumber){
            this.accountNumber = accountNumber;
        }


        public Builder owner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder branch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder balance(Long balance){
            this.balance = balance;
            return this;
        }

        public Builder rate(Double interestRate){
            this.interestRate = interestRate;
            return this;
        }


        // will produce an Account object
        public Account build(){
            Account account = new Account();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }

    }

}
