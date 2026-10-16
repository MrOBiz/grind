package serie3;

import java.util.Scanner;

public class Eqthird {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextDouble();

        System.out.print("Enter b: ");
        b = sc.nextDouble();

        System.out.print("Enter c: ");
        c = sc.nextDouble();

        double q = (3 * b - a * a) / 9;
        double r = (9 * a * b - 27 * c - 2 * a * a * a) / 54;
        double d = q * q * q + r * r;

        if (d < 0) {
            double arg = r / Math.sqrt((-q) * (-q) * (-q));
            arg = Math.max(-1.0, Math.min(1.0, arg));
            double theta = Math.acos(arg);

            double zOne = 2 * Math.sqrt(-q) * Math.cos(theta / 3) - (a / 3);
            double zTwo = 2 * Math.sqrt(-q) * Math.cos((theta + 2 * Math.PI) / 3) - (a / 3);
            double zThree = 2 * Math.sqrt(-q) * Math.cos((theta + 4 * Math.PI) / 3) - (a / 3);

            System.out.println("3 Solutions: " + zOne
                    + " " + zTwo + " "
                    + zThree);
        } else {
            double s = Math.cbrt(r + Math.sqrt(d));
            double t = Math.cbrt(r - Math.sqrt(d));

            if (d == 0 && (s + t) != 0) {
                double zOne = s + t - (a / 3);
                double zTwo = -(s + t) / 2 - (a / 3);

                System.out.println("2 Solutions: " + zOne
                        + " " + zTwo);
            } else {
                double zSingle = s + t - (a / 3);

                System.out.println("1 Solution: " + zSingle);
            }
        }
    }
}
