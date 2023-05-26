package lesson3;

public class Statements {
    public static void main(String[] args) {

        int num1; // Δήλωση μεταβλητής 1 με εύρος δράσης όλη την κλάση

        { // Δήλωση ενός block statement (αρχή)
            int num2; // Δήλωση μεταβλητής 2 με εύρος δράσης μόνο το block
            num2 = 200;
            num1 = 100; // στη μεταβλητή 1 μπορούμε να αναθέσουμε τιμή παρόλο που δεν έχει δηλωθεί στο block
        } // Τέλος του block statement
        //num2 = 50; // Error. Η μεταβλητή δεν μπορεί να χρησιμοποιηθεί έξω από το block.
    }
}