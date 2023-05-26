package lesson4;

import java.util.Random;

import static javax.swing.JOptionPane.*;

public class RockPaperScissorsUI {
    private int rounds;
    private int playerScore;
    private int pcScore;

    public void playGame() {
        setRounds();

        for (int i = 0; i < rounds; i++) {
            showMessage((i + 1) + "ος", "Γύρος");

            int playerSelection = getPlayerSelection();

            Random random = new Random();
            int pcSelection = random.nextInt(3) + 1;
            showMessage("Ο Υπολογιστής επίλεξε " + getSelectionName(pcSelection), "Επιλογή Υπολογιστή");

            if (playerSelection > pcSelection) {
                playerScore++;
            } else {
                pcScore++;
            }
        }

        showMessage("Παίχτης: " + playerScore + " Υπολογιστής: " + pcScore, "Τελικό Σκόρ");

        if (playerScore > pcScore) {
            showMessage("Συγχαρητήρια! Κέρδισες", "Αποτέλεσμα");
        } else if (playerScore < pcScore) {
            showMessage("Λυπάμαι! Έχασες", "Αποτέλεσμα");
        } else {
            showMessage("Ισοπαλία!", "Αποτέλεσμα");
        }
    }

    private static void showMessage(String message, String title) {
        showMessageDialog(null, message, title, INFORMATION_MESSAGE);
    }

    private void setRounds() {
        this.rounds = Integer.parseInt(showInputDialog(
                null,
                "Πόσους γύρους θέλετε να παίξετε;",
                "Εισάγετε",
                QUESTION_MESSAGE));
    }

    private static int getPlayerSelection() {
        int playerSelection;
        String[] options = {"Πέτρα", "Ψαλίδι", "Χαρτί"};
        playerSelection = showOptionDialog(null,
                "Επιλέξτε ένα:",
                "Επιλογή Παίχτη",
                DEFAULT_OPTION,
                QUESTION_MESSAGE,
                null,
                options,
                null);
        return playerSelection + 1;
    }

    private static String getSelectionName(int selection) {
        String selectionName;
        switch (selection) {
            case 1:
                selectionName = "Πέτρα";
                break;
            case 2:
                selectionName = "Ψαλίδι";
                break;
            default:
                selectionName = "Χαρτί";
                break;
        }
        return selectionName;
    }
}
