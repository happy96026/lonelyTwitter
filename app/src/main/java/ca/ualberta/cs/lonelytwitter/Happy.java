/*
 * Happy
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
 *  Represent the happy mood.
 *
 *  @author Daniel Choi
 *  @version 1.0
 *  @since 1.0
 *  @see Mood
 */
public class Happy extends Mood {

    /**
     * Constructs an instance for Happy class.
     */
    public Happy() {
        super();
    }

    /**
     * Constructs an instancce for Happy class with the given date.
     *
     * @param date the date of the instance
     */
    public Happy(Date date) {
        super(date);
    }

    /**
     * Displays mood for Happy class.
     *
     * @return a string that displays mood of this class.
     */
    public String display_mood() {
        return "I am happy.";
    }

}
