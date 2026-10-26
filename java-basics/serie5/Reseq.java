package serie5;

import java.util.Scanner;

public class Reseq {
    static final double EPSILON = 1e-6;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double point = 0.0;

        do {
            System.out.print("Starting point: ");
            point = sc.nextDouble();

            System.out.println("At point " + point
                                + " : f(x) = " + f(point)
                                + " f'(x) = " + df(point));
        }while(Math.abs(f(point) - df(point)) > EPSILON);

        System.out.print("Solution: " + point);

    }

    static double f(double x){
        return (x -1.0)*(x -1.5)*(x -2.0);
    }

    static double df(double x){
        return (f(x + EPSILON)
                - f(x))/EPSILON;
    }
}
