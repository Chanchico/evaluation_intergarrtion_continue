package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Bateau {
    public final List<Personne> passagers;
    int nbMaximumPassager;

    int nombreCourantDePassager = 0;

    public Bateau(int nbMaximumPassager ) {
        this.nbMaximumPassager = nbMaximumPassager;
        passagers = new ArrayList<>();
    }

    public boolean ajouterPassager(Personne personne) {
        if (passagers.size() < nbMaximumPassager) {
            passagers.add(personne);
            nombreCourantDePassager ++;
            return true;
        } else {
            return false;
        }
    }



}
