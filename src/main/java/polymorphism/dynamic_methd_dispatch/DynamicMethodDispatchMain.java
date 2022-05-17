package polymorphism.dynamic_methd_dispatch;

public class DynamicMethodDispatchMain {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass(10);
        SuperClass subClass1 = new SubClass1(20);
        SuperClass subClass2 = new SubClass2(30);

        superClass.doSomething();
        subClass1.doSomething();
        subClass2.doSomething();

        System.out.println(superClass.a);
        System.out.println(subClass1.a);
        System.out.println(subClass2.a);


    }
}
