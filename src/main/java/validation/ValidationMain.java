package validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationMain {

    public static void main(String[] args) {
        Address address = new Address();

        System.out.println(address.getZipCode());

        List<String> s = new ArrayList<>();
        s.add(" d");
        System.out.println(s.get(1).trim());
    }

    public enum Direction {
        EAST("E"),
        WEST("W"),
        NORTH("N"),
        SOUTH("S");

        private final String shortCode;

        Direction(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getShortCode() {
            return shortCode;
        }
    }
}
