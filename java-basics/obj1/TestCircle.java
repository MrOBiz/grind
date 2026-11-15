package obj1;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();

        c1.setCenter(2.5, 3.2);
        c1.setRadius(5.0);
    }
}

class Circle{
    private double radius;
    private double x, y;

    void setCenter(double x, double y){
        this.x = x;
        this.y = y;
    };

    void setRadius(double r){
        this.radius = r;
    };
}

