package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) throws IOException {

         Info  info = new Info("Ни о чем");
            //создаем наш объект
            TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций"+ "У России 10 провинций");String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
            String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

            SavedGame savedGame = new SavedGame(info,territoriesInfo, resourcesInfo, diplomacyInfo);

            //создаем 2 потока для сериализации объекта и сохранения его в файл
            FileOutputStream outputStream = new FileOutputStream("D:\\java_code\\tasksGit\\src\\serializable\\save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем игру в файл
            objectOutputStream.writeObject(savedGame);

            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();

    }
}
