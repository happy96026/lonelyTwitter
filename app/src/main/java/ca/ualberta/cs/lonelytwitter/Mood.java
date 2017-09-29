/*
 * Copyright (c) 2017. Team X - CMPUT 301. University of Alberta - All rights reserved.
 * You may use , distribute or modify this code under terms and conditions of the Code of Student Behaviour at the University of Alberta.
 * You may find a copy of this license in this project.
 */

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
