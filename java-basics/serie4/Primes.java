package serie4;

import java.util.ArrayList;

public class Primes {
    public static void main(String[] args){
        int n = 100;
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(i == 2){
                primes.add(i);
            }

            if(i % 2 != 0){
                boolean flag = false;
                for(int j = 3; j <= Math.sqrt(i); j+=2){
                    if(i % j == 0) {
                        flag = true;
                    }
                }
                if(flag == false){
                    primes.add(i);
                }
                flag = false;
            }
        }

        System.out.println("Primes found between 2 and "
                            + n + " :");
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }

}
