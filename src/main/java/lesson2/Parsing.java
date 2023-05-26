package lesson2;

public class Parsing {
    public static void main(String[] args) {
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        int price = Integer.parseInt(shirtPrice);
        double rate = Double.parseDouble(taxRate);

        System.out.println("Tax: " + price * rate);

        int gibberish2 = Integer.parseInt(gibberish);
        System.out.println(gibberish2);
    }
}