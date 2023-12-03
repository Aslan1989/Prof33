package lesson5;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTest {
    public static void main(String[] args) {
        // Working with Arrays in Java. Binary search. Sort
         int [] numbers = new int[] {10,20,5,-40,8};
        Arrays.sort(numbers);
        System.out.println(
                Arrays.toString(numbers)
        );

        String [] towns = {"Berlin", "Dresden", "Prague", "Riga", "Budapest"}; // все равно используется new
        Arrays.sort(towns);

        hello(towns);

        Object [] anything = new Object[]{"Minsk", false, 3.14, -55, 'h'};
        System.out.println(
                (double) anything[2]+25
        );
        System.out.println(
                Arrays.toString(anything)
        );

        // поиск элемента в неотсортиованном массиве это N операций - O(N)
        // поиск элемента в отсортированном массиве log(N)

        System.out.println(
                Arrays.binarySearch(numbers,400)
        );

        // если элемента в массиве нет то возвращается
        // (-(insertion point) -1)
    }

    public static void hello(String [] s)
    {
        System.out.println(Arrays.toString(s));
    }
}
