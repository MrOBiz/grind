package serie5;

import java.util.Scanner;

public class lineBreak {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] sentence = readSentence();
        for (int i = 0; i < sentence.length; i++) {
            lineBreak(sentence[i]);
        }
    }
    static String[] readSentence() {
        String[] sentence;

        System.out.print("Enter number of words: ");
        sentence = new String[sc.nextInt()];
        sc.nextLine();

        for(int i = 0; i < sentence.length; i++) {
            System.out.print("Enter word " + (i+1) + ": ");
            sentence[i] = sc.nextLine();
        }

        return sentence;
    }

    /*static boolean vowel(char c) {
// A compléter:
// teste si un caractère est une voyelle
    }
    static boolean notVowel(String s) {
// A compléter:
// teste si une chaîne ne contient que des voyelles
// utilise la méthode voyelle
    }*/
    static void lineBreak(String mot) {
// A compléter:
// détermine la césure d'un mot donné et effectue les affichages
// correspondants (voir exemple de déroulement)
    }
}
