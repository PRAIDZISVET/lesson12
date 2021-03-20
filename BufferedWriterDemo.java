package by.itacademy.lesson12;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class BufferedWriterDemo {
        public static void main (String[]args) throws IOException {
            Path path = Paths.get("resources", "temp", "test2.txt");
            File file = path.toFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
                writer.append("test1");
                writer.append(System.lineSeparator());
                writer.append("test2");
                writer.append(System.lineSeparator());
                writer.newLine();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}