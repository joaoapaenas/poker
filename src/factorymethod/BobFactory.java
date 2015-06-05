package factorymethod;

import org.ozsoft.texasholdem.Player;

/**
 * Created by matheus on 4/12/15.
 */
public class BobFactory implements IBotCreator {
    BobFactory()
    {
        System.out.println("creating bot Bob");
    }

    @Override
    public Player manufactureBot(String name)
    {
        Bob bob = new Bob();
        return new Player(bob.getName(), bob.getStartingCash(), bob.getBasicBot());
    }
}
