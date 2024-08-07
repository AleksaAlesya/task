package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Alexa",5);
        Student student2 = new Student("Alex",5);
        Student student3 = new Student("Piter",1);
        Student student4 = new Student("Evgeny",3);
        map.put(student1,9.9);
        map.put(student2,8.7);
        map.put(student3,5.3);
        map.put(student4,9.1);

        Student student5 = new Student("Alexa",5);
        boolean result = map.containsKey(student5); // если бы в классе Студент не был переопределен иквалс  и хэшкод одновременно, то был бы false, т.к. сравнивает по умолчанию ссылки, а не значения
        System.out.println(result);

        System.out.println(student1.hashCode());
    }

}
final class  Student  {
    // т.к. класс используем  в качестве ключа в хэшмапе, то необходимо стделать неизменяемым классом
    final String name;
   final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }



}
/* Equals и hashCode необходимо переопределять одновременно, что бы правильно работала мапа
* Если equals  не переопределяем в классе, то объекты б. сравниваться по ссылкам, а не по значен
* При переопределении придерживаться правил, если а=б, то б=а, если б=с, то и а=с
* Контракт м/у Equals и hashCode:
* - если объект равен по Equals, то его hashCode тоже равны
* - если объем не равен по Equals , то его hashCode могут быть равны
*
* При сравнении объект сразу сравнивается по hashCode, т.к. это менее затратная операция, при равенстве переходит к сравнению по Equals
*
* Коллизия  - это когда разные объекты имеют одинаковый hashCode
* возникает потому что hashCode - это int значение, а оно вмещает в себя ограниченное число от -2*10^9 до -2*10^9 , а объектов может больше( неограниченное многжество), поэтому м. повторяться хэшкоды
*
* */