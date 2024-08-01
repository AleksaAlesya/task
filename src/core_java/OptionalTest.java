package core_java;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        //of - когда не должно быть нулевых элементов
        System.out.println("of - когда не должно быть нулевых элементов");
        Optional<String> optional =Optional.of("a");
        System.out.println(optional);
        System.out.println(optional.isPresent());
        optional.ifPresent(n-> System.out.println(n)); // если не пустой, то вывести в консоль


        //создаем пустую бокс
        System.out.println("создаем пустой бокс");
        Optional emptyoptional = Optional.empty();
        System.out.println(emptyoptional.isPresent());
        System.out.println(emptyoptional);


        // ofNullble - когда предполагается, что могут быть нулевые элементы
        Optional <String> alsoEmpty = Optional.ofNullable(null);

        System.out.println(1);
        System.out.println(alsoEmpty.isPresent());
        System.out.println(2);
        alsoEmpty.ifPresent(n-> System.out.println(n));


        // перед вызовом get необходимо проводить проверку isPresent()
        // или использовать OrElse,  orElseGet

//        orElseGet
//        - при таком подходе, если не пустой, то метод орэлсегет даже не срабатывает
         // d  этом случае можем  создать и вернуть что угодно
        System.out.println("Проверяем на пустоту, если пустой, то присвоить джон");
        String nullName = "мышь";
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        System.out.println(name);

//         orElse
// в этом случае орелсе создается дополнительно объект, даже если не нал
        System.out.println("Проверяем на пустоту, если пустой, то присвоить джон");
        String nullName1 = null;
        String name1 = Optional.ofNullable(nullName1).orElse("jon");
        System.out.println(name1);



//        get()
        System.out.println("get возвращает, только если не пустой, или выдаст исключение");
        Optional<String> opt = Optional.of("baeldung");
        String name11 = opt.get();
        System.out.println(name11);
//        String nullName111 = null;
//        String name111 = Optional.ofNullable(nullName111).get();
//        System.out.println(name111);


        //orElseThrow()
        //        System.out.println("Проверяем на пустоту,если пусто, выбросить исключение");
//        String nullName33 = null;
//        String name33 = Optional.ofNullable(nullName33).orElseThrow(
//                ()->new IllegalArgumentException("пусто"));
//        System.out.println(name33);
        //упрощенная версия
//        String name34 = Optional.ofNullable(nullName33).orElseThrow();
//        System.out.println(name34);

    }
}
