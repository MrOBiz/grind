package obj2;

import java.util.ArrayList;

class Auteur {
    private String name;
    private boolean awarded;

    public Auteur(String name, boolean awarded){
        this.name = name;
        this.awarded = awarded;
    }

    public String getName(){
        return name;
    }

    public boolean getPrize(){
        return awarded;
    }
}

class Oeuvre {
    private String title;
    private Auteur auteur;
    private String language;

    public Oeuvre(String title, Auteur auteur, String language){
        this.title = title;
        this.auteur = auteur;
        this.language = language;
    }

    public String getTitle(){
        return title;
    }

    public String getAuteur(){
        return auteur.getName();
    }

    public String getLanguage(){
        return language;
    }

    public void print(){
        System.out.println(title + ", " + auteur.getName()
                            + ", " + language);
    }
}

class Exemplaire{
    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre){
        this.oeuvre = oeuvre;

        System.out.println(oeuvre.getTitle() + ", " + oeuvre.getAuteur()
                + ", in " + oeuvre.getLanguage());
    }

    public Exemplaire(Exemplaire other){
        this.oeuvre = other.oeuvre;

        System.out.println("Copy of --> " + oeuvre.getTitle()
                        + ", " + oeuvre.getAuteur()
                        + ", in " + oeuvre.getLanguage() + "\n");
    }

    public Oeuvre getOeuvre(){
        return oeuvre;
    }

    public void print(){
        System.out.print("An exemplar of --> ");
        oeuvre.print();
    }
}



public class Library {

    public static void afficherExemplaires(ArrayList<Exemplaire> exemplaires) {
        for (Exemplaire exemplaire : exemplaires) {
            System.out.print("\t");
            exemplaire.afficher();
        }
    }

    public static void main(String[] args) {
        // create and store all the exemplaries
        Auteur a1 = new Auteur("Victor Hugo", false);
        Auteur a2 = new Auteur("Alexandre Dumas", false);
        Auteur a3 = new Auteur("Raymond Queneau", true);

        Oeuvre o1 = new Oeuvre("Les Miserables", a1, "francais");
        Oeuvre o2 = new Oeuvre("L\'Homme qui rit", a1, "francais");
        Oeuvre o3 = new Oeuvre("Le Comte de Monte-Cristo", a2, "francais");
        Oeuvre o4 = new Oeuvre("Zazie dans le metro", a3, "francais");
        Oeuvre o5 = new Oeuvre("The count of Monte-Cristo", a2, "anglais");

        Bibliotheque biblio = new Bibliotheque("municipale");
        biblio.stocker(o1, 2);
        biblio.stocker(o2);
        biblio.stocker(o3, 3);
        biblio.stocker(o4);
        biblio.stocker(o5);

        // ...
        System.out.println("La bibliotheque " + biblio.getName() + " offre ");
        afficherExemplaires(biblio.listerExemplaires());
        String langue = "anglais";
        System.out.println("Les exemplaires en " + langue + " sont  ");
        afficherExemplaires(biblio.listerExemplaires(langue));
        System.out.println("Les auteurs a succes sont  ");
        biblio.afficherAuteur();
        System.out.print("Il y a " + biblio.compterExemplaires(o3) + " exemplaires");
        System.out.println(" de  " + o3.getTitle());
    }
}

