package core_java.nested_classes.inner_class.inner;

public class Bicycle  {

    private String model;
    private int weight;

    private int seatPostDiameter;
    public static int count;

    public Bicycle(String model, int weight, int seatPostDiameter, String colorHandlebars) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
        Handlebars handlebars = new Handlebars(colorHandlebars);
        count++;
        System.out.println("Создали велосипед № " + count);
    }


    public static void start() {
        System.out.println("Поехали!");
    }

    Seat seat = new Seat();// создать объект можем, но к полям и методам не имеем доступа из внешнего класса



    //вложенный внутренний нестатический класс, создается когда он не имееет смысла без внешнего, Например сиденье не м. существовать без велосипеда - в этом случае делаем внутр. Но если это магазин и продаются детали, то надо делать обычным классом
    //создается внутри другого класса
    //не можетт существовать ьез внешнего
    // имеет доступ ко всем полям  внешнего класса
    // не может содержать статические поля  из внеш  кл.

    public class Seat {
       private static int ь=0;
        private void up() {
            System.out.println("Сиденье поднято выше!");


        }
        public void down() {
            System.out.println("Сиденье опущено ниже!");
            start();

        }

        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }

    //если кл. приватный , то мы из др. не сможем создать, можем через конструктор внешнего класса. Так делать правильнее. Т.к. понятно, что созд. во время созд экз, а не просто
    private class  Handlebars{
        String color ;

        public Handlebars(String color) {
            this.color = color;
            System.out.println("прикрепили руль " + color + " цвета");
        }

        public void  turnToRright(){
            System.out.println("повернули на право");

        }

    }
}

