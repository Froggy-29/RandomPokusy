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

    public boolean noZeroValidation(double amount){
        if(amount > 0) {
            return false;
        }else{
            return true;
        }
    }

    public void deposit(double amount){
        if(noZeroValidation(amount)){
           setBalance(getBalance() + amount);
        }

    }

    public void withdraw (double amount){
        if(getBalance() - amount < 0 && noZeroValidation(amount)){
            setBalance(getBalance() - amount);
        }
    }

    public String toString(){
        System.out.println("Owner: " + getOvnerName() + " Balance: " + getBalance());
        return null;
    }
}
