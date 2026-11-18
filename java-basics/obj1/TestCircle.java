package obj1;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();

        c1.setCenter(2.0, 3.0);
        c1.setRadius(5.0);
        System.out.println(c1.surface());
        System.out.println(c1.isInside(12,4));
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

