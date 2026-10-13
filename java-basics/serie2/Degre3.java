package serie2;

import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        double x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();

        System.out.println("Enter b: ");
        b = sc.nextInt();

        System.out.println("Enter c: ");
        c = sc.nextInt();

        System.out.println("Enter x: ");
        x = sc.nextDouble();

        sc.close();

        double val;
        double sum = a+b;
        val = (sum/2)*x*x*x + sum*sum*x*x + sum +c;

        System.out.println("The value is " + val);
    }
}
