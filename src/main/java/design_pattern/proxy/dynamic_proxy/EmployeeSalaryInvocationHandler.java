package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

    private final IEmployee target;

    public EmployeeSalaryInvocationHandler(IEmployee target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //pre processing
        if (method.getName().equals("giveHike")) {
            double hikeValue = (double) args[0];

            if (hikeValue <= 0.0) {
                throw new RuntimeException("hike amount cannot be minus");
            }
        }

        // actual code
        Object returnValue = method.invoke(target, args);

        // post processing
        System.out.println("executing method : " + method.getName() + "() is invoked for employee " + target.getId());

        return returnValue;
    }
}
