package core_java.comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        Employee employee = new Employee("Petrov", "Sergey", 45, Position.DIRECTOR, 5000.0);

        Employee employee1 = new Employee("Sidorov", "Evgen", 40, Position.HR, 2500.0);
        Employee employee2 = new Employee("Getrov", "Alex", 24, Position.MANAGER, 1000.0);
        Employee employee3 = new Employee("Petrov", "Nikolya", 24, Position.MANAGER, 1500.0);
        Employee employee4 = new Employee("Meller", "Peter", 24, Position.MANAGER, 2000.0);
        Employee employee5 = new Employee("Myhin", "Petya", 58, Position.HR, 3000.0);

        List<Employee> allEmployeeList = new ArrayList<>(Arrays.asList(employee, employee1, employee2, employee3, employee4, employee5, employee));

//        //сортировка Comparable  compareTo
        Collections.sort(allEmployeeList);
        System.out.println(allEmployeeList);

        // если не реализован интерфейс Comparable/, то можно так провести сортировку
        System.out.println("стримсортировка \n" + allEmployeeList.stream().sorted((e,e1)->e.getSalary().compareTo(e1.getSalary())).toList());

        //сортировка Comparator по возрасту
        Collections.sort(allEmployeeList, new SortByAge());
        System.out.println(allEmployeeList);


//        //сортировка Comparator по имени
//        Collections.sort(allEmployeeList, new SortByName());
//        System.out.println(allEmployeeList);

        //интерфейс Comparable
       // метод compareTo - применяется в случаях стандартной сортировки, и имплементируется классом в котором нужна сортировка по 1 параметру.

        // интерфейс     Comparator
        // метод compare
        //если нужна сортировка в обратном порядке, или по нескольким параметрам

    }
}
