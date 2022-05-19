package effectives.enums;

public enum Coffees {

    ESPRESSO(1500, "fragrant drink that warms up your belly"),
    AMERICANO(2500, "espresso with ice-cold water"),
    CAFFELATTE(3500, "espresso with the warm soft milk"),
    CAPUCCINO(4000, "espresso with the steamed milk bubble");

    private final int price;
    private final String description;

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    Coffees(int price, String description) {
        this.price = price;
        this.description = description;
    }
}
