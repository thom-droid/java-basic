package polymorphism.interfaces;

public class Bank {

//    public void withdraw(BankCustomerA bankCustomerA) {
//        System.out.printf("%s 님, 안녕하세요, %c", bankCustomerA.getName(), '\n');
//    }
//
//    public void withdraw(BankCustomerB bankCustomerB) {
//        System.out.printf("%s 님, 안녕하세요, %c", bankCustomerB.getName(), '\n');
//    }

//    public void withdraw(BankCustomer bankCustomer) {
//        System.out.printf("welcome, %s, %c", bankCustomer.getName(), '\n');
//    }

    public void withdraw(BankCustomerInterface bankCustomerInterface) {
        bankCustomerInterface.getCustomerInfo();
    }

}
