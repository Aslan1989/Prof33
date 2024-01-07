package lesson13Comparing.homework;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class Homework13 {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(List.of(1,2,5,6,8,10,4));
        System.out.println(
                getLongestEvenSequence(ints)
        );
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
