package generics;

public class AnimalPrinter<T extends Animal> {

    T animal;
    String nickname;


    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void print() {
        System.out.println(animal.name);
    }

    public void nicknamePrint() {
        System.out.println(nickname);
    }

    public static AnimalPrinter createAnimalPrinter() {
        return new AnimalPrinter();
    }
}
