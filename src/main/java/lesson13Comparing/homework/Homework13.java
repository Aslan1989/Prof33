package lesson13Comparing.homework;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework13 {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(List.of(1, 2, 5, 6, 5, 8, 7, 4));
        System.out.println(
                getLongestEvenSequence(ints)
        );

        List<Integer> filter = new ArrayList<>(List.of(1,2,1,2,3,4,5,3,3));
        filterList(filter);
        System.out.println(filter);
    } // main

    // Напишите функцию, принимающую на вход список целых и
    // удаляющую из списка все числа, встретившиеся нечетное количество раз

    public static void filterList(List<Integer> list) {
        // сколько раз встерчается каждое из чисел в списке list

        List<Integer> internal = new ArrayList<>(list);// копируем данные из List
        Collections.sort(internal);
        // пробижимся по листу
        int pref = internal.get(0);
        int counter = 1; // счетчик сколько раз встретилось предыдущее число
        for (int i = 1; i < internal.size(); i++) {
            int current = internal.get(i); // текущее число
            if (current == pref)
                counter++;
            else {
                if (counter % 2 == 1) {
                    list.removeAll(List.of(pref));
                }
                counter = 1;
            }
            pref = current;
        }
        if (counter % 2 == 1)
            list.removeAll(List.of(pref));
    }


    public static List<Integer> getLongestEvenSequence(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        List<Integer> r = new ArrayList<>(); // текущая последовательность целых
        for (Integer i : list
        ) {
            // проверить четное ли чосло
            if (i % 2 == 0) {
                // если да то добавить к "r"
                r.add(i);
            } else {
                if (r.size() > result.size()) {
                    result.clear(); // очищает коллекцию
                    result.addAll(r);
                }
                r.clear();
            }
        }
        if (r.size() > result.size())
            return r;
        else
            return result;
    }
}
