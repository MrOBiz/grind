package serie3;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.print("Positive number");
            num % 2 == 0 ? System.out.println("EVEN") : System.out.println("ODD");
        }else if(num < 0){
            System.out.println("Negative number");
            num % 2 == 0 ? System.out.println("EVEN") : System.out.println("ODD");
        }else if(num == 0){
            System.out.println("Number is zero (and even)");
        }

        sc.close();
    }
}
