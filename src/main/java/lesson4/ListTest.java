package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(0,20);
        myList.add(1,30);
        myList.add(2,40);
        myList.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(myList);
        System.out.println(myList.stream().findFirst());
    }
}
