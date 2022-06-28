package exception;

import com.sun.istack.internal.NotNull;

public class SomeClass {

    private String name;

    public SomeClass(String name) throws SomeException {
        if (name.equals("")) {
            throw new SomeException("an empty string is not allowed");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
