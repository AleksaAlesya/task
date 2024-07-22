package core_java.comparation;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        //сделать проверку на нал

        return employee1.getName().compareTo(employee2.getName());
    }
}
