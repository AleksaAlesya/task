package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseralizationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("D:\\java_code\\tasksGit\\src\\serializable\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);
    }
}
