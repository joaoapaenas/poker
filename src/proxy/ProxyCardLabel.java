package proxy;

import org.ozsoft.texasholdem.Card;

/**
 * Created by matheus on 4/12/15.
 */
public class ProxyCardLabel extends AbstractCardLabel {
    private String path;
    private CardLabel cardLabel = null;
    private Card card = null;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CardLabel getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(CardLabel cardLabel) {
        this.cardLabel = cardLabel;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public ProxyCardLabel(Card card) {
        this.card = card;
    }

    public ProxyCardLabel(String s) {
        this.path = s;
        cardLabel = new CardLabel();
    }

    @Override
    public void applyIcon(Card card) {
        if (cardLabel == null) {
            this.cardLabel = new CardLabel();
        }
        cardLabel.applyIcon(card);
    }
}
