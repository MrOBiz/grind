package serie2;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        int x;
        int y;
        int t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        x = sc.nextInt();
        System.out.println("Enter number: ");
        y = sc.nextInt();
        sc.close();

        t = x;
        x = y;
        y = t;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
