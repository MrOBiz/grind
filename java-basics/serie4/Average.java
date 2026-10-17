package serie4;

import java.util.Scanner;

public class Average {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int numOfStudents;
        System.out.print("Enter number of students: ");
        numOfStudents = sc.nextInt();

        double average = 0.0;
        double sumOfNotes = 0.0;
        double [] notes = new double[numOfStudents];

        for(int i=0; i< numOfStudents; i++){
            System.out.print("Enter notes for student "+ (i +1) +": ");
            notes[i] = sc.nextDouble();
            sumOfNotes += notes[i];
        }

        average = sumOfNotes/numOfStudents;
        System.out.println("Class average is: "+average);

        int t = 1;
        for(double val : notes){
            double diff = Math.abs(val - average);
            System.out.println("Student's "+ t +" average is: "
                                + val + " #Deviation from the average: "
                                + diff);
            t++;
        }
    }
}
