package serializable;

import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {
    //это поле д.б. обязательно, что бы мы могли восстановить данные по
//    уникальный идентификатор версии сериализованного класса.
    private static final long serialVersionUID =1L;

  transient   Info info; // это поле не будет сериализоваться, т.е сохраняться
    TerritoriesInfo territoriesInfo; // обязаятельно должно имплем. Serializable
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public SavedGame(Info info, TerritoriesInfo territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo) {
        this.info = info;
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "info"  + "  "+
                "territoriesInfo=" +territoriesInfo.toString() +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }
}
