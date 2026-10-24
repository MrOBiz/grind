package serie5;

public class Concat {
    public static void main(String[] args){
        String s = "China Blue";
        System.out.println(s);
        s = concatener(s, " Express");
        System.out.println(s);
    }
    public static String concatener(String s, String s2)
    {
        return s +=s2;
    }

}
