package serie3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        sc.close();

        if((num >= 2 && num < 3) || (num > 0 && num <= 1)
                || (num >= -10 && num <= -2)){
            System.out.println(num + " belongs to I");
        }else{
            System.out.println(num + " does not belong to I");
        }
    }
}
