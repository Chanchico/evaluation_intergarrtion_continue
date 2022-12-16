package src;

import jdk.jshell.PersistentSnippet;

public class Douanier{
    static int potDevin = 0;
    public static boolean accorderAcces(Personne passager, Navire navire){
        if (passager.aDesDocumentIdentite){
           return navire.ajouterPassager(passager);
        }else{
            if (passager.argent > 200){
                potDevin += passager.argent;
                //on ajoute un clandestin ce qui fera que la taille de la liste passager sera plus grande que la taille du nombre de passager supposé
                return navire.passagers.add(passager);
            }
            else {
                Prison.prisonnier.add(passager);
                System.out.println("Et un tour en prison");
                return false;
            }
        }
    }

    public static boolean controlerNavire(Navire navire){
        int nombreEnfant = 0;
        int nombreAdulte = 0;

        if(!navire.capitaine.isAdulte()) {
            System.out.println("Echec du contrôle ! Le capitaine est un enfant");
            return false;
        }

        if (navire.passagers.size() > navire.nombreCourantDePassager){
            System.out.println("Echec du contrôle ! Trop de passager à bord");
            return false;
        }

        for (Personne personne : navire.passagers){
            if (personne.isAdulte())
                nombreAdulte ++;
            else
                nombreEnfant ++;
        }

        if (nombreAdulte < nombreEnfant){
            System.out.println("Echec du contrôle ! Il y a beaucoup trop d'enfant par adulte");
            return false;
        }
        return true;

    }


}
