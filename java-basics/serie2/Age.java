package serie2;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        int year;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        year = 2026 - age;
        System.out.println("You were born in " + year);
    }


}
