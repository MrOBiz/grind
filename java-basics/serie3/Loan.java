package serie3;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double loanAmount;
        double fixedPayment;
        double interestRate;
        double variableInterest = 0.0;
        double totalVariableInterest = 0.0;
        double remainder;

        do{
            System.out.println("Enter loan amount: ");
            loanAmount = sc.nextDouble();
        }while(loanAmount <=0);

        do{
            System.out.println("Enter fixed payment: ");
            fixedPayment = sc.nextDouble();
        }while(fixedPayment <=0);

        do {
            System.out.println("Enter interest rate: ");
            interestRate = sc.nextDouble();
        }while(interestRate < 0 || interestRate > 1);

        sc.close();
        remainder = loanAmount;

        while(remainder > 0){
            variableInterest = remainder * interestRate;
            remainder = remainder - fixedPayment;
            totalVariableInterest += variableInterest;
        }

        System.out.println("Total interests paid: " + totalVariableInterest);

    }
}
