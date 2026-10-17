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
            System.out.print("Enter vector size: ");
            n = sc.nextInt();
        }while(n < 1 || n > nMax);

        for(int i = 0; i < n; i++){
            System.out.print("Enter v1 component " + i + " : ");
            v1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print("Enter v2 component " + i + " : ");
            v2[i] = sc.nextInt();
        }

        sc.close();

        double product = 0.0;
        for(int i = 0; i < n; i++){
            double t = v1[i]*v2[i];
            product += t;
        }

        System.out.println("The scalar product of vectors is: "+product);
    }
}
