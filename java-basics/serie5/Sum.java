package serie5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter number for recursive sum: ");
            num = sc.nextInt();
        }while(num<0);

        System.out.println("The sum is: " + sum(num));
    }

    static int sum(int n){
        if(n!=0) {
            return n + sum(n - 1);
        }else{
            return 0;
        }
    }
}
