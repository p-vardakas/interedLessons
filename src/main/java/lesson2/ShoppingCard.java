package lesson2;

public class ShoppingCard {
    public static void main(String[] args) {
        String customerName = "Ο Alex";
        String message = " θελει να αγοράσει ";
        String itemDescription = "πουκάμισα";
        String messageForCost = "Συνολικό κόστος με φόρο: ";
        double price = 11.5;
        double tax = 1.24;
        int quantity = 2;

        double totalCost = (price * tax) * quantity;

        System.out.println(customerName + message + quantity + " " + itemDescription +
                "\n" + messageForCost + totalCost);

    }
}