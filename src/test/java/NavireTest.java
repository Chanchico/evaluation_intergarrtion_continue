import org.junit.jupiter.api.Test;
import src.Canot;
import src.Navire;
import src.Origin;
import src.Personne;

import static org.junit.jupiter.api.Assertions.*;

public class NavireTest {
    // Faire un branche pour les test
    //TODO : tester taille de la liste des canots de sauvetage
    @Test
    public void testNombreCanots() {
        Navire navire = new Navire();
        Navire navire1 = new Navire(new Personne(), 25, 5, "Vogue Merry");
        assertEquals(2, navire.canotDeSauvetage.size());
        assertEquals(5, navire1.canotDeSauvetage.size());

    }

    //TODO : tester si un passager est ajouté au navire
    @Test
    public void testAjouterPassagerNavire() {
        Navire navire = new Navire();
        assertEquals(0, navire.passagers.size());
        navire.ajouterPassager(new Personne());
        assertEquals(1, navire.passagers.size());
    }

    //TODO : verifier si les canots sont largués
    @Test
    public void testLarguerCanot() {
        Navire navire = new Navire();
        Canot canot = navire.canotDeSauvetage.get(0);
        canot.ajouterPassager(new Personne());
        canot.ajouterPassager(new Personne("Oikawa", Origin.JAPONAIS, 26, true, 225));
        canot.ajouterPassager(new Personne("Dhieb", Origin.TUNISIEN, 25, true, 100));
        navire.laguerLesCanot();
        assertTrue(canot.estALaMer);
    }
}
