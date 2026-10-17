package serie4;

import java.util.Scanner;

public class Scalar {
    public static void main(String[] args) {
        int nMax = 10;
        int n;
        double[] v1 = new double[nMax];
        double[] v2 = new double[nMax];


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter vector size: ");
            n = sc.nextInt();
        }while(n < 1 || n > nMax);

        sc.close();
    }
}
