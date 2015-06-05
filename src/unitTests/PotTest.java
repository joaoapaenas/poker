package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.Player;
import org.ozsoft.texasholdem.Pot;

/**
 * Created by matheus on 6/5/15.
 */
public class PotTest extends TestCase {

    @Test
    public void testGetContributors() throws Exception {
        Pot pot = new Pot(100);
        Player p = new  Player("matheus", 500, null);
        pot.addContributer(p);

        assertEquals(true, pot.hasContributer(p));
    }

    @Test
    public void testSplit() throws Exception {
        Pot pot = new Pot(100);
        Pot newPot;
        Player p = new  Player("matheus", 500, null);

        pot.addContributer(p);
        newPot = pot.split(p, 60);
        assertEquals(60, pot.getBet());
        assertEquals(40, newPot.getBet());
    }
}