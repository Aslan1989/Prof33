package lesson8.linkedList;

import lesson6.list.MyArray;

public class MyLinkedList implements MyArray {

    private Node head;
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");
        Node n = head;
        while (n != null)
        {
            result.append(n.getValue());
            n = n.getNext();
            if (n != null)
                result.append(", ");
        }
        result.append("]");
        return result.toString();
    }
    private static class Node
    {
        private int value;
        private Node next;
        public Node (int value)
        {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private int size = 0; // кол во элементов
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public void add(int value) {
        if (head == null){
            head = new Node(value);
            return;
        }
        // перемеситься на последний элемент
        // создать новый Node(value) со значением value
        // у последнего элемента сделать setNext(Node)
        Node n = head;
        while (n.getNext() !=null)
            n = n.getNext();
        n.setNext(new Node(value));
    }

    @Override
    public void add(int index, int value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int get(int index) {
        return 0;
    }
}
