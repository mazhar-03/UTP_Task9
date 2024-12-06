package lecture.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
        System.out.println(
                "Before method: " + method.getName()
        );

        if(args != null)
            for(Object arg : args)
                System.out.println("Argument: " + arg);

        Object result = method.invoke(target, args);

        System.out.println(
                "After method: " + method.getName()
        );

        return result;
    }
}
