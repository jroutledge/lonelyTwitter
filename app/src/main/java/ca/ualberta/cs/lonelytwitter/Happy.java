package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jeffreyroutledge on 2017-01-19.
 *
 * Happy is a subclass that extends Mood.
 */

public class Happy extends Mood {
    private String smood;

    public Happy() {
        smood = "Happy";
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
