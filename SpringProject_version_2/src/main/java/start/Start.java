package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.ModelT1000;

/**
 * Created by Alex on 23.06.2017.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        ModelT1000 t1000 = (ModelT1000)context.getBean("t1000");
            //t1000.action();
        //   System.out.println(t1000.getHead());
//            t1000 = (ModelT1000)context.getBean("t1000");
//            System.out.println(t1000.getHead());

    }
}
