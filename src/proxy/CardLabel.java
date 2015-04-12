package proxy;

import org.ozsoft.texasholdem.Card;
import org.ozsoft.texasholdem.gui.ResourceManager;

import javax.swing.*;

/**
 * Created by matheus on 4/12/15.
 */
public class CardLabel extends AbstractCardLabel {
    private String path;
    javax.swing.JLabel label;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

//    JLabel is created but no image is loaded
    public CardLabel() {
        this.label = new JLabel(null, null, CENTER);
    }

    @Override
    void applyIcon(Card card) {
        label.setIcon(ResourceManager.getCardImage(card));
    }
}
