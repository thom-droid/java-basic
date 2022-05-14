package method_invocation;

public class CallByValueMain {
    public static void main(String[] args) {

        CallByValue cbv = new CallByValue(10, 20);
        cbv.changeValues(10, 20);
        System.out.println("cbv's a : " + cbv.a + ", cbv's b : "+ cbv.b);
    }
}
