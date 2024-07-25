package core_java.initialisation.testInit;

public class House {
    Window w1 = new Window(1); // Перед конструктором

    House() {
        // Показывает, что выполняется конструктор:
        System.out.println("HouseQ");
        w3 = new Window((33));
    }
    Window w2 = new Window(2); // После конструктора
     void f() {
         System.out.println(("f()"));
     }
    Window w3 = new Window(3);// В конце
}
