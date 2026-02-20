package cz;

public class BankAccount {
    private String ownerName;

    private double balance;

    public BankAccount(String ovnerName){
        this.ownerName = ovnerName;
        this.balance = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public boolean noZeroValidation(double amount){
        return amount > 0;
    }

    public void deposit(double amount){
        if(noZeroValidation(amount)){
           balance += amount;
        }

    }

    public void withdraw (double amount){
        if(getBalance() - amount < 0 && noZeroValidation(amount)){
            balance -= amount;
        }
    }

    public String toString() {
        return "Owner: " + ownerName + ", Balance: " + balance;
    }
}
