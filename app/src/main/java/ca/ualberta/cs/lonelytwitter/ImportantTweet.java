/*
 * ImportantTweet
 *
 * Version 1.0
 *
 * 28/09/2017
 *
 * Copyright (c) 2017. Team X - CMPUT 301. University of Alberta - All rights reserved.
 * You may use , distribute or modify this code under terms and conditions of the Code of Student Behaviour at the University of Alberta.
 * You may find a copy of this license in this project.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents an ImportantTweet
 *
 * @author Daniel Choi
 * @version 1.0
 * @since 1.0
 * @see Tweet
 * @see Tweetable
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs ImportantTweet given a message
     *
     * @param message message to tweet with level of high importance
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs ImportantTweet given message and date
     *
     * @param message message to tweet with level of high importance
     * @param date the current date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Checks if ImportantTweet is important. Always returns true since
     * ImportantTweet is regarded as important.
     *
     * @return True
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
