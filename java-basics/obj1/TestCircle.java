package obj1;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();

        c1.setCenter(2.5, 3.2);
        c1.setRadius(5.0);
        System.out.println(c1.surface());
    }
}

class Circle{
    private double radius;
    private double x, y;

    public void setCenter(double x, double y){
        this.x = x;
        this.y = y;
    };

    public void setRadius(double r){
        this.radius = r;
    };

    public double surface(){
        return Math.PI*radius*radius;
    }
}

