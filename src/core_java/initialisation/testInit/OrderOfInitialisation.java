package core_java.initialisation.testInit;

public class OrderOfInitialisation {

    public static void main(String[] args) {
        House h = new House();
        h.f(); // Показывает, что объект сконструирован
    }
        /* Output:
Window(l)
Window(2)
Window(3)
House()
Window(33)
Ю
*///:~
}
