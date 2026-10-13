package serie2;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = 84.9;
        double height = 1.83;

        System.out.println("Enter weight in kg: ");
        weight = scanner.nextDouble();
        System.out.println("Enter height in cm: ");
        height = scanner.nextDouble();



        double imc = weight /(height * height);

        System.out.println("For " + weight
                            + " kg and " + height
                            + " m, the IMC is " + imc);
    }
}
