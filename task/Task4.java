package by.itacademy.lesson12.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "temp", "test.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String currentValue;
            while ((currentValue = bufferedReader.readLine()) != null) {
                int max = 0;
                int current = 0;
                for (char currentChar : currentValue.toCharArray()) {
                    if (Character.isDigit(currentChar)) {
                        current++;
                    } else {
                        max = Math.max(max,current);
                        current = 0;
                    }
                }
                max = Math.max(max,current);
                System.out.println(max + ": " + currentValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
