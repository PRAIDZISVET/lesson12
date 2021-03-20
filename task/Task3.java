package by.itacademy.lesson12.task;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task3 {
   public static final String VOWELS = "аеёиоуыэюя";
   public static final String EMPTY = "";

    public static void main(String[] args) {
       Path path = Paths.get("resources","temp","test.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream (path.toFile())))){
           while (scanner.hasNext()) {
               scanner.useDelimiter(",|\\.|;|\\?|:|!|\\s");
               String prev = null;
               if (scanner.hasNext()) {
                   prev=scanner.next();
               }
               while (scanner.hasNext()) {
                   String next = scanner.next();
                   if (!EMPTY.equals(next)) {
                       if (endLetter(prev) == startLetter (next)) {
                           System.out.println(prev + ": " + next);
                       }
                       prev = next;
                   }
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static char startLetter(String value) {
        return Character.toLowerCase(value.charAt(0));
    }

    public static char endLetter(String value) {
    return Character.toLowerCase(value.charAt(value.length()-1));
    }

}
