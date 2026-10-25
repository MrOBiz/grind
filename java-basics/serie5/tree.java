package serie5;

public class tree {
    public static void main(String[] args){
        int numLines = 3;

        for(int i=1; i<numLines; i++) {
            spaces(numLines-i);
            stars(2*i-1);
            System.out.println();
        }


    }

    static void stars(int numStars){
        for(int i = 0; i < numStars; ++i) {
            System.out.print('*');
        }
    }

    static void spaces(int numSpaces){
        for(int i = 0; i < numSpaces; ++i) {
            System.out.print('_');
        }
    }
}
