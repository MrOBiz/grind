package obj1;

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args){

    }
}

class Magician{
    private int total = getCalc() + 115;

    private void present(Object person){
        System.out.println( person.toString() + " A little magic trick!");
    }

    public void grandFinale(Object person){
        System.out.println( person.toString() + "hmmm... I see! You are ");
    }

    public String toString(){
        return "[Magician]";
    }
}

class Assistant{
    private int myMoney, myAge, result;

    public void setMoney(int val){
        myMoney = val;
    }

    public void setAge(int val){
        myAge = val;
    }

    private int calc(int m, int a){
        return ((a*2+5)*50+m)-365;
    }

    public void readPaper(Object person){
        System.out.print(person.toString() + " reads the paper");
    }

    public void calculate(Object person){
        System.out.print(person.toString() + " calculates the hint");
    }

    public void shout(){
        System.out.println("I shout: " + getCalc() + "!");
    }

    public int getCalc(){
        return calc(myMoney, myAge);
    }

    public String toString(){
        return "[Assistant]";
    }
}

class Spectator{
    private final static Scanner input = new Scanner(System.in);

    private int age, money;

    public int getAge(){
        return age;
    }

    public int getMoney(){
        return money;
    }

    public void walkIn(){
        System.out.println("(I walk in)");
    }

    public void askInfo(){
        do{
            System.out.print("What's my age?");
            age = input.nextInt();
            input.nextLine();
        }while(age < 18 || age > 100);

        do{
            System.out.print("How much money do I have in my pocket (<100)?");
            age = input.nextInt();
            input.nextLine();
        }while(money < 1 || money > 100);
    }

    public void snarkyAnswer(){
        System.out.println("(I have enough)");
    }

    public String toString(){
        return "[Spectator]";
    }
}

class paper{
    private int writtenAge, writtenMoney;

    public void writeOnPaper(Object person){
        System.out.print(person.toString() + " writes on the paper");
    }

    public void setWrittenAge(int val){
        writtenAge = val;
    }

    public void setWrittenMoney(int val){
        writtenMoney = val;
    }

    public int getWrittenAge(){
        return writtenAge;
    }

    public int getWrittenMoney(){
        return writtenMoney;
    }
}
