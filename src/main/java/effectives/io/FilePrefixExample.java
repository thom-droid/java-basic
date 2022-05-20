package effectives.io;

import java.io.File;

public class FilePrefixExample {

    public static void main(String[] args) {

        File parentDir = new File("./");
        File[] list = parentDir.listFiles();
        String prefix = "arcade_fire_";

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();
            if (fileName.endsWith("txt") && !fileName.startsWith(prefix)) {
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }

    }
}
