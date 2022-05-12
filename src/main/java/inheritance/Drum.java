package inheritance;

public class Drum extends Instruments {

    public InstrumentCompany company;

    public Drum(int price, String name, String type, boolean isAcoustic, InstrumentCompany company) {
        super(price, name, type, isAcoustic);
        this.company = company;
    }

    @Override
    void sound() {
        System.out.println("낫 마이 템포!");
    }



}
