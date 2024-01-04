package lesson12DequeListTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("наворован"));
    }
    public static boolean isPalindrome(String s)
    {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c: s.toCharArray()
             ) {
            deque.addLast(c);
        }
        while (deque.size() >1){
            if (!deque.removeFirst().equals(deque.removeLast())){
                return false;
            }
        }
        return true;
    }
}
