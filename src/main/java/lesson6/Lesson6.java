package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Max","Beata","Alex", "Sam", "Sergey"));
        System.out.println(
                filterNames(4,names)
        );
    }

    public static List<String> filterNames(int minLength, List<String> names)
    {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() >= minLength)
                ret.add(name);
        }
        return ret;
    }
}
