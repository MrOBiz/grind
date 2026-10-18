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
            for(int j = 0; j < i+2; j++){
                triangle[i][j] = ;
            }
        }


    }
}
