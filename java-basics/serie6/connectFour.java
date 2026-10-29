package serie6;

import java.util.Scanner;

public class connectFour {
    static Scanner sc = new Scanner(System.in);

    private final static int EMPTY = 0;
    private final static int YELLOW = 1;
    private final static int RED = 2;
    private final static int SIZE = 8;

    public static void main(String[] args){
        int[][] grid = new int[7][SIZE];
        int activePlayer = RED;
        boolean victory = false;

        /*initialize(grid);
        play(grid, YELLOW, 1);
        play(grid, RED, 1);
        print(grid);*/

        do{
            int col;
            if(activePlayer == RED){
                do {
                    System.out.print("X: enter column number--> ");
                    col = sc.nextInt();
                    sc.nextLine();
                }while(col <= 0 || col > SIZE-1);
            }else{
                do {
                    System.out.print("O: enter column number--> ");
                    col = sc.nextInt();
                    sc.nextLine();
                }while(col <= 0 || col > SIZE-1);
            }

            //--col;

            boolean valid = play(grid, activePlayer, col);
            if(!valid) System.out.println("The move was invalid.");

            print(grid);

            victory = winCon(grid, activePlayer);
            activePlayer = (activePlayer == RED)? YELLOW : RED;

        }while(!victory);

    }

    static int count(int[][] grid, int startRow, int startCol, int dirRow, int dirCol){
        int counter = 0;
        int row = startRow, col = startCol;

        while(grid[row][col] == grid[startRow][startCol]
                && row >= 0 && row < grid.length-1
                && col >= 0 && col < grid[row].length){

            counter++;
            row = row + dirRow;
            col = col + dirCol;
        }

        return counter;
    }

    static boolean winCon(int[][] grid, int player){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == player){
                    if(count(grid, i, j, -1, 1) >= 4
                            || count(grid, i, j, 0, 1) >= 4
                            || count(grid, i, j, 1, -1) >=4
                            || count(grid, i, j, 1, 0) >= 4) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static boolean play(int[][] grid, int color, int col){
        int row = grid.length-1;
        while(row >= 0 && grid[row][col] != EMPTY){
            row--;
        }

        if(row >= 0){
            grid[row][col] = color;
            return true;
        }
        return false;
    }


    static void initialize(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = EMPTY;
            }
        }
    }

    static void print(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                switch(grid[i][j]){
                    case EMPTY:
                        System.out.print(' ');
                        break;

                    case YELLOW:
                        System.out.print('O');
                        break;

                    case RED:
                        System.out.print('X');
                        break;

                    default:
                        System.out.print("Nothing to print");
                        break;
                }
                System.out.print('|');
            }
            System.out.println();
        }

        System.out.print('=');
        for(int i = 1; i < grid[0].length; i++){
            System.out.print("=" + i);
        }
        System.out.println("==\n");
    }
}
