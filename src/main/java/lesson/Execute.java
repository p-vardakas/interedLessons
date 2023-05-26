package lesson;

public class Execute {
    public static void main(String[] args) {
        Average average1 = new Average();
        System.out.println("average1");
        average1.print();

        average1.setX1(5);
        average1.setX2(7);
        average1.setX3(8);

        System.out.println(average1.getX1());
        System.out.println(average1.getX2());
        System.out.println(average1.getX3());

    }
}
