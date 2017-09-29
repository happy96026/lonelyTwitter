/*
 * Tweet
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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Daniel Choi
 * @version 1.0
 * @since 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    /**
     * Constructs a tweet with the current time.
     *
     * @param message the message to tweet
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet.
     *
     * @param message the message to tweet
     * @param date date tweet is created
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Sets the date of the tweet.
     *
     * @param date the date of the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the date of the tweet.
     *
     * @return the date of the tweet
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the message of the tweet.
     *
     * @param message the message of the tweet
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Gets the message of the tweet.
     *
     * @return the message of the tweet
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the moodlist of the tweet.
     *
     * @param moodList an arraylist that contains the mood of the tweet
     */
    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }

    /**
     * Gets the moodlist of the tweet.
     *
     * @return an arraylist that contains the mood of the tweet
     */
    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    /**
     * Checks if tweet is important or not.
     *
     * @return True if tweet is important and false if tweet is not important
     */
    public abstract Boolean isImportant();

    /**
     * Represents the string of the Tweet class.
     *
     * @return a string that displays date and message
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
