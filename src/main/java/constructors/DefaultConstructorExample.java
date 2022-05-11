package constructors;

public class DefaultConstructorExample {

    private static final String DEFAULT = "DEFAULT";
    public static final String STRING_FROM_CONSTRUCTOR_EXAMPLE = "NO-ARGS";
    private String thisIsTheLongestNameIEverCouldThinkOfForNow;
    private int value;
    private boolean isAlive;

    public void doSomething(String instruction) {
        instruction = DEFAULT;
        System.out.println(instruction);
    }

}
