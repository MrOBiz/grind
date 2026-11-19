package obj1;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        Triangle t1 = new Triangle();

        Printer p = new Printer();

        p1.askCoor();
        p2.askCoor();
        p3.askCoor();

        double perimeter = t1.side(p1, p2) + t1.side(p3, p2) + t1.side(p1, p3);
        boolean iso = t1.side(p1, p2) == t1.side(p1, p3) || t1.side(p2, p1) == t1.side(p2, p3)
                || t1.side(p3, p1) == t1.side(p3, p2);

        p.stamp("Perimeter: " + perimeter);
        if(iso) p.stamp("The triangle is isosceles");
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

class Printer{
    public void stamp(String s){
        System.out.println(s);
    }
}
