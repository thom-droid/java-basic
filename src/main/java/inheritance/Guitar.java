package inheritance;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar extends Instruments{

    public InstrumentCompany company;


    @Override
    public void sound() {
        System.out.println("디리링~");
    }


}
