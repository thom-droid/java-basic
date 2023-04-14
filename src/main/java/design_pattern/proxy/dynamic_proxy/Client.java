package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        ITEmployee employee = new ITEmployee(1, "sam", 30000);
//        employee.giveHike(5000);

        EmployeeSalaryInvocationHandler employeeSalaryInvocationHandler = new EmployeeSalaryInvocationHandler(employee);
//        IEmployee iEmployee =
//                (IEmployee) Proxy.newProxyInstance(
//                       employee.getClass().getClassLoader(),
//                       new Class[]{IEmployee.class, CSuite.class},
//                       employeeSalaryInvocationHandler);
//
//        iEmployee.giveHike(6000);

//        System.out.println(iEmployee.getSalary());
        Object employeeProxy = Proxy.newProxyInstance(
                       employee.getClass().getClassLoader(),
                       new Class[]{IEmployee.class, CSuite.class},
                       employeeSalaryInvocationHandler);

        CSuite cSuite = (CSuite) employeeProxy;
        cSuite.layoff();
        System.out.println(employee.isHired());
        IEmployee iEmployee = (IEmployee) employeeProxy;

        iEmployee.giveHike(5000);
        System.out.println(iEmployee.getSalary());


    }
}
