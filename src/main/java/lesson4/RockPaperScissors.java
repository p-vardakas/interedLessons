package lesson4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private int rounds;
    private int playerScore;
    private int pcScore;

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        setRounds(scanner);

        for (int i = 0; i < rounds; i++) {
            System.out.println("---- Γύρος: " + (i + 1) + "ος ----");

            int playerSelection = getPlayerSelection(scanner);

            int pcSelection = getPcSelection();
            System.out.println("Ο Υπολογιστής επίλεξε: " + pcSelection);

            if (playerSelection > pcSelection) {
                playerScore++;
                System.out.println("Συγχαρητήρια! Κέρδισες");
            } else if (playerSelection < pcSelection) {
                pcScore++;
                System.out.println("Λυπάμαι! Έχασες");
            } else {
                System.out.println("Ισοπαλία!");
            }

            System.out.println("Σκορ: παίχτης: " + playerScore + " υπολογιστής: " + pcScore);
        }
    }

    private void setRounds(Scanner scanner) {
        System.out.println("Πόσους γύρους θέλετε να παίξετε;");
        this.rounds = scanner.nextInt();
    }

    private static int getPcSelection() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    private static int getPlayerSelection(Scanner scanner) {
        int playerSelection;
        do {
            System.out.println("Επιλέξτε 1 για πέτρα, 2 για ψαλίδι, 3 για χαρτί");
            playerSelection = scanner.nextInt();
        } while (playerSelection < 1 || playerSelection > 3);
        return playerSelection;
    }
}
