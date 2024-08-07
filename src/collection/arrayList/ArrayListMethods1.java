package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1
{
   /* ArrayList - коллекция на основе динамического массива
     обычно создается, когда не известен размер массива
     size
     capacity =10   по умолчанию
      когда заканч, увелич. в 1,5 раза
     */
    public static void main(String[] args) {
        //Коснтрукторы
        ArrayList arrayList = new ArrayList(); // лист с разными объектами ! плохая практика
        ArrayList <String> arrayList1 = new ArrayList<>();
        ArrayList <String> arrayList2 = new ArrayList<>(200);  //если известен изначальный размер
        ArrayList <String> arrayList3 = new ArrayList<>(arrayList1); // с другой коллекцией

        arrayList3.add("P");
        arrayList2.add("OO");


        arrayList1.add("Ivan"); // -> boolean
        System.out.println(arrayList1.add("Piter"));
        arrayList1.add(1,"Egor"); //Добавит на 1 индекс, все сместятся
        System.out.println( arrayList1.get(1)); //->DataType
        System.out.println(arrayList1.set(1,"Misha")); //-> заменяемый элемент и заменяет этот элемент
        System.out.println(arrayList1.remove(1)); // -> удаляемый элемент по индексу
        System.out.println(arrayList1.remove("Ivan")); //-> boolean
        arrayList1.addAll(arrayList3); //->boolean
        arrayList1.addAll(2,arrayList2);
        System.out.println(arrayList1.indexOf("P")); //-> индекс элемента, если нет -1
        System.out.println(arrayList1);
        //contains() - содержит ли элемент -> boolean
        //isEmpty() - проверка на пустоту
        // clear()

        arrayList3.addAll(Arrays.asList("W","Y"));
    }

}
