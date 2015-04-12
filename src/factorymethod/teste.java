package factorymethod;

import org.ozsoft.texasholdem.Player;

/**
 * Created by matheus on 4/12/15.
 */
public class teste {
    public static void main(String[] args) {
        MikeFactory mikeFactory = new MikeFactory();
        EddieFactory eddieFactory = new EddieFactory();
        BobFactory bobFactory = new BobFactory();

        Player mike = mikeFactory.manufactureBot("Mike");
        Player eddie = eddieFactory.manufactureBot("Eddie");
        Player bob = bobFactory.manufactureBot("Bob");

        System.out.println(mike.toString() + " " + mike.getClient());
        System.out.println(eddie.toString() + " " + eddie.getClient());
        System.out.println(bob.toString() + " " + bob.getClient());
    }
}
