package by.itacademy.lesson12.task;

import lombok.Data;
import lombok.Getter;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class HWTask1 {

    public static final String SYMBOLS = "  ,.;:!?\n\r";

    public static void main(String[] args) {
        Path path = Paths.get("resources","temp","pushkin.txt");
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()))){
            byte [] bytesPushkin = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bytesPushkin);
            String textOfPushkin = new String(bytesPushkin);
            char [] charsPushkin = textOfPushkin.toLowerCase().toCharArray();
            Map<Character,Integer> mapPushkin = new TreeMap<Character, Integer>();
            for (char item : charsPushkin) {
                if (!(isSymbol(item))) {
                    mapPushkin.put(item, calcChars(item,charsPushkin));
                }
            }
            for (Map.Entry<Character, Integer> entry : mapPushkin.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int calcChars (char value, char [] chars ) {
        int count=0;
        for (char aChar : chars) {
            if (Character.toLowerCase(aChar) == Character.toLowerCase(value)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isSymbol (char value) {
        return SYMBOLS.indexOf(Character.toLowerCase(value)) != -1;
    }
}
