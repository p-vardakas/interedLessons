package lesson5.virtualbank;

public class Client {

    String name;
    int age;
    Account[] accounts;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void printAccounts() {
        if (accounts.length == 0) {
            System.out.println("Δεν υπάρχον διαθέσιμοι λογαριασμοί");
        } else {
            System.out.println("Οι διαθέσιμοι λογαριασμοί του πελάτη " + name + " είναι:");
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Κωδικός: " + accounts[i].getCode() + " υπόλοιπο: " + accounts[i].getBalance());
            }
        }
    }
}
