package colletions.generics;

import java.util.ArrayList;

public class GenericExampleMain {
    public static void main(String[] args) {

        Printer<Integer> p = new Printer<>(23);
        p.print();

        Printer<String> p2 = new Printer<>("this is a thing");
        p2.print();


        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat("nancy"));

//        Cat myCat = cats.get(0);

        cats.add(new Dog("nante"));
    }
}
