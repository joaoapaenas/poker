/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import org.ozsoft.texasholdem.Player;

/**
 *
 * @author joaoapenas
 */
public class EddieBotFactory extends AbstractBotFactory {

    @Override
    public Player createBot() {
        return new EddieBot();
    }
    
}
