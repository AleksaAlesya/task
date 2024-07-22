package fis_streamApi;

public class TempApp {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };
        r.run();


        Runnable r1 = ()-> System.out.println(2);
        r1.run();

        Thread thread = new Thread(()-> System.out.println(3));
        thread.start();

        new Thread(()-> System.out.println(4)).start();
    }


}
