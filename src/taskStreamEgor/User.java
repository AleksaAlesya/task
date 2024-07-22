package taskStreamEgor;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate birthday;
    private City city;

    public User(String name, LocalDate birthday, City city) {
        this.name = name;
        this.birthday = birthday;
        this.city = city;
    }

//    public Integer getAge(){
//        Integer age = Period.between(birthday,LocalDate.now()).getYears();
//        return age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", city=" + city +
                '}';
    }
}
