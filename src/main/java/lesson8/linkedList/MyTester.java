package lesson8.linkedList;

public class MyTester {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(12);
        list.add(-1);
        System.out.println(list);
        System.out.println(list.contains(13));
        list.addFirst(-33);
        System.out.println(list);
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list);
    }
}
