package lesson5.virtualbank;

public class Account {

    int code;
    double balance;
    Client owner;

    public Account() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Δεν επαρκεί το διαθέσιμο υπόλοιπo");
        } else {
            balance -= amount;
        }
    }

    public void printBalance() {
        System.out.println("Το διαθέσιμο υπόλοιπο είναι: " + balance);
    }
}
