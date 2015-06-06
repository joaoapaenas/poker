package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.Card;
import org.ozsoft.texasholdem.Hand;

import static org.junit.Assert.*;

/**
 * Created by matheus on 6/6/15.
 */
public class HandTest extends TestCase {

    @Test
    public void testGetCards() throws Exception {
        Hand hand = new Hand();
        Card card = new Card(1, 1);

        hand.addCard(card);
        assertEquals(1, hand.getCards().length);
    }
}