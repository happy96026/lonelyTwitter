package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by minsoung on 9/14/17.
 */

public abstract class Mood {

    private Date date;

    public Mood() {
        date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public void setDate() {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String display_mood();

}
