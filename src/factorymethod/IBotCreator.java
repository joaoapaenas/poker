package factorymethod;

import com.sun.tools.javac.code.Attribute;
import org.ozsoft.texasholdem.Player;

/**
 * Created by matheus on 4/12/15.
 */
public interface IBotCreator {
    Player manufactureBot(String name);
}
