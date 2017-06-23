package robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by Alex on 23.06.2017.
 */
public class ModelT1000 implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000() {
    }

    @Override
    public void action() {
        head.calc();
        hand.take();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }
}
