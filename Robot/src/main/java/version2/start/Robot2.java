package version2.start;

import version2.interfaces.Hand;
import version2.interfaces.Head;
import version2.interfaces.Leg;

/**
 * Created by Alex on 23.06.2017.
 */
public class Robot2 {
    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot2(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void actions(){
        hand.take();
        head.calc();
        leg.go();
    }
}
