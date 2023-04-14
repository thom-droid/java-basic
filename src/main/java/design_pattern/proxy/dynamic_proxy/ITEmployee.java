package design_pattern.proxy.dynamic_proxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ITEmployee implements IEmployee, CSuite {

    private int id;
    private String name;
    private double salary;
    private boolean isHired;

    public ITEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.isHired = true;
    }

    @Override
    public void giveHike(double amount) {
        this.salary += amount;
    }

    @Override
    public void payCut(double amount) {
        this.salary -= amount;
    }

    @Override
    public void layoff() {
        this.isHired = false;
    }
}
