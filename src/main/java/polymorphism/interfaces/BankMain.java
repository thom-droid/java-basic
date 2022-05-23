package polymorphism.interfaces;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        BankCustomerA bankCustomerA = new BankCustomerA("바닐라");
        BankCustomerB bankCustomerB = new BankCustomerB("코코아");
        bank.withdraw(bankCustomerA);
        bank.withdraw(bankCustomerB);
    }

}
