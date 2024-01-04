package lesson12DequeListTask.homework;

import java.util.HashSet;
import java.util.Set;

public class SetCompare {
    public static void main(String[] args) {

        Set<String> a1 = Set.of("Hello", "World");
        Set<String> a2 = Set.of("HELLO", "WORLD");
        Set<String> a3 = Set.of("Hello", "World");
        System.out.println(
                compareTwoSets(a1,a2)
        );
        System.out.println(compareTwoSets(a1,a3));

    }
    //  написать функцию для сравнения двух Set<String> - не используя Set.equals
    public static boolean compareTwoSets(Set<String> aSet, Set<String> bSet)
    {
        if (aSet.size() != bSet.size()){
            return false;
        }
        for (String element: aSet
             ) {
            if (!bSet.contains(element)){ // contains - проверяет есть ли в bSet element
                return false;
            }
        }
        return true;

    }
}
