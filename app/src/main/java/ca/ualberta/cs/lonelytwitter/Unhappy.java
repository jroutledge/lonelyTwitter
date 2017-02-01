package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jeffreyroutledge on 2017-01-19.
 *
 * Unhappy is a subclass that extends mood.
 */

public class Unhappy extends Mood {
    private String smood;

    public Unhappy() {
        smood = "Unhappy";
    }

    /**
     * Get smood string.
     *
     * @return the string
     */
    public String getSmood(){
        return smood;
    }
}
