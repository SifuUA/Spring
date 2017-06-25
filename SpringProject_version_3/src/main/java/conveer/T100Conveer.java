package conveer;

import interfaces.Robot;
import interfaces.RobotConveer;

/**
 * Created by Alex on 25.06.2017.
 */
public abstract class T100Conveer implements RobotConveer {

    @Override
    public abstract Robot createRobot();
}
