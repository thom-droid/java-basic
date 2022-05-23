package effectives.annotations;

import effectives.enums.Coffees;
import lombok.ToString;

@ToString
@CoffeeAnnotation(coffees = Coffees.ESPRESSO)
public class Coffee {

    private String name;
    private int price;
    private String description;

    public Coffee(String name, int price, String description) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Coffee() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
