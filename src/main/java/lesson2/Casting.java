package lesson2;

public class Casting {
    public static void main(String[] args) {
        short variable1 = 128;
        byte variable2 = (byte) variable1;
        byte variable3 = 127;

        System.out.println("1." + variable1);
        System.out.println("2." + variable2);
        System.out.println("3." + (byte) (variable3 + 1));
        System.out.println("4." + (variable3 + 1));
        System.out.println();

        //byte consist of 8 bit ---> 1 bit sign (positive or negative ) 7 bit value
        // -128 ---> 1 0000000 ---> 1 = negative
        //  127 ---> 0 1111111 ---> 0 = positive
    }
}