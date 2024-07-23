package calculator;

import taskFromBook.Artists;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            try {
                String stringOut = Files.readString(Path.of("src/calculation.txt"));
               System.out.println(stringOut);
                String  [] f =stringOut.split("_");
                Arrays.stream(f).toList().forEach(System.out::println);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    }
}
