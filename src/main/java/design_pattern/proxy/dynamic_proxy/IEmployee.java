package design_pattern.proxy.dynamic_proxy;

public interface IEmployee {

    void giveHike(double amount);

    void payCut(double amount);

    int getId();
    String getName();

    void setId(int id);

    void setName(String name);

    double getSalary();

    void setSalary(double amount);

}
