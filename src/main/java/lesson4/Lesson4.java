package lesson4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        // Ссылочные типы

        // встоенные типы - простые типы
        // хранятся в стеке
        //Int long boolean float double char

        // ссылочные типы
        // ссылочные типы храняться  в heap - общая память
        // [] class interface enum
        // конвенция - классы начинать с большой буквы
        // Integer Long Boolean Float Double Character
        Double [] pi = new Double[]{3.14};

        check(pi);
        System.out.println(
                Arrays.toString(pi)
        );

        int i = 44;
        change(i);
        System.out.println(i);
    }

    public static void change(int i)
    {
        i +=100;
    }

    public static void check(Double[] i)
    {
        i[0] += 1000.0;

    }
}
