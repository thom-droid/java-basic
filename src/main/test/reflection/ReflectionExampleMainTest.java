package reflection;

import design_pattern.proxy.Lecture;
import design_pattern.proxy.StudentImplProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionExampleMainTest {

    @Test
    void reflectionTest() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> studentProxy = Class.forName("design_pattern.proxy.StudentImplProxy");
        Class<?> studentProxy2 = StudentImplProxy.class;

        assertEquals(studentProxy, studentProxy2);

        Method method = studentProxy.getMethod("attend", Lecture.class);
        assertThrows(IllegalArgumentException.class, () -> method.invoke(studentProxy, (Object) null));

    }
}