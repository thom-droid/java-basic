package constructors;

public class ConstructorMain {

    public static void main(String[] args) {
        ConstructorExample.InnerStaticClass innerStaticClass = new ConstructorExample.InnerStaticClass();
        System.out.println(innerStaticClass.name);

        DefaultConstructorExample defaultConstructorExample = new DefaultConstructorExample();
        defaultConstructorExample.doSomething("메롱시티");
    }
}
