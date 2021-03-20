package by.itacademy.lesson12.task;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "Task3Modified.java");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))){
            List<StringBuilder> listRows = bufferedReader.lines()
                    .map(it -> new StringBuilder(it).reverse())
                    .collect(Collectors.toList());
            writeToFile (listRows);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(List<StringBuilder> listRows) {
        Path path = Paths.get("resources", "Task3Reverced.java");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))){
            for (StringBuilder row : listRows) {
                writer.append(row);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
