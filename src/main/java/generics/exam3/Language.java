package generics.exam3;

public class Language<T> {

    public String name;
    public String country;
    public T other;

    public Language(String name, String country, T other) {
        this.name = name;
        this.country = country;
        this.other = other;
    }

    public English convertToEnglish(Language<? extends English> language) {
        return language.other;
    }

}
