package lesson5;

public class Array {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 15;
        myArray[1] = 20;

        int firstElementOfArray = myArray[0];

        System.out.println("The first element of the array is: " + firstElementOfArray);

        String[] fruits = {"banana", "apple", "pear"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("element index: " + i + " element name: " + fruits[i]);
        }
    }
}
