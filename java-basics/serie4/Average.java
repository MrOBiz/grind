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
    }
}
