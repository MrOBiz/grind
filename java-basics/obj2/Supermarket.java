package obj2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Supermarket {
    public static void main(String[] args) {
// Les articles vendus dans le supermarché
        Article choufleur = new Article("Chou-fleur extra", 3.50, false);
        Article roman = new Article("Les malheurs de Sophie", 16.50, true);
        Article camembert = new Article("Cremeux 100%MG", 5.80, false);
        Article cdrom = new Article("C++ en trois jours", 48.50, false);
        Article boisson = new Article("Petit-lait", 2.50, true);
        Article petitspois = new Article("Pois surgeles", 4.35, false);
        Article poisson = new Article("Sardines", 6.50, false);
        Article biscuits = new Article("Cookies de grand-mere", 3.20, false);
        Article poires = new Article("Poires Williams", 4.80, false);
        Article cafe = new Article("100% Arabica", 6.90, true);
        Article pain = new Article("Pain d'epautre", 6.90, false);
// Les caddies du supermarché
        Caddie caddie1 = new Caddie();
        Caddie caddie2 = new Caddie();
        Caddie caddie3 = new Caddie();
// Les caisses du supermarché
// le premier argument est le numero de la caisse
// le second argument est le montant initial de la caisse.
        Caisse caisse1 = new Caisse(1, 0.0);
        Caisse caisse2 = new Caisse(2, 0.0);
// les clients font leurs achats
// le second argument de la méthode remplir
// correspond à une quantité
// remplissage du 1er caddie
        caddie1.fill(choufleur, 2);
        caddie1.fill(cdrom, 1);
        caddie1.fill(biscuits, 4);
        caddie1.fill(boisson, 6);
        caddie1.fill(poisson, 2);
// remplissage du 2eme caddie
        caddie2.fill(roman, 1);
        caddie2.fill(camembert, 1);
        caddie2.fill(petitspois, 2);
        caddie2.fill(poires, 2);
// remplissage du 3eme caddie
        caddie3.fill(cafe, 2);
        caddie3.fill(pain, 1);
        caddie3.fill(camembert, 2);
// Les clients passent à la caisse
        caisse1.scan(caddie1);
        caisse1.scan(caddie2);
        caisse2.scan(caddie3);
        caisse1.printTot();
        caisse2.printTot();
    }
}

class Article{
    private String name;
    private double price;
    private boolean solde;

    public Article(String name, double price, boolean inStock){
        this.name = name;
        this.price = price;
        this.solde = inStock;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean getSolde(){
        return solde;
    }
}

class CaddieItem {
    private Article article;
    private int quantity;

    public CaddieItem(Article article, int quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public Article getArt(){
        return article;
    }

    public int getQuantity(){
        return quantity;
    }

    public double print(){
        if(article.getSolde()){
            System.out.println(article.getName() + ": " + article.getPrice()
                    + " x " + quantity + " = "
                    + article.getPrice() * quantity * 0.5 + " CHF (50% off)");
            return article.getPrice() * quantity * 0.5;
        }else{
            System.out.println(article.getName() + ": " + article.getPrice()
                    + " x " + quantity + " = "
                    + article.getPrice() * quantity + " CHF");
            return article.getPrice() * quantity;
        }
    }
}

class Caddie{
    private ArrayList<CaddieItem> content = new ArrayList<>();

    public boolean fill(Article art, int quantity){
        content.add(new CaddieItem(art, quantity));
        return true;
    }

    public ArrayList<CaddieItem> getContent(){
        return content;
    }
}

class Caisse{
    private int num;
    private double cash;

    public Caisse(int num, double cash){
        this.num = num;
        this.cash = cash;
    }

    public void scan(Caddie cad){
        double toPay = 0.0;

        Date dateCourante = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");


        System.out.println("===============================");
        System.out.println(formatDate.format(dateCourante));
        System.out.println("Counter n " + num + "\n");

        for(CaddieItem elt : cad.getContent()){
            double add = elt.print();
            cash += add;
            toPay += add;
        }

        System.out.println("Total: " + toPay + " CHF");
        System.out.println("===============================");
    }

    public void printTot(){
        System.out.printf("Counter n %d made %.2f CHF today. \n", num, cash);
    }

}