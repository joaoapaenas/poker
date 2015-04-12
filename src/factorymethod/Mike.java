package factorymethod;

import org.ozsoft.texasholdem.bots.BasicBot;

/**
 * Created by matheus on 4/12/15.
 */
public class Mike implements Bot {
    private static String name;
    private int startingCash;
    private BasicBot basicBot;

    Mike()
    {
        this.name = "Mike";
        this.startingCash = 500;
        basicBot = new BasicBot(25, 50);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartingCash() {
        return startingCash;
    }

    public void setStartingCash(int startingCash) {
        this.startingCash = startingCash;
    }

    public BasicBot getBasicBot() {
        return basicBot;
    }

    public void setBasicBot(BasicBot basicBot) {
        this.basicBot = basicBot;
    }

}
