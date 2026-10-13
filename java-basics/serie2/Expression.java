package serie2;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args){
        int sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("How much: ");
        sum = sc.nextInt();

        int items = sum * 3/4;
        System.out.println("Essential expenses: " + items
                            + "\n You can then buy: ");


        int left = (sum - items) / 3;

        int cafe = left/2;
        int paper = left/4;
        int metro = left/3;

        int rest = (sum - items) % 3;

        System.out.println( cafe + "cafés");
        System.out.println( paper + "papers");
        System.out.println( metro + "tickets");
        System.out.println( rest + " stay at the end");

    }
}
