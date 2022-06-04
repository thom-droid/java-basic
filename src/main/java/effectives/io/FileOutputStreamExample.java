package effectives.io;

import lombok.SneakyThrows;

import java.io.BufferedOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOutputStreamExample {

    @SneakyThrows
    public static void main(String[] args) {
        BufferedOutputStream bos = new BufferedOutputStream(
                Files.newOutputStream(Paths.get("sleepy.txt")));

        String content = "really sleepy after the lunch";

        byte[] b = content.getBytes();
        bos.write(b);
        bos.close();
    }
}
