package serie5;

import java.util.Scanner;

public class AverageAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 evaluations: ");
        double markOne = sc.nextDouble();
        double markTwo = sc.nextDouble();

        System.out.println("Average is " + average(markOne, markTwo));
    }

    static double average(double note1, double note2){
        return (note1 + note2)/2.0;
    }
}
