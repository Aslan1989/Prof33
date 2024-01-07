package lesson13Comparing;

import lesson13Comparing.comparable.Player;

import java.util.*;
import java.util.function.ToIntFunction;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> groups = new ArrayList<>(
                Arrays.asList("Guns and Roses", "Aerosmith", "Beatles", "Pearl Jam", "Cranberries")
        );
        System.out.println(groups);
        Collections.sort(groups); // базовый интерфейс для листа
        System.out.println(groups);
        Collections.sort(groups, Comparator.reverseOrder());
        // для любого класса может быть задан порядок сортрировки
        // и порядо сорторовки можно обратить
        System.out.println(groups);

        int [] marks = {1,4,3,5,2};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        // Comparable<T> - Этот интерфейс реализует класс <T> - это экземпляр класса
        // позволяет экземпляру класса сравниться с другим экземпляром нашего класса

        List<Player> team = new ArrayList<>(
                Arrays.asList(
                        new Player(14,"Sam", 24),
        new Player(16,"Alexander", 27),
        new Player(10,"John", 24),
        new Player(16,"Sam", 19),
        new Player(16,"Sam", 19),
        new Player(14,"Sam", 24)
                )
        );
        Collections.sort(team); // используем встроенную сортировку из реализации Comporator<Player>()
        System.out.println("Sort of Rating: " + team);
        Comparator<Player> comparatorName = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(team, comparatorName); // произойет сортировка по имени
        System.out.println("Sort of Name: " + team);

        Comparator<Player> comparatorAge = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(team, comparatorAge);
        System.out.println(
                "Sort of Ages: " +
                team
        );


        // Comparator<T> - Это интерфейс который может реализовываться за пределами класса
        // эклемпляри которого он может сравнивать
        // Представляет собой алгоритм сравнения двух экземпляров класса, который можно отдельно передатьв функцию сортирвки

//        team.sort(
//                (p1,p2) -> Integer.compare(p1.getAge(),  p2.getAge())
//        );
//        team.sort(
//                Comparator.comparingInt(value -> value.getAge())
//        );
        team.sort(
                Comparator.comparingInt(Player::getAge)
                        .reversed()
                        .thenComparing(Player::getName)
        );

        System.out.println(team);

        // отсортировать игроков по возрастанию рейтинга, убыванию возраста и возрастанию имени
        team.sort(
                Comparator.comparing(Player::getRating)
                        .thenComparing(Player::getAge)
                        .reversed()
                        .thenComparing(Player::getName)
        );

        System.out.println("Sort of Rating Name and reverse Age: " +
                team);
    }


}
