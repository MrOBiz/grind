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

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < ALPHABET.length(); j++){
                if(s.charAt(i) == ALPHABET.charAt(j) || s.charAt(i) == ' '){
                    aCoder += s.charAt(i);
                    break;
                }
            }
        }






        System.out.format("Initial chain: '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("No chain to encode (empty)\n");
        } else {
            System.out.format("Chain to code is: '%s'\n", aCoder);
            System.out.format("Coded chain is: '%s'\n", chaineCodee);
        }
    }
}
