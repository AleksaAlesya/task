package core_java.immutable_class;

import java.util.ArrayList;
import java.util.List;


/* что бы сделатб класс неизменяемым надо:
1. Сделать все поля  приватными final
2. Убрать все сеттеры
3.Если в классе есть изменяемые объекты (коллекции например), то создать в конструкторе их копии и вернуть через геттеры
4. При создании объекта надо инициализировать все поля. Можно через конструктор или  если все поля имеют знач. по умолчанию, то блок инициализации
5. сделать сам класс final, что бы нельзя было наследовать
*/
public final class ImmutableClass {
    private final int id;
    private final String name;
    private final List<Integer> numbers;

    public ImmutableClass(int id, String name, List<Integer> numbers) {
        this.id = id;
        this.name = name;
        this.numbers = new ArrayList<>(numbers);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // здесь мы возвращаем не наш лист, а создаем новый, поместив туда нашл лист, типа копии. А наш лист останется неизменным
    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
