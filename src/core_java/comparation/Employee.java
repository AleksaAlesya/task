package core_java.comparation;

public class
Employee implements  Comparable<Employee> {
    private String name;
    private String lastName;
    private  Integer age;
    private  Position position;
    private Double salary;

    public Employee(String name, String lastName, Integer age, Position position, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "{ " + name + ' ' +
                 lastName + ": " +
                age + ' '+
                 position + ' ' +
                 + salary +" } \n";
    }

    //Comparable обязательно надо его импл. ...реализует метод CompareTo - сортировка по 1 параметру
    //сортировка по возрасту
//    @Override
//    public int compareTo(Employee employee) {
//        if (age == employee.age){
//            return 0;
//        }
//        if (age < employee.age){
//            return -1;
//        }
//        return 1;
//    }


    //сортировка по имени. У стринга уже есть реализованный Компэрабле
    @Override
    public int compareTo(Employee empl) {
        return name.compareTo(empl.getName());
    }


}
