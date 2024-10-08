package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo {
    public static void main(String[] args) {
        args = new String[2];
//        args[0]= ".let";
        args[0]= "apple";
        args[1]= "popapplet";

        if (args.length != 2)
        {
            System.err.println("usage: java RegexDemo regex input");
            return;
        }
        // Преобразуем символьные последовательности начала новой строки (\n) в символы начала строки.
        args[1] = args[1].replaceAll("\\\\n", "\n");
        try
        {
            System.out.println("regex = " + args[0]);
            System.out.println("input = " + args[1]);
            //компилируем паттерн с которым будем сравнивать
            Pattern p = Pattern.compile(args[0]);
            //паттерн сравниваем со строкой, которую добавим на вход
            Matcher m = p.matcher(args[1]);
            System.out.println(m.toString());
            while (m.find())
                System.out.println("Found [" + m.group() + "] starting at "
                        + m.start() + " and ending at " + (m.end() - 1));

        }
        catch (PatternSyntaxException pse)
        {
            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("Описание: " + pse.getDescription());
            System.err.println("Позиция: " + pse.getIndex());
            System.err.println("Неправильный шаблон: " + pse.getPattern());
        }
    }
}
