package serializable;

import java.io.Serializable;


public class Info  {
    private String info;

    public Info(String info) {
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
        return "Info{" +
                "info='" + info + '\'' +
                '}';
    }
}



