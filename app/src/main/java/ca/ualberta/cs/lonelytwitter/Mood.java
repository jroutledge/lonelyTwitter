package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jeffreyroutledge on 2017-01-19.
 *
 * Mood class is a superclass that adds moods to tweets.
 */

public abstract class Mood {
    public Date date;

    /**
     * Instantiates a new Mood.
     *
     * @param date the date of the tweet
     */
    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        date = new Date();
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date of the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
