package version2.start;

import version2.sony.SonyHand;
import version2.sony.SonyHead;
import version2.toshiba.ToshLeg;

/**
 * Created by Alex on 23.06.2017.
 */
public class RobotConstrctor {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand();
        ToshLeg toshLeg = new ToshLeg();
        SonyHead sonyHead = new SonyHead();

        Robot2 robot2 = new Robot2(sonyHand, toshLeg, sonyHead);
        robot2.actions();
    }
}
