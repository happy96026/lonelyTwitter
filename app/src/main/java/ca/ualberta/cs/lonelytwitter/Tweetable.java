package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    // Removed 'public modifier. The methods in an interface
    // are implicitly public thus it is repetitive to call the 'public' modifier
    String getMessage();

    Date getDate();

}
