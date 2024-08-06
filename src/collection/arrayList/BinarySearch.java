package collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(5);
        arrayList1.add(125);
        arrayList1.add(-985);
        arrayList1.add(54);
        arrayList1.add(-5);
        arrayList1.add(58);
        arrayList1.add(11);
        arrayList1.add(8);
        System.out.println(arrayList1);

        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        //что бы выполнить бинарный поиск нужна отсортированная коллекция
        int index1= Collections.binarySearch(arrayList1,8);
        System.out.println(index1);

        //сортировка по убыванию
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);

        Collections.shuffle(arrayList1);
        System.out.println(arrayList1);
    }
}
