package serializable;

import java.io.Serializable;

//класс, кот исп. в качестве поля,у сериализуемого класса тоже д.б. сериализуемым
public class TerritoriesInfo implements Serializable {
    private String info;

    public TerritoriesInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TerritoriesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}



