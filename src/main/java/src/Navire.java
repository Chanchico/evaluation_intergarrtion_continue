package src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Navire extends Bateau{

    Personne capitaine;
    List<Canot> canotDeSauvetage;
    boolean alarmActive;

    Navire() {
        super(10);
        this.capitaine = new Personne("Lascou Antoine", Origin.FRANCAIS, 42, true, 1000);

        this.canotDeSauvetage = new ArrayList<Canot>();
        this.canotDeSauvetage.addAll(Arrays.asList(new Canot(), new Canot()));
    }

    Navire(Personne capitaine, List<Personne> passagers, int nbMaximumPassager, int nbCapsule) {
        super(nbMaximumPassager);
        this.capitaine = capitaine;
        for (int i = 0; i < nbCapsule; i++) {
            this.canotDeSauvetage.add(new Canot());
        }
    }

    @Override
    public boolean ajouterPassager(Personne personne){
        System.out.println(super.ajouterPassager(personne) ? "Le passage est monté à bord du navire" : "Il n'y a plus de place à bord du navire");
        return (super.ajouterPassager(personne));
    }

    public void laguerLesCanot() {
        boolean message = false;
        for (Canot canot : canotDeSauvetage) {
            if (canot.passagers.size() == canot.nbMaximumPassager) {
                canot.lanceCanot();
                continue;
            }

            if (canot.passagers.size() < canot.nbMaximumPassager && passagers.size() == 0) {
                if (capitaine.nom != "Lascou") {
                    canot.passagers.add(capitaine);
                    canot.lanceCanot();
                    break;
                } else {
                    if (!message) {
                        JOptionPane.showMessageDialog(null, "J'ai bien peur de ne pas pouvoir faire ça, Dave");
                        message = true;
                    }
                    canot.lanceCanot();
                }
            }
        }
    }

}
