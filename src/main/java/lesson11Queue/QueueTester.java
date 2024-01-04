package lesson11Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueTester {
    public static void main(String[] args) {
        // Custom ArrayDeque implementation

        // Queue - очередь
        // позволяет добавлять элементы в конец и забирать их  сначала
        // FIFO - first in first out

        // добавление
        // illegalStateException
        // boolean add
        // boolean offer возвращает true если элемент успешно вставлен

        // получение элемента из начала очереди
        // remove() - возвращает первый элемент и убирает его из очереди
        // pool() - возвращает первый элемент и убирает его из очереди

        // инспекция - не удаляет из оччреди элемент
        // element(0 - возвращает элемент - NoSuchElementException

        Queue<String> bankQueue = new LinkedList<>();

        bankQueue.offer("Маша Петрова");
        bankQueue.offer("Света Иванова");
        bankQueue.offer("Семен Дежнев");

        TreeSet<String> c = new TreeSet<>(bankQueue);
        System.out.println(
                c
        );

        String elem = "";

        while ((elem = bankQueue.poll()) != null)
        {
            System.out.println(elem);
        }

        // PriorityQueue - очереди с приоритетами
        Queue<String> priorityCustomers = new PriorityQueue<>();
        priorityCustomers.add("One");
        priorityCustomers.add("Two");
        priorityCustomers.add("Three");
        priorityCustomers.add("Four");
        priorityCustomers.add("Five");
        priorityCustomers.add("Six");
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());
        System.out.println(priorityCustomers.remove());


    }
}
