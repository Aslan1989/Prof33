package lesson6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<Integer> f = new ArrayList<>(Arrays.asList(10,2,3));
        List<Integer> s = new ArrayList<>(Arrays.asList(10,2,3));
        System.out.println(compare(f,s));
        List<String> strings = new ArrayList<>(Arrays.asList("Alex, Aslan"));
        List<String> strings1 = new ArrayList<>(Arrays.asList("Fatima, Bon"));
        System.out.println(add(strings,strings1));
    }

    // напишите функцию которая принимает два списка и возвращает
    // список содержащий строки и обоих входнгых списков

    public static List<String> add(List<String> list1, List<String> list2)
    {
        List<String> ret = new ArrayList<>();
        ret.addAll(list1);
        ret.addAll(list2);
        return ret;
    }

    // Написать функцию, которая принимает на вход два списка с числами одинаковой длины.
    // если числа с идинаковыми индексами одинаковы, возвратить "Yes" , если разные то "No"
    public static List<String> compare(List<Integer> list1, List<Integer> list2)
    {
//        List<String> ret = new ArrayList<>();
//        if (list1.size() != list2.size()){
//            throw new IllegalArgumentException("Input lists must have the same length.");
//        }
//        for (int i = 0; i < list1.size(); i++) {
//            if (!list1.get(i).equals(list2.get(i))){
//               ret.add("No");
//            }
//              else    ret.add("Yes");
//        }
//        return ret;
////
        List<String> ret = new ArrayList<>();

//        for (int i = 0; i <list1.size() ; i++) {
//            if (list1.get(i) == list1.get(i))
//                ret.add("Yes");
//            else
//                ret.add("No");
//        }
        for (int i = 0; i <list1.size() ; i++) {
            ret.add(list1.get(i).equals(list2.get(i)) ? "Yes" : "No" );
        }
        return ret;
    }
}
