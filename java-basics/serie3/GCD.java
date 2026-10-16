package serie3;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int first;
        int second;
        int remainder = 1;

        System.out.print("Enter first positive integer: ");
        first = sc.nextInt();

        System.out.print("Enter second positive integer: ");
        second = sc.nextInt();
        sc.close();

        if(first == second){
            System.out.print("GCD: " + first);
        }else if (first < second){
            int t = first;
            first = second;
            second = t;

            while(remainder != 0){
                remainder = first % second;
                first = second;
                second = remainder;
            }

            System.out.println("GCD: " + first);
        }else if(first > second){
            while(remainder != 0){
                remainder = first % second;
                first = second;
                second = remainder;
            }

            System.out.println("GCD: " + first);
        }

    }
}
