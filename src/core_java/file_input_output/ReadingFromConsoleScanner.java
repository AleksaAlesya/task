package core_java.file_input_output;

import java.io.IOException;
import java.util.Scanner;

public class ReadingFromConsoleScanner {
    public static void main(String[] args) throws IOException {

        // считывание и з консоли
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("чтение из консоли  " + string);
        scanner.close();
    }



}
