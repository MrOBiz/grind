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
        this.weight = weight;
        this.height = height;
    }

    public void print(){
        System.out.println("Height: " + height
                            + " Weight: " + weight);
    }

    public double bmi(){
        double val;

        return val;
    }
}

