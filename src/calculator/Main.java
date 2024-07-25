package calculator;

import taskFromBook.Artists;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            try {
                String stringIn = Files.readString(Path.of("src/calculation.txt"));
               System.out.println(stringIn);
                String  [] f =stringIn.split("_");
                Arrays.stream(f).toList().forEach(System.out::println);

                String stringOut ="= \n" ;
                FileOutputStream fileOutputStream = new FileOutputStream("src/calculation.txt",true);
                fileOutputStream.write(stringOut.getBytes());
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    }
}
