/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import org.ozsoft.texasholdem.Player;
import org.ozsoft.texasholdem.bots.BasicBot;

/**
 *
 * @author joaoapenas
 */
public class BobBot extends Player {

    public BobBot() {
        super("Bob", 500, new BasicBot(0,75));
    }
    
}
