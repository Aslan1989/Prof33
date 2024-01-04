package lesson11Queue.customDeque;

public class Main {
    public static void main(String[] args) {
        CustomArrayDeque deque = new CustomArrayDeque();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.size());
        System.out.println(deque);
        deque.addLast(10);
        deque.addFirst(20);
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.getLast());
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque.size());
    }
}
