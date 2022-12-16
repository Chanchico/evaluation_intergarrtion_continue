import org.junit.jupiter.api.Test;
import src.*;

import static org.junit.jupiter.api.Assertions.*;

public class DouanierPrisonTest {
    // Faire un branche pour les test
    //TODO tester si une pesonne va en taule
    @Test
    public void testEstEnPrison() {
        Navire navire = new Navire();
        assertFalse(Douanier.accorderAcces(new Personne("Dhieb", Origin.TUNISIEN, 17, false, 10), navire));
        assertTrue(Douanier.accorderAcces(new Personne("Dufour", Origin.FRANCAIS, 21, true, 260), navire));
        assertTrue(Douanier.accorderAcces(new Personne("Javier", Origin.ESPAGNOL, 15, true, 10), navire));
    }

    //TODO tester nombre de personne en prison
    @Test
    public void testNombrePrisonnier() {
        Navire navire = new Navire();
        assertEquals(0, Prison.prisonnier.size());
        Douanier.accorderAcces(new Personne("Dhieb", Origin.TUNISIEN, 17, false, 10), navire);
        Douanier.accorderAcces(new Personne("Oikawa", Origin.JAPONAIS, 26, false, 210), navire);
        assertEquals(1, Prison.prisonnier.size());
    }

    //TODO tester controlerNavire selon sortie
    @Test
    public void testCapitaineEstAdulte() {
        Navire navire = new Navire();
        assertTrue(Douanier.controlerNavire(navire));
        navire.capitaine = new Personne("Dhieb", Origin.TUNISIEN, 17, false, 10);
        assertFalse(Douanier.controlerNavire(navire));
    }
    @Test
    public void testNombrePassagersSuperieurMax() {
        Navire navire = new Navire();
        navire.ajouterPassager(new Personne("John", Origin.ETATS_UNIENT, 56, true, 972));
        navire.ajouterPassager(new Personne("Muche", Origin.JAPONAIS, 21, true, 325));
        navire.ajouterPassager(new Personne("Francisco", Origin.ARGENTIN, 25, true, 54));
        assertTrue(Douanier.controlerNavire(navire));

        for (int i = 0; i < 7; i++) {
            navire.ajouterPassager(new Personne());
        }
        Douanier.accorderAcces(new Personne("Alaa", Origin.TUNISIEN, 34, false, 260), navire);
        assertFalse(Douanier.controlerNavire(navire));
    }

    @Test
    public void testPlusEnfantQueAdulte() {
        Navire navire = new Navire();
        navire.ajouterPassager(new Personne("John", Origin.ETATS_UNIENT, 56, true, 972));
        navire.ajouterPassager(new Personne("Muche", Origin.JAPONAIS, 21, true, 325));
        navire.ajouterPassager(new Personne("Francisco", Origin.ARGENTIN, 25, true, 54));
        for (int i = 0; i < 7; i++) {
            navire.ajouterPassager(new Personne("Shein", Origin.FRANCAIS, 6, true, 0));
        }
        assertFalse(Douanier.controlerNavire(navire));
    }
}
