package polymorphism.interfaces;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BankCustomer implements BankCustomerInterface{

    protected final String name;
    protected String account;
    protected int money;

    @Override
    public void getCustomerInfo() {
        System.out.printf("%s, your account name is %s, and balance is %d. %c ",
                this.getName(), this.getAccount(), this.getMoney(), '\n');
    }
}
