package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList <String> arrayList1 = new ArrayList<>();

        arrayList1.add("P");
        arrayList1.add("P");
        arrayList1.add("O");
        arrayList1.add("O");
        arrayList1.add("O");
        arrayList1.add("E");
        arrayList1.add("E");
        arrayList1.add("E");
        arrayList1.add("R");
        System.out.println(arrayList1);

        //в этом слуучае лист является представлением части арейлиста, и при его изменении листа будет меняться сам арейлист
        // и мы уже не можем напрямую изменять арейлист...
        // если изменим, то лист при выводе будет выдавать ошибку
       List <String> list = arrayList1.subList(2,6); // показать часть арейлиста с 2 до 6 элемента (2,3,4,5)
        System.out.println("!_____" + list);
        list.add("Тaк можно"); // изменит и лист и арейлист
        System.out.println(list);
        System.out.println(arrayList1);
//        arrayList1.add("QQQQQ");
//        System.out.println(arrayList1);
//        System.out.println(list); // вылетит канкарентексепшен





        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("E");
        arrayList2.add("R");

        //вернет boolean
        arrayList1.removeAll(arrayList2);// все элементы из листа2 будут сравниваться с содержанием и если будут равны, то все удалятся

        System.out.println(arrayList1);

        ArrayList <String> arrayList3 = new ArrayList<>();
        arrayList3.add("P");
        arrayList3.add("R");
        // оставить элекменты, которые есть в листе 3, т.е. все остальное удалится
        arrayList1.retainAll(arrayList3);
        System.out.println(arrayList1);

        // содержит ли  в себе все элементы
        System.out.println(arrayList1.containsAll(arrayList3));



    }
}
