package serie7;

import java.util.Scanner;

public class treeDecoration {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        String[][] tree = buildTree();
        drawTree(tree);

    }

    static String[][] buildTree(){
        int dim;
        String sym;

        do{
            System.out.println("How many floors does the tree have? ");
            dim = sc.nextInt();
            sc.nextLine();
        }while(dim < 8 || dim > 35);

        System.out.println("What symbol should be used to draw?");
        sym = sc.nextLine();

        String[][] tree = new String[dim][];

        for(int i = 0; i < tree.length; i++){
            tree[i] = new String[tree.length*2 - 1];
            for(int j = 0; j < tree.length*2 - 1; j++){
                tree[i][j] = " ";
            }

            //for(int j = 0; j < tree.length - i -1; j++){
            //    tree[i][j] = " ";
            //}

            for(int j = 0; j < (i*2) +1 ; j++){
                tree[i][tree.length - i -1 + j] = sym;
            }
        }

        return tree;
    }

    static void drawTree(String[][] tree){
        for(int i = 0; i < tree.length; i++){
            for(int j = 0; j < tree[i].length; j++){
                System.out.print(tree[i][j]);
            }
            System.out.println();
        }
    }
}
