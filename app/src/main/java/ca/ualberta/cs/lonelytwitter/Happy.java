package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by minsoung on 9/14/17.
 */

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    public String display_mood() {
        return "I am happy.";
    }

}
