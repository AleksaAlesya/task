package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alexa",5);
        Student student2 = new Student("Alex",5);
        Student student3 = new Student("Piter",1);
        Student student4 = new Student("Evgeny",3);

        TreeMap<Double,Student> treeMap = new TreeMap<>();
        treeMap.put(5.2,student1);
        treeMap.put(5.5,student3);
        treeMap.put(9.1,student2);
        treeMap.put(6.3,student4);
        System.out.println(treeMap);

// ключ обязательно должен имплем. Компэрабле или так
        TreeMap<Student,Double> treeMap1 = new TreeMap<>(Comparator.comparing(Student::getName));
//        TreeMap<Student,Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
        treeMap1.put(student1,3.5);
        treeMap1.put(student2,5.5);
        treeMap1.put(student3,6.7);
        treeMap1.put(student4,8.6);

        System.out.println(treeMap1);
    }

}

/*TreeMap - отсортированный по возраст. список, в основе  сбалансированное карсно-черное дерево
имеет iterator
не обязательно переопределять equals  и  hashCode - он и так будет искать по значению , а не по ссылкe
* */
