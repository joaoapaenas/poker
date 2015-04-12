package proxy;

import org.ozsoft.texasholdem.Card;

/**
 * Created by matheus on 4/12/15.
 */
public abstract class AbstractCardLabel extends javax.swing.JLabel{
    abstract void applyIcon(Card card);
}
