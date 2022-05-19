package effectives.enums;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffees espresso1 = Coffees.ESPRESSO;
        Coffees espresso2 = Coffees.ESPRESSO;

        System.out.println(espresso1 == espresso2);
        String description = Coffees.AMERICANO.getDescription();
        int price = Coffees.CAPUCCINO.getPrice();

        System.out.println(description);
        System.out.println(price);
    }
}
