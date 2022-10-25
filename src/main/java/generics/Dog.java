package generics;

public class Dog extends Animal {

    @Override
    public void cry() {
        System.out.println("bowwow!!");
    }

    public Dog(String name) {
        super(name);
    }
}
