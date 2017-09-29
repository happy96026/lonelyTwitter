/*
 * Mood
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
 * Represents Mood
 *
 * @author Daniel Choi
 * @version 1.0
 * @see Happy
 * @see Sad
 */
public abstract class Mood {

    private Date date;

    /**
     * Constructs an instance for class that extends Mood.
     */
    public Mood() {
        date = new Date();
    }

    /**
     * Constructs an instance for class that extends Mood with the given date.
     *
     * @param date the current date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Sets the date of the Mood.
     *
     * @param date the current date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the date of the Mood.
     *
     * @return the date of the Mood.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Displays the mood of class that extends the Mood class.
     *
     * @return a string that displays the mood of the class that extends Mood
     */
    public abstract String display_mood();

}
