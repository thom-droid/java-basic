package inheritance;

public class Instruments {

    public int price;
    public String name;
    public String type;
    public boolean isAcoustic;

    void sound() {
        System.out.println("소리가 납니다");
    }

    public Instruments(int price, String name, String type, boolean isAcoustic) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.isAcoustic = isAcoustic;
    }

    public Instruments() {
    }
}


