package lesson6;

import java.util.*;

public class ListTester {
    public static void main(String[] args) {
        // Data structures

        List<String> capitals = new ArrayList<>(); // List - интерфейс ArrayList - реализвация
        capitals.addAll(Arrays.asList("Vienna", "Prague", "London"));
        capitals.add(1,"Budapest");

        System.out.println(capitals);
        System.out.println("["+capitals.get(0)+"]");
        capitals.set(2,"Paris");
        System.out.println(capitals);

        System.out.println(capitals.contains("Berlin"));
        Collections.sort(capitals);
        System.out.println(capitals);
        System.out.println(capitals.size());
    }
}
