package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.Card;

import static org.junit.Assert.*;

/**
 * Created by matheus on 6/6/15.
 */
public class CardTest extends TestCase {

    @Test
    public void testCompareTo() throws Exception {
        Card cardA = new Card(1, 1);
        Card cardB = new Card(1, 1);
        assertEquals(0, cardA.compareTo(cardB));
    }
}