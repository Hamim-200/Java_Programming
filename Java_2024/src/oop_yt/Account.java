package oop_yt;

public class Account {

    private int accountNumber;
    private double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
//    public void setAccountNumber(int accountNumber){
//        this.accountNumber = accountNumber;
//    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {

        this.balance += amount;
    }

    public void debit(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println(amount + "withdrown exceeds the current balance!");
        }

    }

    public String toString() {
        return "Tabassum er A/C no: " + this.accountNumber + "Balance:tk" + this.balance;
    }

    public static void main(String[] args) {
        Account ac1 = new Account(1234, 15000.50);
        System.out.println(ac1);

        ac1.credit(150.0);
        ac1.debit(120.50);

        System.out.println(ac1.toString());
    }

}
