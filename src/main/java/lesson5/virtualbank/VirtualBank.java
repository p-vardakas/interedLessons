package lesson5.virtualbank;

public class VirtualBank {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("George");

        Account account1 = new Account();
        account1.setCode(10001);
        account1.setOwner(client1);

        Account account2 = new Account();
        account2.setCode(20001);
        account1.setOwner(client1);

        Account[] person1Accounts = new Account[2];
        person1Accounts[0] = account1;
        person1Accounts[1] = account2;

        client1.setAccounts(person1Accounts);

        Client client2 = new Client();
        client2.setName("Sonia");

        Account account3 = new Account();
        account3.setCode(30001);
        account3.setOwner(client2);

        Account[] person2Accounts = new Account[1];
        person2Accounts[0] = account3;

        client2.setAccounts(person2Accounts);

        account1.deposit(10.0);
        account1.withdraw(5.0);
        account1.printBalance();
        client1.printAccounts();

        System.out.println("--------------------------");

        account3.withdraw(20.0);
        account3.printBalance();

        client2.printAccounts();
    }
}
