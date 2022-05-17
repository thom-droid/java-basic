package colletions.generics;

public class Printer<T> {

    private T thing;

    public Printer(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(thing);
    }
}
