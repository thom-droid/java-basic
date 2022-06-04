package effectives.io;

import lombok.SneakyThrows;

import java.io.File;

public class FileExample {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("../this is friday.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.canWrite());

        File newFile = new File("./", "rebellion.txt");
        System.out.println(newFile.getAbsolutePath());
        System.out.println(newFile.getPath());
        System.out.println(newFile.getCanonicalPath());
        System.out.println(newFile.canWrite());

        newFile.createNewFile();
    }
}
