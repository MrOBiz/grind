package serie5;

public class recovery {
    static final int DIM = 10;

    public static void main(String[] args){
        boolean[][] grid = new boolean[DIM][DIM];
        char[] direction = {'n','s','e','w'};

        grid[2][3] = true;
        grid[2][4] = true;
        grid[2][5] = true;
        printGrid(grid);

    }

    static boolean fill(boolean[][] grid, int lin, int col,
                                 char dir, int length){
        return true;
    }

    static void printGrid(boolean[][] g){
        for(int i = 0; i < DIM; i++){
            for(int j = 0; j <  DIM; j++){
                if(!g[i][j]) {
                    System.out.print("_");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }}
