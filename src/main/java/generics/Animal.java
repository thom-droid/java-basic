package generics;

public class Animal {

    public String name;

    public void cry() {
        System.out.println("this is animal sound system");
    }

    public Animal(String name) {
        this.name = name;
    }

    public static <T extends Animal> T createNewAnimal(T something) {
        return something;
    }

}
