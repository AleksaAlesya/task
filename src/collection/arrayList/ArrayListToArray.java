package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
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

      Object []arr = arrayList1.toArray();
      Arrays.stream(arr).forEach(el-> System.out.print(el));
      System.out.println();

     // если 0 то сам подстроится размер, а если укажем больше - то заполнится налами, если меньше , то столько элементов и добавит
      String []arr2 = arrayList1.toArray(arrayList1.toArray(new String[0]));
      Arrays.stream(arr2).forEach(System.out::println);

    }
}
