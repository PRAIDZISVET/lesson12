package by.itacademy.lesson12.task;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task2 {
   private static final String VOWELS = "аеёиоуыэюя";

    public static void main(String[] args) {
       Path path = Paths.get("resources","temp","test.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream (path.toFile())))){
           while (scanner.hasNext()) {
               String next = scanner.next();
               if (isStartFromVowel(next)) {
                   System.out.println(next);
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static boolean isStartFromVowel (String word) {
    return VOWELS.indexOf(Character.toLowerCase(word.charAt(0))) != -1;
    }
}
