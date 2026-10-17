package serie4;

import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args){
        int row1, row2;
        int col1, col2;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number of M1 rows: ");
            row1 = sc.nextInt();
        }while(row1 <= 0);

        do{
            System.out.print("Enter number of M1 columns: ");
            col1 = sc.nextInt();
        }while(col1 <= 0);

        do{
            System.out.print("Enter number of M2 rows: ");
            row2 = sc.nextInt();
        }while(row2 <= 0);

        do{
            System.out.print("Enter number of M2 columns: ");
            col2 = sc.nextInt();
        }while(col2 <= 0);



        double[][] mat1 = new double[row1][col1];
        double[][] mat2 = new double[row2][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print("Enter M1's element for row " + (i+1)
                                    + " column " + (j+1) + " : ");
                mat1[i][j] = sc.nextDouble();
            }
        }

        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print("Enter M2's element for row " + (i+1)
                        + " column " + (j+1) + " : ");
                mat2[i][j] = sc.nextDouble();
            }
        }

        if(col1==row2){
            System.out.println("Here's M1: ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.println("M1" + (i+1) + (j+1)
                                    + " = " + mat1[i][j]);
                }
            }

            System.out.println("Here's M2: ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.println("M2" + (i+1) + (j+1)
                            + " = " + mat2[i][j]);
                }
            }

            System.out.println("Multiplication results: ");
            //for(int i = 0; i)

        }else{
            System.out.println("Columns of M1 != rows M2");
        }

    }
}
