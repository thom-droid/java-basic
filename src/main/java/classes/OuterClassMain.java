package classes;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClassExample outerClass = new OuterClassExample();
        OuterClassExample.InnerClass innerClass = outerClass. new InnerClass();
        innerClass.lastName = "hyeonsu";
    }
}
