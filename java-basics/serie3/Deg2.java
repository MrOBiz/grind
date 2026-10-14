package serie3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Deg2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double a = 0.0, b = 0.0, c = 0.0;

        while (a == 0.0) {
            System.out.println("Enter non zero value for a: ");
            a = sc.nextDouble();
        }

        System.out.print("Enter value for b: ");
        b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        c = sc.nextDouble();


        double delta = b*b - 4.0*a*c;

        if(delta < 0.0){
            System.out.println("No real solution");
        }else if(delta == 0.0){
            double sol = -b/(2*a);
            System.out.println("Single solution: " + sol);
        }else if(delta > 0.0){
            double solPos = (-b + sqrt(delta))/(2*a);
            double solNeg = (-b - sqrt(delta))/(2*a);
            System.out.println("Double solution: " + solPos
                                + " and " + solNeg);
        }
    }
}
