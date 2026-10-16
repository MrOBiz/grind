package serie3;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args){
        int lines;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        lines = sc.nextInt();

        sc.close();

        for(int i = 0; i <= lines; i++){
            for(int j = 0; j < lines-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
