package serie6;

public class connectFour {
    private final static int EMPTY = 0;
    private final static int YELLOW = 1;
    private final static int RED = 2;
    private final static int SIZE = 7;

    public static void main(String[] args){
        int[][] grid = new int[SIZE][SIZE];

        initialize(grid);
        print(grid);
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
        for(int i = 1; i <= grid[0].length; i++){
            System.out.print("=" + i);
        }
        System.out.println("==\n");
    }
}
