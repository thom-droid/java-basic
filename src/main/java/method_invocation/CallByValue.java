package method_invocation;

public class CallByValue {

    int a;
    int b;

    public void changeValues(int a, int b) {
        a += 50;
        b += 60;

        System.out.println("a : "+ a+ " , b : "+b);
    }

    public CallByValue(int a, int b) {
        this.a = a;
        this.b = b;
    }


}
