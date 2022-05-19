package effectives.enums;

public enum Weekdays {

    MONDAY(1, "tiring day"),
    TUESDAY(2, "bit less tiring"),
    WEDNESDAY(3, "heap day"),
    THURSDAY(4, "tomorrow is friday"),
    FRIDAY(5, "can't believe i can't still rest"),
    SATURDAY(6, "i work?"),
    SUNDAY(7, "please no night snacks!");

    private final String expression;
    private final int code;

    public String getExpression() {
        return this.expression;
    }

    public int getCode() {
        return code;
    }

    Weekdays(int code, String expression) {
        this.code = code;
        this.expression = expression;
    }
}
