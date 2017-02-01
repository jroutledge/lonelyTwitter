package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jroutled on 1/19/17.
 *
 * NormalTweet class is a subclass that extends Tweet.
 */

public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message of the tweet
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date of the tweet
     * @param message the message of the tweet
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    /**
     * Sets the tweet to not important.
     */
    public Boolean isImportant(){
        return false;
    }
}