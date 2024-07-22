package taskStreamEgor;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;

    private List<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(String name) {
        this.name = name;
        this.cities = new ArrayList<>();

    }

    public void addCityOnCountry(City city){

        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
