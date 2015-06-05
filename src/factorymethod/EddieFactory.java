package factorymethod;

import org.ozsoft.texasholdem.Player;

/**
 * Created by matheus on 4/12/15.
 */
public class EddieFactory implements IBotCreator {
    public EddieFactory()
    {
        System.out.println("creating bot Eddie");
    }

    @Override
    public Player manufactureBot(String name)
    {
        Eddie eddie = new Eddie();
        return new Player(eddie.getName(), eddie.getStartingCash(), eddie.getBasicBot());
    }
}
