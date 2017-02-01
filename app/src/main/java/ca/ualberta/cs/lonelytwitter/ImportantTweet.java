package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jroutled on 1/19/17.
 *
 * ImportantTweet is a subclass that extends Tweet.
 */

public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message of the tweet
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date of the tweet
     * @param message the message of the tweet
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    /**
     * Sets tweet to important.
     */
    public Boolean isImportant(){
        return true;
    }
}
