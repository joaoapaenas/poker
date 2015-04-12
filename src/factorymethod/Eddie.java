package factorymethod;

import org.ozsoft.texasholdem.bots.BasicBot;

/**
 * Created by matheus on 4/12/15.
 */
public class Eddie implements Bot {
    private static String name;
    private int startingCash;
    private BasicBot basicBot;

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

    Eddie()
    {
        this.name = "Eddie";
        this.startingCash = 500;
        basicBot = new BasicBot(50, 25);
    }
}
