package core_java;

public class StringTip {
    public static void main(String[] args) {
        System.out.println("hel" + "lo" == "hello"); //true

        //при такой создании, каждый раз создается новый объект и надо сравнивать через equals, а через == будут не равны
        String first = new String("Привет!");
        String second= new String("Привет!");
        System.out.println(first == second); //false
        System.out.println(first.equals(second)); //true


        //при такой записи строка хранится в StringPool , и если еще одну строку создаем, то идет в стрингпул проверяет, есть ли такой стринг, если уже существует , то не пересоздается, а ссылается на уже существующий. Поэтому эти строки б. равны
        String first1 = "hel" + "lo";
        String second1= "hello";
        System.out.println(first1 == second1); //true
        System.out.println(first1.equals(second1)); //true
        System.out.println(first1.equals("hello")); //true

    }
}
