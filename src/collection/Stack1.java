package collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
//синхронизированная коллекция
        // принцип LiFo - первый пришел - первый ушел

        Stack <String> stack =new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        System.out.println(stack);
        System.out.println(stack.pop()); // удаляет последний эл. в коллекции
        System.out.println(stack.isEmpty()); // проверяет на пустоту, если пустой - tru
        System.out.println(stack.peek()); // возвращает, но не удаляет

    }

}
