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
        int size;

        do {
            System.out.print("Enter number of words (> 0): ");
            size = sc.nextInt();
            sentence = new String[size];
            sc.nextLine();//consumes the leftover \n from pressing enter after the int
        }while(size <= 0);

        for(int i = 0; i < sentence.length; i++) {
            System.out.print("Enter word " + (i+1) + ": ");
            sentence[i] = sc.nextLine();
        }

        return sentence;
    }

    static boolean vowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for(char v : vowels){
            if(c == v) return true;
        }
        return false;
    }

    static boolean onlyVowels(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(!vowel(s.charAt(i))) return false;
        }
        return true;
    }

    static void lineBreak(String mot) {
        if(onlyVowels(mot)) {
            System.out.println(mot);
        }

        //if()
    }
}
