package taskFromBook;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Artists {

    private final List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Artist getArtistOld(int index) {
        if (index < 0 || index >= artists.size()) {
            indexException(index);
        }
        return artists.get(index);
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }

    //переработать метод getArtist, так чтобы он возвращал объект Optional <Artist>. Этот объект должен содержать элемент, если индекс допустимый, и быть пустым в противном случае
    public Optional<Artist> getArtist(int index) {

        if (index < 0 || index >= artists.size()) {
            return  Optional.empty();
        }
        return Optional.ofNullable(artists.get(index));
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        String str = artist.map(a -> a.getName())
                .orElse("unknown");
        return str;

    }

    //придется также переработать метод getArtistName, сохранив при этом прежнее поведение.
    public String getArtistNameOld(int index) {
        try {
            Artist artist = getArtistOld(index);
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }

}
//class  TestArtist{
//    public static void main(String[] args) {
//
//    }
//}
//3. Рассмотрим предметный класс Artists в примере 4.26, который
//представляет группу исполнителей. Ваша задача - переработать
//        метод getArtist, так чтобы он возвращал объект
//Optional <Artist>. Этот объект должен содержать элемент, если
//        индекс допустимый, и быть пустым в противном случае. Не забудьте,
//что придется также переработать метод getArtistName,
//сохранив при этом прежнее поведение.
