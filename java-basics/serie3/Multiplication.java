package serie3;

public class Multiplication {
    public static void main(String[] args){
        System.out.println("Multiplication table");

        final int MAX = 11;

        for(int i=1; i<MAX; i++){
            System.out.println("Table of " + i);
            for(int j = 0; j<11; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
