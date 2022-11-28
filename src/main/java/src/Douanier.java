package src;

public class Douanier extends Personne{
    int potDevin = 0;
    public void accorderAcces(Personne passager, Navire navire){
        if (passager.aDesDocumentIdentite){
            navire.ajouterPassager(passager);
        }else{
            if (passager.argent > 200){
                potDevin += passager.argent;
                navire.ajouterPassager(passager);
            }
            else {
                Prison.prisionnier.add(passager);
            }
        }
    }

}
