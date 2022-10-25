package generics;

public class SomethingPrinter {

    public String something;

    public SomethingPrinter(String something) {
        this.something = something;
    }

    public void print() {
        System.out.println(something);
    }
}
