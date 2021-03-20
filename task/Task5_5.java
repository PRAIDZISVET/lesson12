package by.itacademy.lesson12.task;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task5_5 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src", "by", "itacademy", "lesson12", "task", "Task3.java");

        List<String> lines = Files.lines(path)
                .map(line -> line.replaceAll("public", "private"))
                .collect(Collectors.toList());

        Path pathToWrite = Paths.get("resources", "Task3Modified.java");
        Files.write(pathToWrite, lines, CREATE, APPEND);
    }
}
