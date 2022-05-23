package effectives.enums;

public class EnumsMain {

    public static void main(String[] args) {
        Weekdays weekday  = Weekdays.valueOf("THURSDAY");
        String name = weekday.getExpression();

        int order = weekday.ordinal();
        int code = weekday.getCode();
        System.out.println(Weekdays.MONDAY.ordinal());
        System.out.println(weekday.getExpression());
        System.out.println(name);
        System.out.println(order);
        System.out.println(code);
    }
}
