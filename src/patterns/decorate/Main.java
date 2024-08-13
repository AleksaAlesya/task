package patterns.decorate;

public class Main {
    public static void main(String[] args) {
        double cost;

        //без декоратора
//        // Гадание на Таро
//        Service taro = new Divination("Таро", 1000);
//        // И персональный гороскоп
//        Service personalHoroscope = new Horoscope("Персональный гороскоп", 9000);
//        cost = taro.getPrice() + personalHoroscope.getPrice();
//
//        System.out.println(cost);

        // Гадание на Таро
        Service taro = new Divination("Таро", 1000);
        Service chakra = new Chakra(taro);
        Service aura = new Aura(chakra);

        // И общая стоимость
        System.out.println(aura.getPrice());

    }


}
