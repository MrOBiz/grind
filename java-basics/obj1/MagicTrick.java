package obj1;

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args){

    }
}

class Magician{
    private void present(Object person){
        System.out.println( person.toString() + " A little magic trick!");
    }

    public void grandFinale(int res){
        System.out.println("hmmm... I see! You are ");
    }

    public String toString(){
        return "[Magician]";
    }
}

class Assistant{
    private Paper p;

    public void readPaper(Paper paper){
        System.out.print("Reads the paper");
        p = paper;
    }

    public int calculate(){
        System.out.print("calculates the hint");
        int res = ((p.getWrittenAge()*2+5)*50+p.getWrittenMoney())-365;
        return res;
    }

    public void shout(){
        int res = calculate();
        System.out.println("I shout: " + res + "!");
    }

    public String toString(){
        return "[Assistant]";
    }
}

class Spectator{
    private final static Scanner input = new Scanner(System.in);

    private int age, money;
    private Paper p;

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
        }while(age < 0 || age > 100);

        do{
            System.out.print("How much money do I have in my pocket (<100)?");
            money = input.nextInt();
            input.nextLine();
        }while(money < 0 || money > 99);
    }

    public void writeOnPaper(Paper paper){
        System.out.println("(writes on the piece of paper)");
        p = paper;
    }

    public void snarkyAnswer(){
        System.out.println("(I have enough)");
    }

    public String toString(){
        return "[Spectator]";
    }
}

class Paper{
    private int writtenAge, writtenMoney;

    public void writeOnPaper(int age, int money){
        writtenAge = age;
        writtenMoney = money;
    }

    public int getWrittenAge(){
        return writtenAge;
    }

    public int getWrittenMoney(){
        return writtenMoney;
    }
}
