package src;

public class Personne {
    String nom;
    Origin origin;
    int age;

    Personne() {
        this.nom = "Laversieb";
        this.origin = Origin.AMERICAIN;
        this.age = 42;
    }

    Personne(String nom, Origin origin, int age) {
        this.nom = nom;
        this.origin = origin;
        this.age = age;
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
