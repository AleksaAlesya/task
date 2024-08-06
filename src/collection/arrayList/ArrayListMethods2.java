package collection.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("A");
        StringBuilder stb2 = new StringBuilder("B");
        StringBuilder stb3 = new StringBuilder("N");
        StringBuilder stb4 = new StringBuilder("M");

        StringBuilder[] arr = {stb1,stb2,stb3,stb4};
        // если будет меняться массив, то и в листе будут изменения
        List<StringBuilder> list = Arrays.asList(arr);

       //  в этом случае, при изм. маассива лист не изменится
        // и вообще лист мы не сможем поменять
        List<StringBuilder> list2 = List.of(arr);
//        list2.add(stb1); //UnsupportedOperationException

        System.out.println(list);
        System.out.println(list2);
        arr[0]=new StringBuilder("AAA");

        System.out.println(list);
        System.out.println(list2);

        List<StringBuilder> list3 = List.copyOf(list);
        System.out.println(list3);
//        list3.add(stb1);// y// будет ошибка, лист иммутабельный
//        list.add(stb1); // лист уже поменять нельзя т.к. создана его копия
        arr[0]=new StringBuilder("ИИИ"); // при изменении массива уже ничего не изменится
        System.out.println(list3);

    }
}
