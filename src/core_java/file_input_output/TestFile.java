package core_java.file_input_output;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestFile {
    public static void main(String[] args) throws IOException {

        System.out.println("FileOutputStream++++++++++");
        File file0 = new File("src/test22.txt"); // если не существует - создает
        FileOutputStream fileOutputStream = new FileOutputStream(file0,true); // дописываает в файл, есл не указать иру, то перезаписывает
        //  \n переносит на новую строку
        String stringOut = "Kak dela?  \n";
       fileOutputStream.write(stringOut.getBytes());
       fileOutputStream.close();

        System.out.println("++++++++++FileInputStream+++++++++++");
        File file = new File("src/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
//        Считываем один байт из файла, преобразуем прочитанные байты в символы и выводим их на консоль
        while ((i=fileInputStream.read())!=-1){
            System.out.print((char) i);
        }

        System.out.println();


        // BufferedInputStream данные будут считываться из файла не по одному байту за раз, а по 200 (как укажем в конструкторе) за раз
        System.out.println("++++++++BufferedInputStream+++++++++++");
        FileInputStream fileInputStream1 = new FileInputStream("src/test.txt");
        BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream1,200);
        int a;
        while ((a = bufferedInputStream.read()) != -1){
            System.out.print((char) a);
        }

        System.out.println("+++++++Files++++++++");
        String string = Files.readString(Path.of("src/test.txt"));
        System.out.println(string);

        System.out.println("+++++++++++++++++++");
        //вычитываем из файла
        System.out.println(Files.readString(Path.of("src/test22.txt" )));
        //добавляем в файл
        Files.writeString(Path.of("src/test22.txt") ,  "ты моя конфетка", StandardOpenOption.APPEND);

//        File file = new File("src/calculation.txt");
//        String path = file.getAbsolutePath();
//        System.out.println(file.getName());
//        System.out.println(path);
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            System.out.println(fis);/
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
}
