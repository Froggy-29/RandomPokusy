package cz;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BankAccount {
    private String ownerName;

    private double balance;

    private static int nextAccountNumber = 0;

    private int accountNumber;

    private List<String> transactionHistory = new ArrayList<>();

    public BankAccount(String ovnerName){
        this.ownerName = ovnerName;
        this.balance = 0;
        nextAccountNumber++;
        this.accountNumber = nextAccountNumber;
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
            LocalDateTime now = LocalDateTime.now();
            transactionHistory.add(now + " Deposit + " + amount);
        }

    }

    public boolean withdraw (double amount){
        if(getBalance() - amount >= 0 && noZeroValidation(amount)){
            balance -= amount;
            LocalDateTime now = LocalDateTime.now();
            transactionHistory.add(now + " Withdraw - " + amount);
            return true;
        }else {
            return false;
        }
    }

    public boolean transfer(BankAccount recipiement, double amount){
        if(noZeroValidation(amount) && getBalance()-amount >= 0){
            this.balance -= amount;
            recipiement.deposit(amount);
            LocalDateTime now = LocalDateTime.now();
            transactionHistory.add(now + " Transfer - " + amount + " to accaunt " + recipiement.getAccountNumber());
            return true;
        }else return false;
    }

    public void History(){
        for(String entry : transactionHistory){
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + "Owner: " + ownerName + ", Balance: " + balance;
    }
}
