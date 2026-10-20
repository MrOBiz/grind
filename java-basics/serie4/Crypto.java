package serie4;

import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int OFFSET = 4;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter chain of char: ");
        String s = sc.nextLine();

        // chain to code
        String aCoder = "";
        // coded chain
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("Initial chain: '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("Coded chain is empty\n");
        } else {
            System.out.format("Chain to code is: '%s'\n", aCoder);
            System.out.format("Coded chain is: '%s'\n", chaineCodee);
        }
    }
}
