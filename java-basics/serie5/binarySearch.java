package serie5;

import java.util.Objects;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        final int MIN = 1;
        final int MAX = 100;

        int a = MIN;
        int b = MAX;

        Scanner sc = new Scanner(System.in);

        System.out.println("Think about a number between 1 and 100");

        String answer;
        do{
            System.out.print("Is it <, = or > than "
                                + search(a, b) + " ?");
            answer = sc.nextLine();

            if(Objects.equals(answer, ">")){
                a = search(a, b);
            }else if(Objects.equals(answer, "<")){
                b = search(a,b);
            }

        }while(!Objects.equals(answer, "="));

        System.out.println("Your number is " + search(a, b));

    }

    static int search(int upBound, int lowBound){
        return (upBound + lowBound)/2;
        //to avoid overflow --> pivot = min + (max -min)/2;
    };
}
