package lesson6;

public class Main {
    public static void main(String[] args) {
        Product cocaCola = new Product("Coca Cola", 0.6);
        Product sprite = new Product("Sprite", 0.7);
        Product fanta = new Product("Fanta", 0.7);

        Product[] products = {cocaCola, sprite, fanta};

        Coin ten = new Coin("Ten Cent", 0.10);
        Coin twenty = new Coin("Twenty Cent", 0.20);
        Coin fifty = new Coin("Fifty Cent", 0.50);
        Coin one = new Coin("One Euro", 1);

        Coin[] coins = {ten, twenty, fifty, one};

        VentingMachine machine = new VentingMachine(products, coins);
        machine.sellProducts();
    }

}
