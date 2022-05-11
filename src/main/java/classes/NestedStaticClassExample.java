package classes;

public class NestedStaticClassExample {

    public String title;

    public static class Publisher {
        public static final String GLOBAL_PUBLISHER = "SONY";
        public String title ;

        public String publisherSound() {
            System.out.println("i make lots of money out of it");
            return title;
        }
    }

}
