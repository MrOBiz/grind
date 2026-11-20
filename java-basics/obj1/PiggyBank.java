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

        System.out.println("Donnez le budget de vos vacances : ");
        budget = input.nextDouble();

        // total after holiday
        double solde = piggy.calcTotal(budget);

        if (solde >= 0) {
            System.out.println("Vous etes assez riche pour partir en vacances !");
            System.out.print(" il vous restera " + solde + " euros");
            System.out.print(" a la rentree \n");
            piggy.draw(budget);
        }

        else {
            System.out.print("Il vous manque " + (-solde) + " euros");
            System.out.print(" pour partir en vacances !\n");
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
