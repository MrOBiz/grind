package obj1;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args){

    }
}

class Point {
    private static Scanner input = new Scanner(System.in);
    private double x, y;

    public void askCoor(){
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
