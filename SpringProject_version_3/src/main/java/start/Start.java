package start;

import interfaces.Robot;
import interfaces.RobotConveer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.ModelT1000;

/**
 * Created by Alex on 23.06.2017.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        RobotConveer t1000Conveer = (RobotConveer) context.getBean("t1000Conveer");

        Robot terminator1 = t1000Conveer.createRobot();
        Robot terminator2 = t1000Conveer.createRobot();
        Robot terminator3 = t1000Conveer.createRobot();

        System.out.println("Terminator1 " + terminator1);
        System.out.println("Terminator2 " + terminator2);
        System.out.println("Terminator3 " + terminator3);





        // ModelT1000 t1000 = (ModelT1000)context.getBean("t1000");
            //t1000.action();
        //   System.out.println(t1000.getHead());
//            t1000 = (ModelT1000)context.getBean("t1000");
//            System.out.println(t1000.getHead());

    }
}
