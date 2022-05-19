package effectives.annotations;

public class CoffeeUtil {

    public static Coffee createCoffeeFromMetaData(Class<? extends Coffee> coffee) {

        if (coffee.isAnnotationPresent(CoffeeAnnotation.class)) {
            CoffeeAnnotation coffeeAnnotation = coffee.getDeclaredAnnotation(CoffeeAnnotation.class);
            String name = coffeeAnnotation.coffees().toString();
            int price = coffeeAnnotation.coffees().getPrice();
            String description = coffeeAnnotation.coffees().getDescription();
            return new Coffee(name, price,description);
        }

        return null;
    }
}
