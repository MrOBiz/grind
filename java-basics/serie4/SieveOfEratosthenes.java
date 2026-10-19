package serie4;

public class SieveOfEratosthenes {
    public static void main(String[] args){
        int n = 100;
        boolean[] deleted = new boolean[n];

        for(int i = 2; i < n; i++){
            if(i%2==0 && i!=2){
                deleted[i] = true;
            }

            if(!deleted[i]){
                for(int j = i+1; j < n; j++){
                    if(j % i == 0){
                        deleted[j] = true;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(!deleted[i] && i > 1){
                System.out.println(i);
            }
        }
    }
}
