package taskStreamEgor;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        City city = new City("Minsk");
        City city1 = new City("Gomel");
        City city2 = new City("Moscow");
        City city3 = new City("Petersburg");
        City city4 = new City("New York");
        City city5 = new City("Colorado");

        Country country = new Country("Belarus");
        country.addCityOnCountry(city);
        country.addCityOnCountry(city1);
        Country country1 = new Country("Russian");
        country1.addCityOnCountry(city2);
        country1.addCityOnCountry(city3);
        Country country2 = new Country("USA");
        country2.addCityOnCountry(city4);
        country2.addCityOnCountry(city5);

        Set<Country> countries = Set.of(country1, country2, country);
//        System.out.println(countries);


        User user = new User("Alex", LocalDate.of(1984, 02, 22), city4);
        User user1 = new User("Piter", LocalDate.of(1990, 01, 13), city5);
        User user2 = new User("Sergey", LocalDate.of(1990, 01, 13), city2);
        User user3 = new User("Vitaly", LocalDate.of(1975, 01, 28), city3);
        User user4 = new User("Egor", LocalDate.of(1968, 01, 13), city);
        User user5 = new User("Alex", LocalDate.of(1990, 01, 13), city5);

        List<User> usersList = Arrays.asList(user1, user2, user3, user4, user5, user);
        Set<User> users = Set.of(user1, user2, user3, user4, user5, user);

        System.out.println(sortUserByAge(usersList));
        System.out.println("======================");
        System.out.println(getUserCountriesNames(users,countries));

//        System.out.println(user1.getAge());

        //Воводим список сотрудников с именем Alex
        System.out.println( usersList.stream().filter(u->u.getName().equals("Alex")).collect(Collectors.toList()));


    }

    // Метод получает список пользователей, сортирует по количеству полных лет, для пользователей равного возраста - по имени, возвращает отсортированный список
    public static List<User> sortUserByAge(List<User> users) {
        //исп. метод опред. возраста, кот добавила в юзера
//        Comparator<User> comparing = Comparator.comparing(User::getAge)
//                .thenComparing(User::getName);
        Comparator<User> comparing1 = Comparator.comparing((User user) -> Period.between(user.getBirthday(), LocalDate.now()).getYears()).thenComparing(User::getName);
        return sortUser(users, comparing1);
    }

    private static List<User> sortUser(List<User> users, Comparator<User> comparing) {
        return users.stream()
                .sorted(comparing)
                .toList();
    }


    // метод получает множество пользователей, нужно вернуть строку, где через запятую перечислены названия стран пользователей
     public static String getUserCountriesNames(Set<User> users, Set<Country> countries) {
        String userCountriesNames = users.stream()
                .map(user -> user.getCity())
                .map(city -> getCountryByCity(city.getName(),countries))
                .distinct()
                .collect(Collectors.joining(", "));
//                .reduce((c1, c2) -> c1 + ", " + c2)
//                .orElse("");

        return userCountriesNames;
    }

    private static String getCountryByCity(String cityName, Set<Country> countries) {
        Map<String, String> countryMap = new HashMap<>();
        for (Country country : countries) {
            String countryName = country.getName();
            for (City city : country.getCities()) {
                countryMap.put(city.getName(), countryName);
            }
        }
        return countryMap.get(cityName);
    }


}
