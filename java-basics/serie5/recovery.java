package serie5;

import java.util.Scanner;

public class recovery {
    static Scanner sc = new Scanner(System.in);
    static final int DIM = 10;

    public static void main(String[] args) {
        boolean[][] grid = new boolean[DIM][DIM];
        String dirs = "NSEW";

        int x = 0, y = 0, size = 0;
        String dir;

        do{
            System.out.print("Enter x: ");
            x = sc.nextInt();
            if(x<0 || x > DIM -1) break;

            System.out.print("Enter y: ");
            y = sc.nextInt();
            sc.nextLine();
            if(y<0 || y > DIM -1) break;

            System.out.print("Enter direction (N,S,E,W): ");
            dir = sc.nextLine();
            if (dir.length() != 1 || !dirs.contains(dir)) break;

            System.out.print("Enter size: ");
            size = sc.nextInt();
            sc.nextLine();
            if (size<0 || size > DIM - 1) break;

            System.out.println("Positioning in (" + x + ", " + y
                            + "), direction " + dir + ", size "
                            +  size + " --> " + fill(grid, x, y, dir.charAt(0), size));

            printGrid(grid);
        }while(true);

        System.out.println("FINAL GRID: ");
        printGrid(grid);

    }

    static boolean fill(boolean[][] grid, int row, int col,
                        char dir, int length) {

        //Verification (Are cells in the grid? Occupied?)
        switch (dir){
            case 'N':
                if(row - (length -1) >= 0) {
                    for(int i = 0; i < length; i++){
                        if(grid[row - i][col]){
                            return false;
                        }
                    }

                    for (int i = 0; i < length; i++) {
                        grid[row - i][col] = true;
                    }
                }else{
                    return false;
                }
                break;

            case 'S':
                if(row + (length -1) <= DIM -1) {
                    for(int i = 0; i < length; i++){
                        if(grid[row + i][col]){
                            return false;
                        }
                    }

                    for (int i = 0; i < length; i++) {
                        grid[row + i][col] = true;
                    }
                }else{
                    return false;
                }
                break;

            case 'E':
                if(col + (length -1) <= DIM -1) {
                    for(int i = 0; i < length; i++){
                        if(grid[row][col + i]){
                            return false;
                        }
                    }

                    for (int i = 0; i < length; i++) {
                        grid[row][col + i] = true;
                    }
                }else{
                    return false;
                }
                break;

            case 'W':
                if(col - (length -1) >= 0) {
                    for(int i = 0; i < length; i++){
                        if(grid[row][col - i]){
                            return false;
                        }
                    }

                    for (int i = 0; i < length; i++) {
                        grid[row][col - i] = true;
                    }
                }else{
                    return false;
                }
                break;
        }
        return true;
    }

    static void printGrid(boolean[][] g) {
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                System.out.print((!g[i][j])? "_" : "#");
            }
            System.out.println();
        }
    }
}
