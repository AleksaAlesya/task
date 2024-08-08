package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {
    public static void main(String[] args) throws InterruptedException {
        // если использовать арейлист, то при одновременной работае в неспольких потоках, где в одном идет изменение коллекции в другом итерирование и чтение будет выбрасываться ConcurrentModificationException
        // это есть fail- fast
//        ArrayList<String> arrayList1 = new ArrayList<>();

        // необходимо использовать коллекцию CopyOnWriteArrayList
        // при работе с итератором создается копия коллекции и происходит итерирование по копии
        CopyOnWriteArrayList <String> arrayList1 = new CopyOnWriteArrayList<>();

        arrayList1.add("P");
        arrayList1.add("P");
        arrayList1.add("O");
        arrayList1.add("O");
        System.out.println(arrayList1);

        Runnable runnable = () -> {
            Iterator<String> iterator = arrayList1.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }

        };

        Runnable runnable1 = ()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList1.remove(2);
            arrayList1.add("Elena");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
           thread.join();
           thread1.join();

        System.out.println(arrayList1);
    }
}
