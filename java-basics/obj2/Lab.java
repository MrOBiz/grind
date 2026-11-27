package obj2;

class Mouse {
    public static final int LIFE_DURATION = 36;
    private int weight, age, lifeExpectancy;
    private String color;
    private boolean cloned;

    public Mouse(int weight, String color, int age){
        System.out.println("A new mouse is born!");
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.cloned = false;
        this.lifeExpectancy = LIFE_DURATION;
    }

    public Mouse(int weight, String color){
        System.out.println("A new mouse is born!");
        this.weight = weight;
        this.color = color;
        this.age = 0;
        this.cloned = false;
        this.lifeExpectancy = LIFE_DURATION;
    }

    public Mouse(Mouse other){
        System.out.println("A new mouse is CLONED!");
        this.weight = other.weight;
        this.color = other.color;
        this.age = other.age;
        this.cloned = true;
        this.lifeExpectancy = (LIFE_DURATION*4)/5;
    }

    public String toString(){
        if(!cloned) {
            return "A " + color + " mouse, "
                    + age + " months old and weighing "
                    + weight + "gr";
        }else{
            return "A " + color + " CLONED mouse, "
                    + age + " months old and weighing "
                    + weight + "gr";
        }
    }

    public void ageUp(){
        age++;
        if(cloned && age > lifeExpectancy/2){
            color = "green";
        }
    }

    public void evolve(){
        age = lifeExpectancy;
    }

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
        s3.ageUp();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
