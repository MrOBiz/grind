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
        final int SOS = 0;
        final int EOM = 7;
        final int EOA = 17;
        final int EOD = 24;

        while(start > end || start < SOS || end < SOS
                || end > EOD || start > EOD){
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

            if((start >= SOS && end <= EOM)||(start >= EOA && end <= EOD)){
                timeReducedFare += (end - start);
            }else if((start >= EOM && end <= EOA)){
                timeMaxFare += (end - start);
            }else if((start >= SOS && start <= EOM)&&(end >= EOA && end <= EOD)){
                timeReducedFare += (EOM - start) + (end - EOA);
                timeMaxFare += (EOA - EOM);
            }

            System.out.println("You rented a bike for: " + (timeMaxFare + timeReducedFare) + " hour(s)");
            System.out.print("Total: " + (timeMaxFare*RATETWO + timeReducedFare*RATEONE));
            System.out.println("$");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
