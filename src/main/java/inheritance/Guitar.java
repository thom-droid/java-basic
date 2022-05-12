package inheritance;

public class Guitar extends Instruments{

    public InstrumentCompany company;
    public Chord chord;

    public static class Chord {
        public boolean isDim;
        public String name;
        public String notes;
        public boolean isAug;
    }
    public Guitar(int price, String name, String type, boolean isAcoustic, InstrumentCompany company, Chord chord) {
        super(price, name, type, isAcoustic);
        this.company = company;
        this.chord = chord;
    }

    @Override
    public void sound() {
        System.out.println("디리링~");
    }
}
