package polymorphism.abstracts;

public abstract class AbstractClassExample {

    public String name;

    public String getName() {
        return name;
    }

    public AbstractClassExample(String name) {
        this.name = name;
    }

    public AbstractClassExample() {
    }

    public abstract void imAbstractMethod();
}
