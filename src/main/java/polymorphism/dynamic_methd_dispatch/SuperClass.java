package polymorphism.dynamic_methd_dispatch;

public class SuperClass {

    int a;

    public void doSomething() {
        System.out.println("im superclass");
    }

    public SuperClass(int a) {
        this.a = a;
    }

    public SuperClass() {
    }
}
