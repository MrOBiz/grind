package serie4;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int triangleDepth;

        do {
            System.out.print("Enter integer bigger than 0: ");
            triangleDepth = sc.nextInt();
        }while(triangleDepth < 1);

        int[][] triangle = new int[triangleDepth][];

        for(int i = 0; i < triangleDepth; i++){
            for(int j = 0; j < i+1; j++){
                triangle[i] = new int[i+1];

                if(j == 0 || j == i){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = triangle[i - 1][j -1]
                                    + triangle[i - 1][j];
                }
            }
        }


    }
}
