package generics;

public class Printer<T> {

    public T thing;

    public Printer(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(thing);
    }

    public <S extends Integer> void doSomething(S something) {
        System.out.println(something);
        int another = 3;
        int compared = something.compareTo(another);
    }

    public T doNothing() {
        Cat result = new Cat("meow");
        Animal animal = new Animal("mam");
        Printer<Animal> animalPrinter = new Printer<>(animal);
        return this.thing;
    }
}
