package constructors;

public class ConstructorThisExample {

    public String name;
    public int value;

    public ConstructorThisExample() {
    }

    public ConstructorThisExample(String name) {
        this(name, 5000);
    }

    public ConstructorThisExample(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
