package serie5;

import java.util.Scanner;

public class Mins {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double x, y, z;

        System.out.print("Enter the value of x: ");
        x = sc.nextDouble();

        System.out.print("Enter the value of y: ");
        y = sc.nextDouble();

        System.out.print("Enter the value of z: ");
        z = sc.nextDouble();

        double min = min2(x, y);
        System.out.printf("The minimum value of the first 2 is %.2f\n", min);

        min = min3(x, y, z);
        System.out.printf("The minimum value of the 3 is %.2f\n", min);

    }

    static double min2(double a, double b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    static double min3(double a, double b, double c){
        return (c<min2(a, b))? c : min2(a, b);
    }
}
