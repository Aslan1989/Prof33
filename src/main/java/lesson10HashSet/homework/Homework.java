package lesson10HashSet.homework;

import java.net.CookieHandler;
import java.util.*;

public class Homework {
    public static void main(String[] args) {

        System.out.println(
                getUniqueCharacters("Hello world!")
        );
        System.out.println(
                getSortedUniqueCharacters("hello world!")
        );

        List<String> countries = Arrays.asList("Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden");
        List<String> words = Arrays.asList("Andorra", "Canada", "First", " candy","Argentina", " wood", " parrot", " Avangard", "Cuba");

        // найти все сраны п изи counties присутствующие в words b начинающиеся на А
        Set<String> filteredCountries = new HashSet<>();
        for (String c : countries
        )
            if (c.startsWith("A"))
                filteredCountries.add(c);

        filteredCountries.retainAll(words); // сохраниить только то что есть и в words

        System.out.println(filteredCountries);
    }

    public static Collection<Character> getUniqueCharacters(String s) {
        Set<Character> result = new HashSet<>();
        for (Character c : s.toCharArray()
        ) {
            result.add(c);
        }
        return result;
    }

    public static Collection<Character> getSortedUniqueCharacters(String s) {
        Set<Character> result = new TreeSet<>();
        for (Character c : s.toCharArray()
        ) {
            result.add(c);
        }
        return result;
    }
}
