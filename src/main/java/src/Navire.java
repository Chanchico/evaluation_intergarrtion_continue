package src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Navire extends Bateau{

    public Personne capitaine;
    public List<Canot> canotDeSauvetage;
    public boolean alarmActive= false;
    public String name;

    public Navire() {
        super(10);
        this.capitaine = new Personne("Lascou Antoine", Origin.FRANCAIS, 42, true, 1000);

        this.canotDeSauvetage = new ArrayList<Canot>();
        this.canotDeSauvetage.addAll(Arrays.asList(new Canot(), new Canot()));
        this.name = "Black Pearl";
    }

    public Navire(Personne capitaine, int nbMaximumPassager, int nbCanot, String name) {
        super(nbMaximumPassager);
        this.capitaine = capitaine;

        this.canotDeSauvetage = new ArrayList<Canot>(nbCanot);
        for (int i = 0; i < nbCanot; i++) {
            this.canotDeSauvetage.add(new Canot());
        }
        this.name = name;
    }

    @Override
    public boolean ajouterPassager(Personne personne){
        if (super.ajouterPassager(personne)) {
            System.out.println(personne.nom + " est monté à bord du " + this.name);
            return true;
        } else {
            System.out.println("Il n'y a plus de place à bord du navire");
            return false;
        }
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

    public void percuteIcebeg(){
        alarmActive = true;
    }


}
