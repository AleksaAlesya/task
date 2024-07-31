package core_java.immutable_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(List.of(1,2,1,4)) ;
        ImmutableClass immutableClass = new ImmutableClass(12,"Klass",list);
        System.out.println(immutableClass.getNumbers());
        immutableClass.getNumbers().add(487);// Даже если нам дает добавить... в экземпляре не поменяется класс
        list.add(157); // и так тоже ничего не изменится в классе. Хотя сам лист изменится
        System.out.println(list);
        System.out.println(immutableClass.getNumbers());

    }



}
