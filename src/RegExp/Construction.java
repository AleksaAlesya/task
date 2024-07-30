package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Конструкция сравнения с регулярными выражениями
public class Construction {
    public static void main(String[] args) {
        String s = "1984";
        Pattern pattern = Pattern.compile("\\d+"); // лежит РВ для сравнения
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }

}
