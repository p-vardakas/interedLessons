package lesson7.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Προσθέτει στοιχεία στη λίστα
        names.add("Peter");
        names.add("John");
        names.add("Maria");
        names.add("Sonia");

        // Προσθέτει στοιχείο στη λίστα στη θέση 4
        names.add(4, "Tony");

        // Επιστρέφει το στοιχείο απο τη λίστα στη θέση 1
        String secondElement = names.get(1);

        // Διαγράφει το στοιχείο απο τη λίστα στη θέση 3
        names.remove(3);

        // Επιστρέφει το μέγεθος της λίστας
        names.size();

        // Ελέγχει αν υπάρχει το στοιχείο στη λίστα και επιστρέφει true / false
        boolean contains = names.contains("Tony");

        // Αδειάζει τη λίστα
        names.clear();

        // Επιστρέφει τη θέση ενός στοιχείου, αν δεν υπάρχει επιστρέφει -1,
        // Αν υπάρχουν πολλαπλά ίδια στοιχειά επιστέφει το πρώτο απο αυτά
        names.indexOf("Peter");

        // Επιστρέφει τη θέση ενός στοιχείου, αν δεν υπάρχει επιστρέφει -1,
        // Αν υπάρχουν πολλαπλά ίδια στοιχειά επιστέφει το τελευταίο απο αυτά
        names.lastIndexOf("Peter");
    }
}
