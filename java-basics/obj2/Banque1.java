package obj2;

public class Banque1 {
    public static void main(String[] args) {
        Account simpleP = new Account(1000.0, 0.01);
        Account savP = new Account(2000.0, 0.02);
        Customer Ped = new Customer("Pedro", "Geneva", simpleP, savP);

        Account simpleA = new Account(3000.0, 0.01);
        Account savA = new Account(4000.0, 0.02);
        Customer Alex = new Customer("Alexandra", "Lausanne", simpleA, savA);

        System.out.println("Data before interests: ");
        Ped.printCustomer();
        Alex.printCustomer();

        simpleP.addInterest();
        savP.addInterest();

        simpleA.addInterest();
        savA.addInterest();

        System.out.println("Data after interests: ");
        Ped.printCustomer();
        Alex.printCustomer();

    }
}

class Account{
    private double total, rate;

    public Account(double total, double rate){
        this.rate = rate;
        this.total = total;
    }

    public double getTotal(){
        return total;
    }

    public void addInterest(){
        double interest = rate*total;
        total = total + interest;
    }
}

class Customer{
    private String name, place;
    private Account simple, saving;

    public Customer(String name, String place, Account simple, Account saving){
        this.name = name;
        this.place = place;
        this.simple = simple;
        this.saving = saving;
    }

    public void printCustomer(){
        System.out.println("Customer " + name + " from " + place);
        System.out.println(" Private account: " + simple.getTotal() + " francs");
        System.out.println(" Savings account: " + saving.getTotal() + " francs");
    }
}

