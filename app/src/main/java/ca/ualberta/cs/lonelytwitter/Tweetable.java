package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jroutled on 1/19/17.
 *
 * Tweetable is the interface of the tweet.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
