package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jroutled on 1/19/17.
 *
 * Tweet class is a super class that implements Tweetable.
 */

public abstract class Tweet implements Tweetable{
    public Date date;
    public String message;

    /**
     * The Mood list.
     */
    public ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message of the tweet
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet with a date.
     *
     * @param date    the date of the tweet
     * @param message the message of the tweet
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date of the tweet
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean (wether the tweet is important or not
     */
    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
