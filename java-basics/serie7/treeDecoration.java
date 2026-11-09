package serie7;

import java.util.Scanner;

public class treeDecoration {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

    }

    static int[][] drawTree(){
        int dim;
        String sym;

        do{
            System.out.println("How many floors does the tree have? ");
            dim = sc.nextInt();
            sc.nextLine();
        }while(dim <= 0 || dim > 35);

        System.out.println("What symbol should be used to draw?");
        sym = sc.nextLine();

        int[][] tree = new int[0][0];


        return tree;
    }
}
