package colletions.generics;

public class GenericExample2Main {
    public static void main(String[] args) {

        AnimalPrinter<Cat> catPrinter;
        catPrinter = AnimalPrinter.createAnimalPrinter();

        AnimalPrinter animalPrinter = AnimalPrinter.createAnimalPrinter();
        Dog dog = new Dog("dog");

        animalPrinter.setAnimal(dog);
    }
}
