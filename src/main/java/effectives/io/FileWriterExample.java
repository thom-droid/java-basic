package effectives.io;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterExample {

    @SneakyThrows
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new FileWriter("this is friday"));

        bw.write("this is friday. so glad but sad at the same time 'cause i have a part time job tomorrow");
        bw.close();
    }
}
