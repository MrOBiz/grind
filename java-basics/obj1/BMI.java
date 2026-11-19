package obj1;

public class BMI {
    public static void main(String[] args) {

        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.print();
        System.out.println("BMI : " + quidam.bmi());
        quidam.init( -2.0, 4.5);
        quidam.print();
    }
}

class Patient{
    private double weight, height;

    public void init(double weight, double height){
        this.weight = (weight > 0)? weight  :  0;
        this.height = (height > 0 && height < 2.5)? height  :  0;
    }

    public void print(){
        System.out.printf("Height: %.1f m", height);
        System.out.printf(" Weight: %.1f kg", weight);
        System.out.println();
    }

    public double bmi(){
        return (height > 0.0)? weight/(height*height) : 0.0;
    }
}

