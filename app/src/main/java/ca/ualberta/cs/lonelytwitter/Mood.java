package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jeffreyroutledge on 2017-01-19.
 */

public abstract class Mood {
    public Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
