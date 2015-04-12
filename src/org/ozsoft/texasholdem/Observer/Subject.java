package org.ozsoft.texasholdem.Observer;

/**
 * Created by matheus on 4/6/15.
 */
public class Subject extends AbstractSubject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
