package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Bateau {
    final List<Personne> passagers;
    int nbMaximumPassager;


    public Bateau(int nbMaximumPassager ) {
        this.nbMaximumPassager = nbMaximumPassager;
        passagers = new ArrayList<>(nbMaximumPassager);
    }

    public boolean ajouterPassager(Personne personne) {
        if (passagers.size() < nbMaximumPassager) {
            passagers.add(personne
            );
            return true;
        } else {
            return false;
        }
    }



}
