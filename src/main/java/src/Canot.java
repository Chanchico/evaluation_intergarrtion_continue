package src;

import java.util.List;

public class Canot extends Bateau{

    public boolean estALaMer;
    public Canot() {
        super(3);
        this.estALaMer = false;
    }

    @Override
    public boolean ajouterPassager(Personne personne){
        if (super.ajouterPassager(personne)) {
            System.out.println("Le passage est monté à bord du canot");
            return true;
        } else {
            System.out.println("Il n'y a plus de place à bord du canot");
            return false;
        }
    }

    public List<Personne> lanceCanot() {
        estALaMer = true;
        return super.passagers;
    }


}
