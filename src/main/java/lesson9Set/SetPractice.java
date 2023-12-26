package lesson9Set;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        // Java Set implementation. Exercises
        // Set - это коллекция, которая хранит не повторяюзийся набор данных
        // применения - поиск дубликатов, и уникальных элементов
        // Set - интерфейс
        // HashSet - реализация остованная на хеш таблицы - самая быстрая
        // , linkedHashSet - гарантирует обход элементов в порядке вставки
        // , TreeSet - возвращает все элементы при обходе в осторторованном виде
        Set<String> group = new HashSet<>();
        group.add("Abba");
        group.add("Beatles");
        group.add("Rolling Stones");
        group.add("Deep Purple");
        group.add("Led Zeppelin");
        System.out.println(group);

        System.out.println();

        Iterator<String> groupsIterator = group.iterator();
        while (groupsIterator.hasNext())
            System.out.println(groupsIterator.next());

        System.out.println();

        for (String g : group
        ) {
            System.out.println(g);
        }

        System.out.println();

        List<String> britishGroups = Arrays.asList("Oasis", "Blur", "Suede", "Rolling Stones", "Beatles");

        group.addAll(britishGroups); // добавление всех элементов
        group.containsAll(britishGroups);
        group.removeAll(britishGroups);
        group.retainAll(britishGroups); // оставить в сете group только элементы из коллекции


        String inputString = "Hello World";
        System.out.println("Original string " + inputString);
        System.out.println(
                getUniqueCharacters(inputString)
        );


        System.out.println(
                getDublicate("напишем функцию принимающую строку и возвращающую все ее уникальные символы и функцию находящую дубликаты")
        );

        // int Object.hashcode()
        // boolean Object.equals(Object o)
        System.out.println("vasya".hashCode());
        // еужно в классе , который собираемся хранить  в хэш контейнере
    } // main

    // функция дубликатов
    // есть набор данных
    // нужно распечатать те элементов этого набора которые встречаются более одного раза
    // "напишем функцию принимающую строку и возвращающую все ее уникальные символы и функцтю находящую дубликаты"

    public static Collection<String> getDublicate(String s) {
        Set<String> doubles = new HashSet<>(); // Только дубликаты
        Set<String> data = new HashSet<>(); // слова
        String[] words = s.split(" ");
        for (String word : words
        ) {
            if (data.contains(word))
                doubles.add(word);
            data.add(word);
        }
        return doubles;
    }

    public static Collection<String> getUniqueCharacters(String s) {
        Set<String> result = new HashSet<>();

        List<String> characters = Arrays.asList(s.split(""));
        result.addAll(characters);
        return result;
    }
}
