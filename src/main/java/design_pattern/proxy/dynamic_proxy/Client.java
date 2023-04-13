package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        ITEmployee employee = new ITEmployee(1, "sam", 30000);
//        employee.giveHike(5000);

        EmployeeSalaryInvocationHandler employeeSalaryInvocationHandler = new EmployeeSalaryInvocationHandler(employee);
        IEmployee iEmployee =
                (IEmployee) Proxy.newProxyInstance(
                        employee.getClass().getClassLoader(),
                        new Class[]{IEmployee.class},
                        employeeSalaryInvocationHandler);

        iEmployee.giveHike(6000);
        System.out.println(iEmployee.getSalary());

    }
}
