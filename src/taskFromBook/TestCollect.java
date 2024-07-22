package taskFromBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class TestCollect {
    public static void main(String[] args) {

       Stream<Integer>numbers = Stream.of(1,10,20,30);


        Artist victorTcoy = new Artist("Виктор Цой", "Россия");

         Artist alekseyRibin = new Artist("Алексей Рыбин", "Россия");
         Artist igorTihomirov = new Artist("Игорь Тихомиров", "Беларусь");


         List<Artist> membersOfKino = asList(
                 victorTcoy,
                 alekseyRibin,
                 igorTihomirov);

        Artist kino = new Artist("Kino", "Россия",membersOfKino );

       Album gruppaKrovi = new Album("Группа крови",
               asList(new Track("Восьмикласница", 500),
                       new Track("Група крови на рукаве", 425)),
               asList(kino));

         Album album1 = new Album("Альбом 1", asList(new Track("трек1", 40)), asList(victorTcoy));

         Album album2= new Album("Альбом2", asList(
                 new Track("трек 23", 33),
                 new Track("трек 4", 23),
                 new Track("трек 4", 30),
                 new Track("трек 4", 54),
                 new Track("трек 5", 47)),
                 asList(victorTcoy));

        Album album3= new Album("Альбом3", asList(
                new Track("трек 23", 33),
                new Track("трек 5", 47)),
                asList(victorTcoy));


        Album album4= new Album("Альбом4", asList(
                new Track("трек 23", 33),
                new Track("трек 4", 23),
                new Track("трек 4", 30),
                new Track("трек 4", 54),
                new Track("трек 5", 47)),
                asList(victorTcoy));
        Album album5= new Album("АльбомПустой");

        List<Album> albums = asList(gruppaKrovi, album1,album2,album3,album4,album5);



        List<Artist> artists = asList(kino, new Artist("Алла Пугачев", "Китай"));

//        System.out.println(biggestGroup(artists));





    }
//    public static Optional<Artist> biggestGroup(List<Artist> artists) {
//        Function<Artist,Long> getCount = artist -> artist.getMembers().stream().count();
//               return artists.stream().collect(maxBy(comparing(getCount));
//    }

}


