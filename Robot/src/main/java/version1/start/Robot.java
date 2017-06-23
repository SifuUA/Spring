package version1.start;

import version1.objects.SonyHand;
import version1.objects.SonyHead;
import version1.objects.SonyLeg;

/**
 * Created by Alex on 23.06.2017.
 */
public class Robot {
    private SonyHand hand = new SonyHand();
    private SonyLeg leg = new SonyLeg();
    private SonyHead head = new SonyHead();

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}