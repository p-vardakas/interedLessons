package lesson2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers");
        System.out.println("Note: You can press enter after each number or " +
                "type a space between them and then press enter");
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += scanner.nextInt();
        }
        scanner.close();
        System.out.println(total);
    }
}