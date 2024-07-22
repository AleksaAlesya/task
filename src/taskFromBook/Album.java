package taskFromBook;

import java.util.List;

public class Album {

    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    @Override
    public String toString() {
        return name;
    }

    public Album(String name) {
        this.name = name;
    }
}
