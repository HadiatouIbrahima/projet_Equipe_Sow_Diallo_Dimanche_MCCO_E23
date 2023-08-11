import com.didiso.sysyteme.Employe;
import com.didiso.sysyteme.Pointage;
import com.didiso.sysyteme.Projet;
import com.didiso.sysyteme.Taux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJUnit {
    @Test
    public void testCreationTaux(){
        Taux taux1 = new Taux("T1", "06-06-2023", 15);
       assertEquals("T1",taux1.getIdTx());

    }
    @Test
    public void testCreationProjet(){
        Projet proj1 = new Projet("P1", "projet1", "01-06-2023 00:00:01", "30-09-2023 23:59:59", 5000);  //"dd-MM-yyyy HH:mm:ss"
        assertEquals("P1",proj1.getIdProj());

    }
    @Test
    public void testEnregistrerTravail(){
        Pointage pointage1 = new Pointage("PT1", Employe.parseDate("01-01-2023"), 8.0);
        assertEquals(8.0, pointage1.getNbTotal());
    }
}
