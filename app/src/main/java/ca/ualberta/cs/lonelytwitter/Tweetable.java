/*
 * Tweetable
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
 * Interface fot Tweetable
 *
 * @author Daniel Choi
 * @version 1.0
 * @since 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */
public interface Tweetable {

    /**
     * Get the message of the Tweetable.
     *
     * @return a string that contains the message
     */
    String getMessage();

    /**
     * Get the date of the Tweetable.
     *
     * @return the date
     */
    Date getDate();
}
