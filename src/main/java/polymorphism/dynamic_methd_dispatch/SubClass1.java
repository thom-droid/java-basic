package polymorphism.dynamic_methd_dispatch;

public class SubClass1 extends SuperClass {

    int a;

    @Override
    public void doSomething() {
        System.out.println("im subclass 1");
    }

    public SubClass1(int a) {
        this.a = a;
    }
}
