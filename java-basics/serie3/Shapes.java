package serie3;

public class Shapes {
    public static void main(String[] args){
        int lines = 10;
        for(int j=0; j<lines ;j++){
            for(int k=1; k <= lines - j; k++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
