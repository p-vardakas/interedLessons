package lesson2;

public class Chickens02 {
    public static void main(String[] args) {
        double mondaysEggs = 100.0;
        double tuesdaysEggs = 121.0;
        double thursdaysEggs = 117.0;


        double dailyAverage = (mondaysEggs + tuesdaysEggs + thursdaysEggs) / 3.0;
        double monthlyAverage = dailyAverage * 30.0;
        double profit = monthlyAverage * 0.18;

        System.out.println("dailyAverage: " + dailyAverage);
        System.out.println("monthlyAverage: " + monthlyAverage);
        System.out.println("profit: " + profit + " €");
    }
}