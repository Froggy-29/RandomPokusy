package cz;

import java.util.Date;

public class BankAccount {
    private String ownerName;

    private double balance;

    private static int accountNumber = 0;

    public BankAccount(String ovnerName){
        this.ownerName = ovnerName;
        this.balance = 0;
        this.accountNumber++;
    }

    public void setBalance(double balance) {
        if(noZeroValidation(balance)){
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setOvnerName(String ovnerName) {
        this.ownerName = ovnerName;
    }

    public String getOvnerName() {
        return ownerName;
    }

    public int getAccountNumber(){ return accountNumber;};

    public boolean noZeroValidation(double amount){
        return amount > 0;
    }

    public void deposit(double amount){
        if(noZeroValidation(amount)){
            balance += amount;
        }

    }

    public boolean withdraw (double amount){
        if(getBalance() - amount >= 0 && noZeroValidation(amount)){
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return "Account number: " + accountNumber + "Owner: " + ownerName + ", Balance: " + balance;
    }
}
