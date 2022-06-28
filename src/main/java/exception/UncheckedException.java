package exception;

public class UncheckedException {

    public static void method1() throws SomeException {
        try {
            method2();
        } catch (ClassNotFoundException classNotFoundException) {
            throw new SomeException("no class found");
        }
    }

    public static void method2() throws ClassNotFoundException{
        Class clazz = Class.forName("java.lang.StringWhat"); // this triggers ClassNotFoundException
    }

    public static void main(String[] args) throws SomeException {
        method1();
    }
}
