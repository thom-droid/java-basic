package generics.exam3;

import java.util.List;

public class English extends Latin {

    public String dialect;
    public List<String> countries;

    public English(String dialect, List<String> countries) {
        this.dialect = dialect;
        this.countries = countries;
    }
}
