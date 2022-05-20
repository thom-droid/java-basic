package effectives.io;

import lombok.SneakyThrows;

import java.io.FileReader;

public class FileReaderExample {
    @SneakyThrows
    public static void main(String[] args) {
        String fileName = "dozy.txt";
        FileReader fr = new FileReader(fileName);

        int data =0;

        while ((data = fr.read()) != -1) {
            System.out.println((char)data);
        }
        fr.close();
    }
}
