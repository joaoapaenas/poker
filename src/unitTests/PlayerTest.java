package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.Card;
import org.ozsoft.texasholdem.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 6/5/15.
 */
public class PlayerTest extends TestCase {
    @Test
    public void testPublicClone() throws Exception {
        Player p = new Player("matheus", 500, null);
        Player clone;
        clone = p.clone();
        assertEquals(p, clone);
    }

    @Test
    public void testHasCards() throws Exception {
        Player p = new Player("matheus", 500, null);
        Card card = new Card(5, 2);
        List<Card> cards = new ArrayList<Card>();
        cards.add(card);
        cards.add(card);
        p.setCards(cards);

        assertEquals(true, p.hasCards());
    }

    @Test
    public void testPayCash() throws Exception {
        Player p = new Player("matheus", 500, null);
        p.payCash(500);
        assertEquals(0, p.getCash());
    }

    @Test
    public void testSetCards() throws Exception {
        Player p = new Player("matheus", 500, null);
        Card card = new Card(5, 2);
        List<Card> cards = new ArrayList<Card>();
        cards.add(card);
        cards.add(card);
        p.setCards(cards);

        // Not proper, element by element should be checked
        assertEquals(cards.size(), p.getCards().length);
    }
}