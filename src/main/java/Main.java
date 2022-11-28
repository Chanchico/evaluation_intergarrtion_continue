import src.Douanier;
import src.Navire;
import src.Origin;
import src.Personne;

public class Main {
    public static void main(String[] args) {

        Personne eric = new Personne("Eric", Origin.FRANCAIS, 52, true, 200);
        Personne francisco = new Personne("Francisco", Origin.ARGENTIN, 25, false, 0);
        Personne antoine  = new Personne("Antoine", Origin.FRANCAIS, 21, true, 0);
        Personne alaa = new Personne("Alaa", Origin.TUNISIEN, 21, true, 600);
        Personne muche = new Personne("Muche", Origin.JAPONAIS, 21, false, 0);
        Personne shein = new Personne("Shein", Origin.ETATS_UNIENT, 6, false, 0);

        shein.afficherInformations();


        Navire hollandaisVolant = new Navire(francisco, 5, 2, "Hollandais Volant" );

        Douanier.accorderAcces(eric, hollandaisVolant );
        Douanier.accorderAcces(muche, hollandaisVolant);
        Douanier.accorderAcces(antoine, hollandaisVolant);
        Douanier.accorderAcces(alaa, hollandaisVolant);

        hollandaisVolant.percuteIcebeg();
        if(hollandaisVolant.alarmActive){
            hollandaisVolant.laguerLesCanot();
        }

    }
}
