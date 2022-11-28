package src;

public class Personne {
    String nom;
    Origin origin;
    int age;
    boolean aDesDocumentIdentite;

    int argent;

    Personne() {
        this.nom = "Laversieb";
        this.origin = Origin.ETATS_UNIENT;
        this.age = 42;
        this.aDesDocumentIdentite = true;
        this.argent = 100;
    }

    public Personne(String nom, Origin origin, int age, boolean aDesDocumentIdentite, int argent) {
        this.nom = nom;
        this.origin = origin;
        this.age = age;
        this.aDesDocumentIdentite = aDesDocumentIdentite;
        this.argent = argent;
    }

    public boolean isAdulte() {
        if (age > origin.ageAdulte) {
            return true;
        } else {
            return false;
        }
    }


    public void afficherInformations() {
        boolean bool = isAdulte();
        String adult;
        if (bool) {
            adult = "adulte";
        } else {
            adult = "enfant";
        }
        System.out.println("Mon nom est " + nom + ". Je suis un " + origin + ". Je suis un " + adult);
    }
}
