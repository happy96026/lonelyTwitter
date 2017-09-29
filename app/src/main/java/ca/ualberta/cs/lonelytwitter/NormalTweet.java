/*
 * NormalTweet
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
 * Represents NormalTweet
 *
 * @author Daniel Choi
 * @version 1.0
 * @since 1.0
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs NormalTweet with given message.
     *
     * @param message message for the NormalTweet
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs NormalTweet with given message and date.
     *
     * @param message message for the NormalTweet
     * @param date the current date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Checks if Tweet is important or not. NormalTwet
     * is regarded as not important.
     *
     * @return False
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
