package src;

import java.util.List;

public class Canot extends Bateau{

    boolean estALaMere;
    public Canot() {
        super(3);
        this.estALaMere = false;
    }

    @Override
    public boolean ajouterPassager(Personne personne){
        System.out.println(super.ajouterPassager(personne) ? "Le passage est monté à bord du canot" : "Il n'y a plus de place à bord du canot");
        return (super.ajouterPassager(personne));
    }

    public List<Personne> lanceCanot() {
        estALaMere = true;
        return super.passagers;
    }


}
