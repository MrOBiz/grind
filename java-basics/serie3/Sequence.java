package serie3;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start;
        do {
            System.out.print("From (>= 1) ? ");
            start = sc.nextInt();
        } while (start < 1);

        int end;
        do {
            System.out.print("To (>= " + start + ") ? ");
            end = sc.nextInt();
        } while (end < start);

        int counter = 0;
        for(int i = start; i <=end; i++){
            int num = i;
            while(num != 0){
                if(num % 3 == 0){
                    num = num + 4;
                    counter++;
                }else if(num % 4 == 0){
                    num = num / 2;
                    counter++;
                }else{
                    num -= 1;
                    counter++;
                }
            }
            System.out.println(i + " -> "  + counter);
            counter = 0;
        }

        sc.close();
    }
}
