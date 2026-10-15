package serie3;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rest = num % 2;

        if(num > 0){
            System.out.print("Positive number ");
            String parity = (rest == 0) ? "EVEN" : "ODD";
            System.out.println(parity);
        }else if(num < 0){
            System.out.print("Negative number ");
            String parity = (rest == 0) ? "EVEN" : "ODD";
            System.out.println(parity);
        }else if(num == 0){
            System.out.println("Number is zero (and even)");
        }

        sc.close();
    }
}
