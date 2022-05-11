package constructors;

public class ConstructorExample {

    public String name;

    public static class InnerStaticClass {
        public String name;
        public InnerStaticClass() {
        }

        public InnerStaticClass(String name) {
            this.name = name;
        }

        public static void doSomething(String instruction) {

            System.out.println(instruction);
        }
    }

}
