package taskFromBook;

import java.util.List;

public class Artist {
    /*имя или название исполнителя (например, «The Beatles»);*/
    private String name;
    /*другие исполнители, входящие в состав группы (на-
пример, «Джон Леннон»), это поле может быть пустым;*/
    private List <Artist> members;
    /*место, где возникла группа (например, «Ливерпуль»)*/
    private  String origin;

    public Artist(String name, String origin, List<Artist> members) {
        this.name = name;
        this.origin = origin;
        this.members = members;
    }

    public Artist(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", origin='" + origin + '\'' +
                '}';
    }
}
