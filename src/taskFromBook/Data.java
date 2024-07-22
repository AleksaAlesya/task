package taskFromBook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Data {

    public static  Artist victorTcoy = new Artist("Виктор Цой", "Россия");

    public static  Artist alekseyRibin = new Artist("Алексей Рыбин", "Россия");
    public static final Artist igorTihomirov = new Artist("Игорь Тихомиров", "Беларусь");


    public static List<Artist> membersOfKino = asList(victorTcoy,alekseyRibin,igorTihomirov);

    public static  Artist kino = new Artist("Kino", "Россия",membersOfKino );

    public static Album gruppaKrovi = new Album("Группа крови", asList(new Track("Восьмикласница", 500), new Track("Група крови на рукаве", 425)), asList(victorTcoy));

    public static Album album1 = new Album("Альбом 1", asList(new Track("трек1", 40)), asList(victorTcoy));

    public static  Album album2= new Album("Альбом2", asList(new Track("трек 23", 33), new Track("трек 4", 23), new Track("трек 4", 30), new Track("трек 4", 54), new Track("трек 5", 47)), asList(victorTcoy));

    public static Stream<Album> albums = Stream.of(gruppaKrovi, album1,album2);




}
