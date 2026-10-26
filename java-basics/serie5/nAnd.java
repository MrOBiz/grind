package serie5;

import java.util.Scanner;

public class nAnd {

    public static void main(String[] args){
        boolean[] x = {true, false};
        boolean[] y = {true, false};

        for(int i = 0; i < x.length; ++i) {
            System.out.println(not(x[i]));
            System.out.println();
            for(int j = 0; j < y.length; ++j) {
                System.out.println(nAnd(x[i], y[j]));
                System.out.println(and(x[i], y[j]));
                System.out.println(or(x[i], y[j]));
                System.out.println();
            }
        }

    }

    static boolean nAnd(boolean a, boolean b)
    {
        return !(a && b);
    }

    static boolean not(boolean a)
    {
        return nAnd(a,a);
    }

    static boolean and(boolean a, boolean b)
    {
        return nAnd(nAnd(a,b),nAnd(a,b));
    }

    static boolean or(boolean a, boolean b)
    {
        return nAnd(not(a), not(b));
    }
}
