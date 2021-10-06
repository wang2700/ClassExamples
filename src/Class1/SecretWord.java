package Class1;/* Write a program that reads a word from the user and
prints a message if it matches a “secret word” in the program.
 If it is not a match allow the user to try again*/

import java.util.Scanner;

public class SecretWord {
    final static String SECRET = "awesome";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String word = in.next();
            if (word.equals(SECRET)) {
                System.out.printf(
                        "You have said the secret word: '%s'\n",
                        SECRET);
                return;
            } else {
                System.out.println("This is not the secret word");
            }
        }

    }
}

