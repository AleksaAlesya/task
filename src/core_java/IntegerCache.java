package core_java;

public class IntegerCache {

    public static void main(String[] args) {
        //Integer до 127 запоминают в cashe и поэтому ссылаются на одно и то же число и поэтому будут равны
        Integer a1 = 127;
        Integer a2 = 127;

        //после 127 уже как новый обхъект и создается новый объект и поэтому при сравнивании будут не равны
        Integer a3 = 128;
        Integer a4 = 128;

        Integer a5 = 200;
        Integer a6 = 200;

        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
        System.out.println(a5 == a6);
        System.out.println(a5.equals(a6));


    }
}
