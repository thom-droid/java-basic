package polymorphism.dynamic_methd_dispatch;

public class SubClass2 extends SuperClass {

    int a;
    @Override
    public void doSomething() {
        System.out.println("im subclass 2");
    }

    public SubClass2(int a) {
        this.a = a;
    }
}
