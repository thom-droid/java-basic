package colletions.generics;

public class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("meow~");
    }

    public Cat(String name) {
        super(name);
    }
}
