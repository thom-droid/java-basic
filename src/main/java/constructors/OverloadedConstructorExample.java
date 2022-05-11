package constructors;

public class OverloadedConstructorExample {

    private String name;
    private int value;
    private boolean isRight;

    public OverloadedConstructorExample(String name, int value, boolean isLeft) {
        this.name = name;
        this.value = value;
        this.isRight = isLeft;
    }

    public OverloadedConstructorExample(String name) {
        this.name = name;
    }

    public OverloadedConstructorExample(int value) {
        this.value = value;
    }
}
