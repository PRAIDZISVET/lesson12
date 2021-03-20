package by.itacademy.lesson12.task;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task5 {
    public static void main(String[] args) {
        Path path = Paths.get("src", "by", "itacademy", "lesson12", "task", "Task3.java");
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path.toFile()))) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String textOfClass = new String(bytes);
            String replacedTextOfClass = textOfClass.replaceAll("public", "private");
            outToFile (replacedTextOfClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outToFile(String value) {
        File file = Paths.get("resources", "Task3Modified.java").toFile();
        try (BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file))){
            bufferedwriter.append(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
