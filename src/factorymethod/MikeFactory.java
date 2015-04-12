package factorymethod;

import org.ozsoft.texasholdem.Player;

/**
 * Created by matheus on 4/12/15.
 */
public class MikeFactory implements IBotCreator {
    MikeFactory()
    {
        System.out.println("creating bot Mike");
    };

    @Override
    public Player manufactureBot(String name)
    {
        if (!name.equals("Mike")) return null;
        Mike mike = new Mike();
        return new Player(mike.getName(), mike.getStartingCash(), mike.getBasicBot());
    }
}
