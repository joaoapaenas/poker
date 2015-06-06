package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.Card;
import org.ozsoft.texasholdem.Hand;
import org.ozsoft.texasholdem.HandValue;

import static org.junit.Assert.*;

/**
 * Created by matheus on 6/6/15.
 */
public class HandValueTest extends TestCase {

    @Test
    public void testEquals() throws Exception {
        Hand handA = new Hand();
        Hand handB = new Hand();
        Card card = new Card(0,0);

        handA.addCard(card);
        handB.addCard(card);
        HandValue handValueA = new HandValue(handA);
        HandValue handValueB = new HandValue(handB);

        assertEquals(true, handValueA.equals(handValueB));
    }
}