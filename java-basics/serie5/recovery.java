package serie5;

import java.util.Scanner;

public class recovery {
    static Scanner sc = new Scanner(System.in);
    static final int DIM = 10;

    public static void main(String[] args) {
        boolean[][] grid = new boolean[DIM][DIM];
        char[] dirs = {'n', 's', 'e', 'w'};

        int x = 0, y = 0;
        String dir;

        do{
            System.out.print("Enter x: ");
            x = sc.nextInt();
            if(x<0) break;

            System.out.print("Enter y: ");
            y = sc.nextInt();
            sc.nextLine();
            if(y<0) break;

            System.out.print("Enter direction (n,s,e,w): ");
            dir = sc.nextLine();

        }while(true);

        grid[2][3] = true;
        grid[2][4] = true;
        grid[2][5] = true;
        printGrid(grid);

    }

    static boolean fill(boolean[][] grid, int lin, int col,
                        char dir, int length) {
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
