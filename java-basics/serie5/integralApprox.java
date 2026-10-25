package serie5;

import java.util.Scanner;

public class integralApprox {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double a, b;
        a = input();
        b = input();

        System.out.println("Result: " + integrate(a, b));
    }

    static double input(){
        System.out.print("Enter bound (int): ");
        double val = sc.nextDouble();

        return val;
    }

    static double f (double x){
        return Math.sin(x);
    }

    static double integrate(double a, double b){
        double val = ((b-a)/840)*(41*f(a) + 216*f((5*a+b)/6)
                + 27*f((2*a+b)/3) + 272*f((a+b)/2) + 27*f((a+2*b)/3)
                + 216*f((a+5*b)/6) + 41*f(b));

        return val;
    }
}
