package core_java.modifire_final_static;

public class TaskTest_static {

    final  static  int f=45;
    public static void main(String[] args) {
        final  int f=45; // являетсяфайнал статик - константа. т.к. в статич. методе
        int a = 7;

        int b = 8;
        System.out.println(summ(a,b));
        delenie(a,b);

    }
    public static int summ (int a,int b){
        return a+b;
    }

    public static void delenie (int a,int b){
        int rezult = a/b;
        int ostatok = a%b;
        System.out.println(rezult);
        System.out.println(ostatok);
    }
}
