package core_java.file_input_output;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {

        String separator = File.separator; // создали сепаратор, кот. будет определять в какой системе работает программа - линукс, виндовс и подставлять автоматически
        String path = "C:/Users/ITQ/Desktop/My.docx";
//                "C:" +separator+"Users" +separator+ "ITQDesktop" +separator+"My.docx";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            //todo почему то не считывает
            System.out.println(scanner.nextLine());
        }
        scanner.close();

/////////////В файле несколько строк, считываем поочередно все строки
        String path1 = "books/page1";
        File file1 = new File(path1);
        Scanner scanner1 = new Scanner(file1);
        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
        scanner1.close();

        /////////////////////
        String path2 = "books/numbers";
        File file2 = new File(path2);
        Scanner scanner2 = new Scanner(file2);
        String str = scanner2.nextLine();
        System.out.println(str);
//        String[] strings = str.split(" ");
//        System.out.println(Arrays.toString(strings));
        String[] numbers = str.split(" ");
        System.out.println(Arrays.toString(numbers));
        int[] numbersInt = new int[8];
        int counter = 0;
        for (String number : numbers) {
            numbersInt[counter] = Integer.parseInt(number);
            System.out.println(numbersInt[counter] + 1);
            counter++;

        }
        System.out.println(Arrays.toString(numbersInt));
        scanner2.close();


    }


}
