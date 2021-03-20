package by.itacademy.lesson12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File resourcesDirectory = new File("resources");
        Path path = Paths.get("resources","temp","test.txt");
        File file = path.toFile();
        file.mkdirs();
        boolean created = file.createNewFile();
        System.out.println(file.getAbsolutePath());

    }
}
