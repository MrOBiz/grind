package obj1;

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args){
        Magician m = new Magician();
        Assistant a = new Assistant();
        Spectator s = new Spectator();
        Paper p = new Paper();

        s.walkIn();
        m.present();
        s.askInfo();
        s.writeOnPaper(p);
        a.readPaper(p);
        s.snarkyAnswer();
        a.sayCalculate();
        a.shout();
        m.grandFinale(a.getRes());

    }
}

class Magician{
    public void present(){
        System.out.println(this + " A little magic trick!");
    }

    public void grandFinale(int res){
        res+=115;
        System.out.println(this + "hmmm... I see! You are " + res/100
                            + " years old, and you have " + res%100
                            + "$ in your pocket!");
    }

    public String toString(){
        return "[Magician]";
    }
}

class Assistant{
    private Paper p;
    private int res = ((p.getWrittenAge()*2+5)*50+p.getWrittenMoney())-365;

    public int getRes(){
        return res;
    }

    public void readPaper(Paper paper){
        System.out.print(this + " Reads the paper");
        p = paper;
    }

    public void sayCalculate(){
        System.out.print(this + " calculates the hint");
    }

    public void shout(){
        System.out.println(this + " I shout: " + res + "!");
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
        System.out.println(this + "(I walk in)");
    }

    public void askInfo(){
        do{
            System.out.print(this + "What's my age?");
            age = input.nextInt();
            input.nextLine();
        }while(age < 0 || age > 100);

        do{
            System.out.print(this + "How much money do I have in my pocket (<100)?");
            money = input.nextInt();
            input.nextLine();
        }while(money < 0 || money > 99);
    }

    public void writeOnPaper(Paper paper){
        System.out.println(this + "(writes on the piece of paper)");
        paper.writeOnPaper(age,money);
    }

    public void snarkyAnswer(){
        System.out.println(this + "(I have enough)");
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
