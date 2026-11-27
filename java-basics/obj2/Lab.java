package obj2;

public class Mouse {
    public static final int LIFE_DURATION = 36;


}

public class Lab {
    public static void main(String[] args) {
        Mouse s1 = new Mouse(50, "white", 2);
        Mouse s2 = new Mouse(45, "grey");
        Mouse s3 = new Mouse(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.evolve();
        s2.evolve();
        s3.evolve();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
