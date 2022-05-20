package thread;

import lombok.Getter;

public class SharedObj {

    @Getter
    private int data;

    @Getter
    private String name;

    public SharedObj(int data, String name) {
        this.data = data;
        this.name = name;
    }

    public void setData(int data) {
        this.data = data;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s has set data %d. currently saved data is %d %c",
                Thread.currentThread().getName(), data, this.data, '\n');
    }
}
