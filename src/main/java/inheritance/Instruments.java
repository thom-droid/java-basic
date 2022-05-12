package inheritance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Instruments {
    
    public String name;
    public int price;
    public String type;
    public boolean isAcoustic;

    void sound() {
        System.out.println("소리가 납니다");
    }

}
