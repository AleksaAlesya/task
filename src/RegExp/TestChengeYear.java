package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestChengeYear {
    public static void main(String[] args) {
        String s = "  В 200 1 годы мы должны были жить/ Но 125 не  в 1998. Когда было 12548 человек ";
        String ss ="1254";
        //заменит в строке все подряд идущие 4 числа на 5555
       String s1 = s.replaceAll("\\d{4}","5555");
        System.out.println(s1);


        Pattern pt = Pattern.compile("\\d{4}"); //\d\d\d\d
        Matcher mt = pt.matcher(s);
        System.out.println(mt.matches()+ "  Проверяет, соответствуеет ли вся строка  паттерну РВ"); // false
        System.out.println(mt.find() + " проверяет , есть ли в строке часть соотв паттерну РВ"); //true

        System.out.println( mt.group() + " возвращает первое соответствие");
        while (mt.find()){
            System.out.println( mt.group() );
        }


        Matcher mt1 = pt.matcher(ss);
        System.out.println(mt1.matches()); // true

        String mail = "alex@mail.ru";
        Pattern pattern =Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher matcher =pattern.matcher(mail);
        System.out.println(matcher.matches());

    }


}
