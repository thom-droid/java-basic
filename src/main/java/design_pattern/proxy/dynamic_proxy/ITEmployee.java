package design_pattern.proxy.dynamic_proxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ITEmployee implements IEmployee {

    private int id;
    private String name;
    private double salary;

    public ITEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void giveHike(double amount) {
        this.salary += amount;
    }

    @Override
    public void payCut(double amount) {
        this.salary -= amount;
    }
}
