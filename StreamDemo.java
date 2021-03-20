package by.itacademy.lesson12;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class StreamDemo {
    public static void main(String[] args) {
        File file = Paths.get("resources", "temp", "test.txt").toFile();

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
           while (scanner.hasNextLine()) {
               System.out.println(scanner.nextLine());
           }
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
