package obj2;

public class Poem {
    public static void main(String[] args)
    {
        Flower f1 = new Flower("Violette", "bleu");
        Flower f2 = new Flower(f1);
        System.out.print("dans un cristal ");
        f2.open();
        System.out.print("ne laissant plus ");
        System.out.println(f1);
        System.out.println(f2);
    }

}

class Flower{
    private String type;
    private String color;

    public Flower(String type, String color){
        this.type = type;
        this.color = color;
    }

    public Flower(Flower other){
        this.type = other.type;
        this.color = other.color;
    }

    public void open(){

    }
}
