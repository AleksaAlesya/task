package core_java.file_input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Files/numbers1");
        PrintWriter pw = new PrintWriter(file);
        pw.println("привет");
        pw.println("пока");
        pw.close();


        //выводим список всех файлов в папке
        File folder = new File("Files");
        for (File f:folder.listFiles()) {
            System.out.println(f);

        }
    }


}
