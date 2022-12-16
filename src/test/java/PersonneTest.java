import org.junit.jupiter.api.Test;
import src.Origin;
import src.Personne;

import static org.junit.jupiter.api.Assertions.*;

public class PersonneTest {
    // Faire un branche pour les test

    //TODO Test age adulte d'une personne
    @Test
    public void isAdulte(){
        Personne personne = new Personne();
        Personne personne1 = new Personne("Oikawa", Origin.JAPONAIS, 26, true, 225);
        Personne personne2 = new Personne("Dhieb", Origin.TUNISIEN, 17, false, 10);
        assertTrue(personne.isAdulte());
        assertTrue(personne1.isAdulte());
        assertFalse(personne2.isAdulte());
    }

    @Test
    public void isPersonneValide() {
        Personne personne = new Personne();
        assertEquals("Laversieb", personne.nom);
        assertEquals(Origin.ETATS_UNIENT, personne.origin);
        assertEquals(42, personne.age);
        assertEquals(true, personne.aDesDocumentIdentite);
        assertEquals(100, personne.argent);

    }
}
