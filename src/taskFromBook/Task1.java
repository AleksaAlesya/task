package taskFromBook;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Task1 {


//    public  interface Predicate<T>
//    boolean test(T t);
   BinaryOperator <Long> add = (a,c)->(a+c);

    public static void main(String[] args) {
       a= 5;
       c= 8;
       String str ="ошибка";
       BinaryOperator <Integer> add = (a,c)->(a+c);
//       Function<Long, Long> function1 = (a,c) ->  a+1;
       Function<Long, Long> function2 = a -> a-1;


   }

    public static Integer a;
    public static Integer c;
}

//Основные моменты
//О Лямбда-выражение - это безымянный метод, который служит
//для передачи поведения из одного места программы в другое
//так, будто это данные.
//О Лямбда-выражения выглядят следующим образом: BinaryOperator<
//Integer> add = (х, у) .... х + у.
//О Функциональным интерфейсом называется интерфейс с единственным
//абстрактным методом; он используется в качестве
//типа лямбда-выражения


// диаграммы
// Predicate - возвращает boolean
// T-> Predicate -> boolean
// 2.15
/* puЫic interface Function<T, R> {
R apply(T t);*/
// Function - возвращает R
// T - Function - R

//Ь. Для каких лямбда-выражений можно было бы использовать
//этот функциональный интерфейс в программе калькулятора?
// для операций округления

/*
с. Какие из следующих лямбда-выражений являются корректными
реализациями интерфейса Function<Long, Long>?
х -> х + 1; !!!!! этот
 (х, у) -> х + 1;
х -> х == 1;*/
