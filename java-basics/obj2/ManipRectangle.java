package obj2;

public class ManipRectangle {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(2.0,4.0);
        System.out.print("Surface: " + rect.surface() + "\n");
        rect.setHeight(-12);
        rect.setWidth(3.7);
        System.out.print("Surface: " + rect.surface() + "\n");
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

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if(height >= 0) this.height = height;
    }

    public void setWidth(double width){
        if(width >= 0) this.width = width;
    }
}
