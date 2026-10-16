package serie3;

public class SequenceAndSeries {
    public static void main(String[] args){
        double start = 1;
        double sum = start;
        int numOfTerms = 10;

        for(int i=0; i<=numOfTerms; i++){
            System.out.println("U" + i + " = " + start);
            int t = i;
            start = start/++t;
            sum = sum + start;
        }

        System.out.println("The corresponding series converges to: " + sum);
    }
}
