package serie2;

import java.util.Scanner;

public class Fondue {
    public static void main(String[] args) {
        final int BASE = 4;
        double cheese = 200.0 * BASE;
        double water = 0.5 * BASE;
        double ail = 0.5 * BASE;
        double bread = 100.0 * BASE;

        int hosts = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hosts: ");

        hosts = sc.nextInt();
        sc.close();

        double newCheese = cheese * hosts / BASE;
        double newWater = water * hosts / BASE;
        double newAil = ail * hosts / BASE;
        double newBread = bread * hosts / BASE;

        System.out.println("Here's the recipe: \n"
                            + newCheese + " gr of cheese \n"
                            + newWater + " dl of water \n"
                            + newAil + " cloves of garlic \n"
                            + newBread + " gr of bread \n"
                            + " Black pepper \n" );

    }
}
