package serie3;

import java.util.Scanner;

public class Rebound2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final double G = 9.81;
        double startingHeight = 0;
        double reboundCoeff = 0;
        double finalHeight = 0;
        double reboundNum = 0;

        do{
            System.out.println("Enter starting height: ");
            startingHeight = sc.nextDouble();
        }while(startingHeight < 0);

        do{
            System.out.println("Enter rebound coefficient: ");
            reboundCoeff = sc.nextDouble();
        }while(reboundCoeff < 0 || reboundCoeff >= 1);

        do{
            System.out.println("Enter desired rebound height: ");
            finalHeight = sc.nextDouble();
        }while(finalHeight < 0 || finalHeight > startingHeight);
        sc.close();

        double initialH = startingHeight;
        double initialV = Math.sqrt(2*initialH*G);
        double finalV = reboundCoeff*initialV;
        double finalH = Math.pow(finalV, 2.0)/(2*G);

        while(finalH > finalHeight){
            initialH = finalH;
            initialV = Math.sqrt(2*initialH*G);

            finalV = reboundCoeff*initialV;
            finalH = Math.pow(finalV, 2.0)/(2*G);

            reboundNum++;
        }

        System.out.println("Number of rebounds before reaching " + finalHeight + " : "+ reboundNum);
    }
}
