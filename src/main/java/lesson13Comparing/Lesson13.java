package lesson13Comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> groups = new ArrayList<>(
                Arrays.asList("Guns and Roses", "Aerosmith", "Beatles", "Pearl Jam", "Cranberries")
        );
        System.out.println(groups);
    }
}
