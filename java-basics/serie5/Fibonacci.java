package serie5;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        String answer;

        do {
            do {
                System.out.print("Enter an integer between 0 and 40: ");
                n = sc.nextInt();
                sc.nextLine();
            } while (n < 0 || n > 40);

            int val = FibonacciIterative(n);
            System.out.println("Fibonacci iterative: F(" + n + ") = " + val);

            val = FibonacciRecursive(n);
            System.out.println("Fibonacci recursive: F(" + n + ") = " + val);


            System.out.print("Do you want to continue (y/n): ");
            answer = sc.nextLine();
        }while(answer.equalsIgnoreCase("y"));
    }


    static int FibonacciIterative(int n)
    {
        int Fn = 0;
        int Fn_1 = Fn;
        int Fn_2 = 1;

        for (int i = 1; i <= n; ++i) {
            Fn = Fn_1 + Fn_2;
            Fn_2 = Fn_1;
            Fn_1 = Fn;
        }

        return Fn;
    }


    static int FibonacciRecursive(int n){
        return 0;
    }
}
