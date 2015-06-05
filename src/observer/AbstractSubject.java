package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matheus on 4/6/15.
 */
public abstract class AbstractSubject {
    List<ISubscriber> subscribers = new ArrayList<ISubscriber>();

    public void add(ISubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void remove(ISubscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void removeAll(){
        subscribers.clear();
    }

    public void notifySubscribers(String message){
        for (ISubscriber subscriber : subscribers) {
            subscriber.updateMessageReceived(message);
        }
    }
}
