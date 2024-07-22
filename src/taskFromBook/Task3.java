package taskFromBook;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task3 {
    public static void main(String[] args) {



       Stream<Integer>numbers = Stream.of(1,10,20,30);
        System.out.println(add(numbers));

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

        System.out.println("1.а. - Функцию, которая получает альбомы и возвращает списол альбомов, содержащих не более трех произведений.");
        System.out.println(threeAlbumsList(albums));

        List<Artist> artists = asList(kino, new Artist("Алла Пугачев", "Китай"));

        System.out.println("Функцию, которая получает исполнителя и возвращает список строк, содержащих имена и место происхождения");
        System.out.println(nameAndFromCountry(artists));



//            int totalMembers = 0;
//            for (Artist artist : artists) {
//                Stream<Artist> members = artist.getMembers();
//                totalMembers += members.count();
//            }
        System.out.println("2.Итерирование. Перепишите этот код с использованием внутреннего итерирования вместо внешнего.");
        System.out.println(membersOfKino.stream().map(artist -> artist.getMembers()).count());

        System.out.println(" 6. Подсчитайте количество строчных букв в строке (подсказка: воспользуйтесь методом chars класса String).");
        String string ="Привет как дела у Тебя?";
        System.out.println(string);
        System.out.println(countLowerCase(string));
        System.out.println(countLowerCase(""));



        System.out.println("Найдите в листе строку, содержащую максимальное число строчных букв.");
        List<String>stringList = asList("ПРивeeeeeeeeet", "какKKKKKKKKKKKKKKK", "делА", "ФФФФФФФ", "aaaPPPPP" );
        List<String>stringListNull = new ArrayList<>();
        System.out.println(stringList);
        System.out.println(stringListNull);
        System.out.println(maxNumberLowerCaseLetters(stringList));
        System.out.println(maxNumberLowerCaseLetters(stringListNull));

        System.out.println("Задание 4.3 - объект должен содержать элемент, если индекс допустимый, и быть пустым в противном случае");
        Artists artists1 = new Artists(membersOfKino);
        System.out.println(artists1.getArtist(0));
        System.out.println(artists1.getArtist(5));
//        System.out.println(artists1.getArtistOld(0));
//        System.out.println(artists1.getArtistOld(5));


        System.out.println("Задание 4.3 - переработать метод getArtistNam сохранив при этом прежнее поведение");
        System.out.println(artists1.getArtistName(0));
        System.out.println(artists1.getArtistName(5));
//        System.out.println(artists1.getArtistNameOld(0));
//        System.out.println(artists1.getArtistNameOld(5));
    }


//     1. Распространенные операции Stream. Реализуйте:
//       1- а. Функцию сложения чисел, то есть int addUp ( Stream<Integer>numbers).
   public static  int add(Stream<Integer> numbers){
//        int summ = numbers.reduce(0,(a,b)->a+b);
        return numbers.mapToInt(n->n)
                .sum();
    }

//         Ь. Функцию, которая получает исполнителя и возвращает список строк, содержащих имена и место происхождения.
   public static List<String> nameAndFromCountry(List <Artist> artists){
    return artists.stream().
            flatMap(artist -> Stream.of(artist.getName(), artist.getOrigin()))
            .toList();
}

//        с. Функцию, которая получает альбомы и возвращает список
//        альбомов, содержащих не более трех произведений.
    public static List<Album> threeAlbumsList (List<Album> albumList){
        List<Album> albums = albumList.stream()
//                .filter(album -> album.getTracks()!=null && album.getTracks().size()<3).toList();
                  .filter(album -> Optional.ofNullable(album.getTracks())
                          .map(list -> list.size() < 3)
                          .orElse(false))
                .toList();
        return  albums;
    }

// //   6. Подсчитайте количество строчных букв в строке (подсказка: воспользуйтесь методом chars класса String).
    public static long countLowerCase(String string){
//        String[] s = string.split(" ");
//        Stream<String> stream = Arrays.stream(s);
//        List<String>list = asList(s);
//        System.out.println(list);

        // isUpper
        // char interval
        // regexp
        // перечислит все

        //Character - класс обертка над char
        return string.chars()
                .filter(l->Optional.ofNullable(Character.isLowerCase(l))
                        .orElse(false))
                .count();
//                .filter(l->Character.isLowerCase(l)).count();

//        stream.map(l -> l.chars()).count(); // посчитает количество слов
//        stream.map(l -> l.length()).reduce(0, (c1, c2) -> c1 + c2); // количетсво всех символов
    }

//    7. Пусть дан список строк List<String>. Найдите в нем строку, содержащую максимальное число строчных букв. Чтобы код правильно работал, когда входной список пуст, можете возвращать объект типа Optional <String>.

    public static Optional<String> maxNumberLowerCaseLetters(List<String> stringList){
        return stringList.stream()
                .max(Comparator.comparing(Task3::countLowerCase));
//        return  stringList.stream().max(Comparator.comparing(c->Character.isLowerCase(c)));
    }

}

//3. Вычисление. Взгляните на сигнатуры следующих методов интерфейса
//Stream. Являются они энергичными или отложенными?
//а. boolean anyMatch (Predicate<? super Т> predicate); - энергичная, т.к. возвращает булеан ( если хотя бы один элем соотв. условию)
//Ь. Stream<T> limit (long maxSize); - отложенная, возвращает стрим

//4. Функции высшего порядка. Являются ли следующие методы
//Stream функциями высшего порядка? Почему?
//а. boolean anyMatch (Predicate<? super Т> predicate); -высшего порядки, т.к. принимает функцию
//Ь. Stream<T> limit (long maxSize); -нет, т.к. не принимает и не возвращаее  функцию

//5. Чистые функции. Является ли следующее лямбда-выражение
//свободным от побочных эффектов, или оно изменяет состояние?
//х -> х + 1
//Рассмотрим пример кода:
//Atomicinteger count = new Atomicinteger(O);
//List<String> origins = album.musicians()
//.forEach(musician -> count.incAndGet();)
//а. Лямбда-выражение, переданное в forEach в данном примере.

//Ответ -
// //х -> х + 1 - является чистым
// Atomicinteger count = new Atomicinteger(O);
//List<String> origins = album.musicians()
//.forEach(musician -> count.incAndGet();) -не является, поскольку  эффективно финальная переменная и метод, который изменяет состояние

