package by.itacademy.lesson12.task;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Path path = Paths.get("resources","temp","test.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream (path.toFile())))){
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
