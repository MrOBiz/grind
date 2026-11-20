package obj1;

import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Bank piggy = new Bank();

        piggy.empty();
        piggy.shake();
        piggy.print();

        piggy.draw(20.0);
        piggy.shake();
        piggy.print();

        piggy.fill(550.0);
        piggy.shake();
        piggy.print();

        piggy.draw(10.0);
        piggy.draw(5.0);
        piggy.print();

        System.out.println();

        // holiday budget
        double budget;
        Scanner input = new Scanner(System.in);

        System.out.println("Give holiday budget: ");
        budget = input.nextDouble();

        // total after holiday
        double solde = piggy.calcTotal(budget);

        if (solde >= 0) {
            System.out.println("You have enough for a holiday!");
            System.out.print(" You'll be left with " + solde + "$");
            System.out.print(" once back \n");
            piggy.draw(budget);
        }

        else {
            System.out.print("You need " + (-solde) + "$");
            System.out.print(" to go on holiday!\n");
        }
        input.close();
    }
}

class Bank{
    private double amount;

    public double getAmount(){
        return amount;
    }

    public void print(){
        if(amount <= 0.0){
            System.out.print("You're out of cash!");
        }else{
            System.out.print(amount + "$ in the bank");
        }
    }

    public void shake(){
        if(amount <= 0.0){
            System.out.print("...");
        }else{
            System.out.println("Bing bing");
        }
    }

    public void fill(double val){
        if(val > 0.0) amount+=val;
    }

    public void empty(){
        amount = 0;
    }

    public void draw(double val){
        if(val < 0.0) val = 0.0;
        if(val > amount) val = amount;
        amount = amount - val;
    }

    public double calcTotal(double budget){
        if(budget <= 0) return amount;
        return amount - budget;
    }
}
