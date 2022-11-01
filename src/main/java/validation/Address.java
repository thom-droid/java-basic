package validation;

import javax.validation.constraints.NotNull;

public class Address {

    public String zipCode;
    public String city;

    @NotNull(message = "would be nice if we had one", payload = Severity.Info.class)
    public String getZipCode() {
        return this.zipCode;
    }

    @NotNull(message = "the city is mandatory", payload = Severity.Error.class)
    String getCity() {
        return this.city;
    }
}
