package classes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IsThisPossible {

    private String name;
    private int price;

    public void test() throws ClassNotFoundException {
        String name = IsThisPossible.this.getName();
        IsThisPossible isThisPossible = IsThisPossible.this;

        System.out.println("name : " + name);
        System.out.println(isThisPossible);
        System.out.println(isThisPossible.getClass());
        Class<?> clazz = Class.forName("classes.IsThisPossible");
        System.out.println(clazz.getName());
        System.out.println(clazz);
        System.out.println(clazz.getClassLoader().toString());
    }


}
