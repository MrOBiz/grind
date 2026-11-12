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
        }while(dim < 8 || dim > 35);

        System.out.println("What symbol should be used to draw?");
        sym = sc.nextLine();

        int[][] tree = new int[dim][];

        for(int i = 0; i < tree.length; i++){
            for(int j = 0; j < tree[i].length; j++){

            }
        }


        return tree;
    }
}
