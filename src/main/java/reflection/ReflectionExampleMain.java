package reflection;

import design_pattern.proxy.Student;
import design_pattern.proxy.StudentImplProxy;

public class ReflectionExampleMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> studentInfo = Class.forName("design_pattern.proxy.StudentImplProxy");
        Class<?> studentClass = StudentImplProxy.class;
        studentInfo.equals(studentClass);

    }
}
