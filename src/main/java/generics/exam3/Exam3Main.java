package generics.exam3;

import java.util.List;

public class Exam3Main {

    public static void main(String[] args) {
        Latin latin = new Latin(List.of("Spain", "Italia", "France"));
        Language<Latin> latino = new Language<>("latin", "italia", latin);

        French french = new French("france", List.of("hollands", "france"));

//        latino.convertToEnglish(french); // compile error

    }
}
