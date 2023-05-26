package lesson3;

public class IfStatement {
    public static void main(String[] args) {
        int HIGH_SCORE = 95;
        int MEDIUM_SCORE = 75;
        int LOW_SCORE = 55;

        int maths = 95;
        int history = 97;
        int english = 98;

        int average = (maths + english + history) / 3;

        System.out.println("The average score is " + average);

        if (average >= HIGH_SCORE) {
            System.out.println("Well done, your grade is excellent!");
        } else if (average >= MEDIUM_SCORE) {
            System.out.println("Nice, your grade is good!");
        } else if (average >= LOW_SCORE) {
            System.out.println("Attention, your grade is low!");
        } else {
            System.out.println("Sorry you fail!");
        }
    }
}
