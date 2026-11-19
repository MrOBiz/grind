package obj1;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.askCoor();
        p2.askCoor();
        p3.askCoor();

    }
}

class Point {
    private static Scanner input = new Scanner(System.in);
    private double x, y;

    public void askCoor(){
        System.out.println("NEW POINT");

        System.out.print("Enter new x: ");
        x = input.nextDouble();

        System.out.print("Enter new y: ");
        y = input.nextDouble();
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}

class Triangle{
    public double side(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()),2)
                        + Math.pow((p2.getY() - p1.getY()),2));
    }

}
