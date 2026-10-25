package serie5;

import java.util.Scanner;

public class tree {
    public static void main(String[] args){
        int numLines = 3;

        /*for(int i=1; i<numLines; i++) {
            spaces(numLines-i);
            stars(2*i-1);
            System.out.println();
        }*/

        spaces(4);
        stars(1);
        System.out.println();

        spaces(3);
        stars(3);
        System.out.println();

        spaces(2);
        stars(5);
        System.out.println();

        spaces(3);
        stars(3);
        System.out.println();

        spaces(2);
        stars(5);
        System.out.println();

        spaces(1);
        stars(7);
        System.out.println();

        stars(9);
        System.out.println();

        spaces(3);
        sticks(3);
        System.out.println();

    }

    static void stars(int numStars){
        for(int i = 0; i < numStars; ++i) {
            System.out.print('*');
        }
    }

    static void spaces(int numSpaces){
        for(int i = 0; i < numSpaces; ++i) {
            System.out.print(' ');
        }
    }

    static void sticks(int numSticks){
        for(int i = 0; i < numSticks; ++i) {
            System.out.print('|');
        }
    }
}
