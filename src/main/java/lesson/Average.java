package lesson;

public class Average {

    private int x1;

    private int x2;

    private int x3;


    public Average() {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void print() {
        System.out.println("Value x1: " + x1);
        System.out.println("Value x2: " + x2);
        System.out.println("Value x3: " + x3);
    }
}
