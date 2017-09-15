package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by minsoung on 9/14/17.
 */

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    public String display_mood() {
        return "I am sad.";
    }

}
