package core_java.nested_classes.inner_class.inner;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle("Mod",45,20, "red");
        Bicycle.Seat seat = bicycle.new Seat();
        bicycle.start();
        seat.getSeatParam();
//        seat.up(); приватный метод мы не видим вне внешнего класса
        seat.down();








    }
}
