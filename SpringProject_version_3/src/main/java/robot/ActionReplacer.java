package robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Alex on 25.06.2017.
 */
public class ActionReplacer implements MethodReplacer{

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("new action!!!");
        return null;
    }
}
