package obj1;

public class PiggyBank {
    public static void main(String[] args) {
        Bank piggy = new Bank();

        piggy.empty();
        piggy.close();
        piggy.print();

        piggy.deposit(20.0);
        piggy.close();
        piggy.print();

        piggy.fill(550.0);
        piggy.close();
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
