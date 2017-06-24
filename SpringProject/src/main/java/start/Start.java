package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.ModelT1000;

/**
 * Created by Alex on 23.06.2017.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Object object = context.getBean("t1000Third");

        if (object instanceof ModelT1000) {
            ModelT1000 t1000 = (ModelT1000) object;
            t1000.action();
        }
    }
}
