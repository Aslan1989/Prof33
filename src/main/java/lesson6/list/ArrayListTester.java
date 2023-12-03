package lesson6.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTester {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        System.out.println(list.size());
        list.add(8);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.add(12);
        System.out.println(list);
        list.add(1,23);
        System.out.println(list);

        CustomArrayList newList = new CustomArrayList();
        newList.add(11);
        newList.add(100);
        newList.add(-4);
        newList.add(12);
        System.out.println(newList);
        Iterator<Integer> smallToBig = newList.smallToBigIterator();
        while (smallToBig.hasNext())
            System.out.println(smallToBig.next());


    }
}
