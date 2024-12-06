package exercises.Task3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LoggingProxy implements InvocationHandler {
    private final Object target;
    public LoggingProxy(Object target){
        this.target = target;
    }

    public static Object createProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingProxy(target)
        );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName() +
                " was called with arguments : " + Arrays.toString(args) );
        return method.invoke(target, args);
    }
}
