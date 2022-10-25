package generics.exam3;

import java.util.List;

public class French extends Latin {

    public String location;
    public List<String> countries;

    public French(String location, List<String> countries) {
        this.location = location;
        this.countries = countries;
    }
}
