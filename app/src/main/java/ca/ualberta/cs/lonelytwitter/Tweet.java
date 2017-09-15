package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by minsoung on 9/14/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String meesage) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }

    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    public abstract Boolean isImportant();
}
