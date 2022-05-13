package polymorphism.abstracts;

public class AbstractMain {


    public static void main(String[] args) {
        AbstractClassExample example = new AbstractImplClass();
        example.imAbstractMethod();

        AbstractClassExample example1 = new AbstractImplClass2();
        example1.imAbstractMethod();
    }


}
