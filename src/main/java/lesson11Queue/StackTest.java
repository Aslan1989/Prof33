package lesson11Queue;


import java.util.*;

public class StackTest {

    // Stack - стопка подносов в столовой
    // стэк добавляет элементы в конец и снимает элементы с конца

    // LIFO -last in last out

    // push(T) - добавляет элемент в стэк - EmptyStackException
    // pop()  возвращает послед элемент - EmptyStackException
    // boolean empty()

    public static void main(String[] args) {

        Stack<String> names = new Stack();
        names.push("Dima");
        names.push("Max");
        names.push("Alina");

        while (!names.empty())
            System.out.println(names.pop());

        System.out.println(
                reverse(List.of("Max", "Dima", "Alex"))
        );

    }

    public static Collection<String> reverse(Collection<String> input) {


        Stack<String> stack = new Stack<>();

        List<String> result = new LinkedList<>();
        for (String w : input)
            stack.push(w);


        while (!stack.empty()) {
            result.add(stack.pop());
        }
        return result;
    }

}
