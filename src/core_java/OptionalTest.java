package core_java;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        //of - когда не должно быть нулевых элементов
        Optional<String> optional =Optional.of("a");
        System.out.println(optional);
        System.out.println(optional.isPresent());


        //создаем пустую бокс
        Optional emptyoptional = Optional.empty();
        System.out.println(emptyoptional.isPresent());
        System.out.println(emptyoptional);


        // ofNullble - когда предполагается, что могут быть нулевые элементы
        Optional alsoEmpty = Optional.ofNullable(null);
        System.out.println(alsoEmpty.isPresent());


        // перед вызовом get необходимо проводить проверку isPresent()
        // или использовать OrElse,  orElseGet

    }
}
