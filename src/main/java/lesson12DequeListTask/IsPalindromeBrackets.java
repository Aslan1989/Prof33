package lesson12DequeListTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsPalindromeBrackets {
    public static void main(String[] args) {

        System.out.println(checkBrackets("{{[{}]}}"));
    }
    public static boolean checkBrackets(String w)
    {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c: w.toCharArray()
             ) {
            if (c == '(' || c == '[' || c == '{')
                deque.push(c);
             else if (     (c == '}' && deque.peek() == '{') ||
                            (c == ']' && deque.peek() == '[') ||
                    (c == ')' && deque.peek() == '(')
            ) {
                 deque.poll();
            }
        }
        return deque.size() ==0;

    }
}
