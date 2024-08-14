package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapT {
    public static void main(String[] args) throws InterruptedException {
        //Выбросится ошибка, т.к. мапа будет изменена в процессе
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(124, "Olga");
//        hashMap.put(125, "Piter");
//        hashMap.put(128, "Olga");
//        hashMap.put(124, "Nelly");
//
//        Runnable runnable1 = () -> {
//            Iterator<Integer> iterator1 = hashMap.keySet().iterator();
//            while (iterator1.hasNext()) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//
//                }
//                Integer i = iterator1.next();
//                System.out.println(i + ":" + hashMap.get(i));
//            }
//        };
//
//        Runnable runnable11 = () -> {
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            hashMap.put(25, "oooo");
//
//        };
//        Thread thread1 = new Thread(runnable1);
//        Thread thread11 = new Thread(runnable11);
//        thread1.start();
//        thread11.start();
//        thread1.join();
//        thread11.join();


        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(124,"Olga");
        map.put(125,"Piter");
        map.put(128,"Olga");
        map.put(124,"Nelly");
//        map.put(124,null); // нельзя
        System.out.println(map);
// в этом случае итератор создает копию и не видит изменений в коллекции
        Runnable runnable=()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = ()->{

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               map.put(6,"Elena");

        };
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
       thread.start();
       thread2.start();
       thread.join();


       thread2.join();
        System.out.println(map);

//  в этом случае вывод 5 раз, говорит о том, что новый элемент добавлися в коллекцию и виден итератору
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();

        map1.put("First", 10);
        map1.put("Second", 20);
        map1.put("Third", 30);
        map1.put("Fourth", 40);

        Iterator<String> iterator = map1.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            map1.put("Fifth", 50);
        }
    }

}
/* ConcurrentHashMap -  используется в многопоточности
 * блокируется только бакет, с которым идет работа
 * многжество потоков может читать коллекцию одновременно
 * ни ключ, ни значение не м.б. Null - будет эксепшен
 * */