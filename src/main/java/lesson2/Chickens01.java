package lesson2;

public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = 0;

        totalEggs = getTotalEggs(eggsPerChicken, chickenCount, totalEggs, "Monday");

        chickenCount += 1;
        totalEggs = getTotalEggs(eggsPerChicken, chickenCount, totalEggs, "Tuesday");

        chickenCount = chickenCount / 2;
        getTotalEggs(eggsPerChicken, chickenCount, totalEggs, "Wednesday");
    }

    private static int getTotalEggs(int eggsPerChicken, int chickenCount, int totalEggs, String day) {
        int dailyEggs = chickenCount * eggsPerChicken;
        totalEggs = totalEggs + dailyEggs;
        System.out.println(day + ": chickens: " + chickenCount + " eggs: " + totalEggs);
        return totalEggs;
    }
}