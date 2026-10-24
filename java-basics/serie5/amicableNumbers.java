package serie5;

public class amicableNumbers {
    public static void main(String[] args){
        int[] numbers = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};

        System.out.println("The amicable pairs are: ");
        printAmicables(numbers);
    }

    static void printAmicables(int[] nums){
        int[] divsSum = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 1; j<=nums[i]; j++) {
                if (nums[i] % j == 0) {
                    sum += j;
                }
            }
            divsSum[i] = sum;
        }

        for(int i = 0; i < divsSum.length; i++){
            for(int j = divsSum.length -1; j > i; j--){
                if(divsSum[i] == divsSum[j]){
                    if(divsSum[j] == nums[i] + nums[j]){
                        System.out.println(nums[i] + " " + nums[j]);
                    }
                }
            }
        }
    }
}
