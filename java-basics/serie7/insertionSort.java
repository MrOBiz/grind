package serie7;

public class insertionSort {
    public static void main(String[] args){
        int[] numbers = {17, 4, 12, 1, 19, 7, 14, 3, 10, 16, 2, 20, 8, 5, 13, 9, 18, 6, 15, 11};

        for(int val : numbers) {
            System.out.print(val + " ");
        }

        for(int k = numbers.length/2; k >= 1; k /= 2){
            for(int i = k+1; i < numbers.length; i++){
                int j = i-k;
                while(j > 0){
                    if(numbers[j] > numbers[j+k]){
                        int t = numbers[j];
                        numbers[j] = numbers[j+k];
                        numbers[j+k] = t;
                        j = i-k;
                    }else{
                        j = 0;
                    }
                }
            }
        }

        System.out.println();

        for(int val : numbers) {
            System.out.print(val + " ");
        }
    }
}
