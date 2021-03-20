package by.itacademy.lesson12.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task6_6 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources", "Task3Modified.java");

        List<StringBuilder> newLines = Files.lines(path)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.toList());

        Path path1 = Paths.get("resources", "Tadasdfasdf.java");
        Files.write(path1, newLines, CREATE, APPEND);

    }

}
