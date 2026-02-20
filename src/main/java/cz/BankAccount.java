package cz;

public class BankAccount {
    public String ovnerName;

    public double balance;

    public BankAccount(String ovnerName, double balance){
        this.ovnerName = ovnerName;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setOvnerName(String ovnerName) {
        this.ovnerName = ovnerName;
    }

    public String getOvnerName() {
        return ovnerName;
    }

    public double deposit(double amount){
        return getBalance() + amount;
    }

    public double withdraw (double amount){
        if(getBalance() - amount < 0){
            return -1;
        }else {
            return getBalance() - amount;
        }
    }

    public String toString(double balance, String ovnerName){
        return "owner: " + ovnerName + " balance: " + balance;
    }
}
