package core_java.exception;

public class TestException {
    public static void main(String[] args) {
        testException(0);
        testException(5);
    }

    private static void testException(int i) {
//        System.out.println(5/i);
//         RuntimeException e = new RuntimeException("Что то пошло не так. ОЙ");
//         throw e;

//        if (i==0){
//            throw  new IllegalArgumentException("аргумент не подходит");
//
//        }
//        System.out.println(5/i);
        try {
            System.out.println(5/i);
            try {
                Thread.sleep(-100);
                System.out.println("!!!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("1111");
            }
            System.out.println("??");

        } catch (RuntimeException e) {
         e.printStackTrace(); // в этом случае выскочит ошибкка, но приложение не ляжет
        }



    }

}
