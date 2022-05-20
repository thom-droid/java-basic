package effectives.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {

            BufferedInputStream bis = new BufferedInputStream(
                    Files.newInputStream(Paths.get("dozy.txt")));

            int i = 0;
            while ((i = bis.read()) != -1) {
                System.out.println((char)i);
            }

            bis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
