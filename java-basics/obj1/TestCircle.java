package obj1;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        c1.setCenter(2.0, 3.0);
        c1.setRadius(5.0);
        System.out.println(c1.surface());
        System.out.println(c1.isInside(12,4));

        c2.setCenter(1.0, 1.0);
        c2.setRadius(3.0);
        System.out.println(c2.surface());
        System.out.println(c2.isInside(0,4));

        c3.setCenter(0.0, 0.0);
        c3.setRadius(12.0);
        System.out.println(c3.surface());
        System.out.println(c3.isInside(11,4));
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

    public boolean isInside(double x, double y){
        double distance = Math.sqrt((this.x - x)*(this.x - x)
                            + (this.y - y)*(this.y - y));
        return(distance <= radius)? true: false;
    }
}

