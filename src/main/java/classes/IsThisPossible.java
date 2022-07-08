package classes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IsThisPossible {

    private String name;
    private int price;

    public void test() {
        String name = IsThisPossible.this.getName();
        IsThisPossible isThisPossible = IsThisPossible.this;

        System.out.println("name : " + name);
        System.out.println(isThisPossible);
        System.out.println(isThisPossible.getClass());
    }

}
