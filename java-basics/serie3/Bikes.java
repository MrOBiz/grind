package serie3;

import java.util.Scanner;

public class Bikes {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Enter starting hour : ");
        int start = clavier.nextInt();
        System.out.print("Enter ending hour : ");
        int end = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final int RATEONE = 1;
        final int RATETWO = 2;

        while(start > end || start < 0 || end < 0
                || end > 24 || start > 24){
            System.out.print("Enter VALID starting hour : ");
            start = clavier.nextInt();
            System.out.print("Enter VALID ending hour : ");
            end = clavier.nextInt();
        }

        if(start == end){
            System.out.print("Starting and ending times are the same");
        }else{
            int totalAmount = 0;
            int timeReducedFare = 0;
            int timeMaxFare = 0;

            if((start >= 0 && end <= 7)||(start >= 17 && end <= 24)){
                timeReducedFare += (end - start);
            }else if((start >= 7 && end <= 17)){
                timeMaxFare += (end - start);
            }

            System.out.println("You rented a bike for: ");
            System.out.print("Total: ");
            System.out.println(" $");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
