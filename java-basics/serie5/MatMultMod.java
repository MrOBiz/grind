package serie5;

import java.util.Scanner;

public class MatMultMod {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        double[][] mat1 = readMat();
        double[][] mat2 = readMat();
        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication is impossible!");
        } else {
            double [][] prod = multiply(mat1, mat2);
            System.out.println("Result :");
            printMat(prod);
        }
    }

    static double[][] readMat(){
        int row, col;
        double[][] mat;

        do{
            System.out.print("Enter number of matrix rows: ");
            row = sc.nextInt();
        }while(row <= 0);

        do{
            System.out.print("Enter number of matrix columns: ");
            col = sc.nextInt();
        }while(col <= 0);

        mat = new double[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter M1's element for row " + (i+1)
                        + " column " + (j+1) + " : ");
                mat[i][j] = sc.nextDouble();
            }
        }

        return mat;
    }

    static double[][] multiply(double[][] mat1, double[][] mat2){
        double[][] result = new double[mat1.length][mat2[0].length];

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                for(int k=0;k<mat2.length;k++){
                    result[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }

        return result;
    }

    static void printMat(double[][] mat){
        System.out.println("Multiplication Matrix: ");
        for(int i = 0 ; i<mat.length; i++){
            for(int j  = 0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*NON MODULARIZED VERSION

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
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("M2" + (i+1) + (j+1)
                        + " = " + mat2[i][j]);
            }
        }

        double[][] mat3 = new double[row1][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    mat3[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }

        System.out.println("Multiplication Matrix: ");
        for(int i = 0 ; i<row1; i++){
            for(int j  = 0; j<col2; j++){
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

    }else{
        System.out.println("Columns of M1 != rows M2");
    }

}*/


