package by.itacademy.lesson12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BufferedInputStreamDemo {
        public static void main (String[]args) throws IOException {
            Path path = Paths.get("resources", "temp", "test.txt");
            File file = path.toFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                reader.lines().forEach(System.out::println);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

//        public static void test (File file) {
//            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
//                byte[] values = new byte[inputStream.available()];
//                inputStream.read(values);
//                System.out.println(Arrays.toString(values));
//                System.out.println(new String(values));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
}