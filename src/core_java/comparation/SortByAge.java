package core_java.comparation;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {


    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getAge()<employee2.getAge()){
            return -1;
        }
        if (employee1.getAge()== employee2.getAge()){
            return 0;
        }
        return 1;
    }
}
