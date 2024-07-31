package core_java.generiсs;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//
//        // Так делать нельзя поскольку так можно добавлять любой объект , а потом будет ошибка КлассКастЭексепшн
//        List animalList = new ArrayList<>();
//        animalList.add(new Animal(1));
//        animalList.add(new Animal(2));
//        animalList.add(new Dog());
//        animalList.add(" animal");
//        System.out.println(animalList);
//        Animal animal= (Animal) animalList.get(3); //ClassCastException:

        List<?> list = new ArrayList<>(); // лист с экземпляром какогото типа
       // list.add(new Cat("Василий")); // компилятор не дает добавить  ничего

// если типизировать родителем, тогда можно и наследника в лист добавлять
        List<Animal>animalList1 = new ArrayList<>();
        animalList1.add(new Animal(1));
        animalList1.add(new Animal(2));
        animalList1.add(new Dog());

        System.out.println(animalList1);
        Animal animal=  animalList1.get(2);
        System.out.println(animal);
        test(animalList1);
        test1(animalList1);
        test2(animalList1);
        test4(animalList1);

/////////////////////////////////////////////////////////////////////////////////////////

        List<Dog>dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog());

        System.out.println(dogList);
//        test(dogList); // Так нельзя т.к. в параметрах Animal
        test1(dogList);
//        test2(dogList); // нельзя т.к. ниже по иерархии
//        test3(dogList);
        test4(dogList);

///////////////////////////////////////////////////////////////////////////////////////////


        List <Object> objectList = new ArrayList<>();
//        test1(objectList);
        test2(objectList);
//        test3(objectList);
        test4(objectList);

/////////////////////////////////////////////////////////////////////////////////////////////

        List<Cat>catList= new ArrayList<>();
        catList.add(new Cat("Катя"));
        catList.add(new Cat("Васька"));
        catList.add(new Cat("Буська"));

        test1(catList);
//        test2(catList);
        test3(catList);
        test4(catList);
    }

    // только Animal
    public  static  void test (List <Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }

    }
    // листы с экземпл , любой кто наследуется от Animal
    public  static  void test1 (List <? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }

// листы с  Aniamal  и те классы, которые выше Animal по иерархии, т.е. родители, прородители
    public  static  void test2 (List <? super Animal> list){
        for (Object object : list) {
            System.out.println("Могут исп. только классы, которые выше Animal по иерархии, т.е. родители, прородители и сам класс");
        }
    }

    //только листы с классами, кот. наследуются от Comparable
    public  static  void test3 (List <? extends Comparable<?>> list){
        System.out.println(list.stream().sorted().toList() + "123");
        System.out.println("Могут исп. только классы, наследуются от КОмпэрбл, и могут сравниваться");

    }


    //лист с экземпляром какого-то типа
    public  static  void test4 (List <? > list){
        System.out.println("лист с экземпляром какого-то типа");

    }

}
