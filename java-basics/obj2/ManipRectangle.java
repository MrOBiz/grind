package obj2;

public class ManipRectangle {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(2.0,4.0);
        System.out.print("Surface: " + rect.surface());
    }
}

class Rectangle{
    double width;
    double height;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double surface(){
        return height*width;
    }
}
