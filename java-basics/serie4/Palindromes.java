package serie4;

import java.util.Scanner;
import java.util.ArrayList;

public class Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to test: ");
        String s = sc.nextLine();

        String test = s.toLowerCase();
        ArrayList<Character> noSpace = new ArrayList<>();

        for(int i = 0; i < test.length(); i++){
            if(test.charAt(i) != ' ' && Character.isLetter(test.charAt(i))){
                noSpace.add(test.charAt(i));
            }
        }

        for(int i = 0; i < noSpace.size(); i++){
            System.out.print(noSpace.get(i));
        }
    }
}
