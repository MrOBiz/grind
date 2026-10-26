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
            if(x<0) break;

            System.out.print("Enter y: ");
            y = sc.nextInt();
            sc.nextLine();
            if(y<0) break;

            System.out.print("Enter direction (N,S,E,W): ");
            dir = sc.nextLine();
            if (dir.length() == 1 && !dirs.contains(dir)) break;

            System.out.print("Enter size: ");
            size = sc.nextInt();
            sc.nextLine();
            if (size<0) break;

            System.out.print("Positioning in (" + x + ", " + y
                            + "), direction " + dir + ", size "
                            +  size + " --> " + fill(grid, x, y, dir.charAt(0), size));

            printGrid(grid);
        }while(true);

        System.out.println("FINAL GRID: ");
        printGrid(grid);

    }

    static boolean fill(boolean[][] grid, int row, int col,
                        char dir, int length) {

        //Verification of the space occupied

        //Placement
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
