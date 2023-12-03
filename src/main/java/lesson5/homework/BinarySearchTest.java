package lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {

        int [] a = {1,4,5,7,12,20};
        System.out.println(binarySearch(a,12));
    }
    public static int binarySearch(int [] a, int value)
    {
        int minIndex = 0;
        int maxIndex = a.length-1;
        while (maxIndex <= maxIndex)
        {
            int midIndex = (maxIndex+minIndex)/2;
            if (value > a[midIndex])
            {
                minIndex = midIndex+1;
            } else if (value < a[midIndex]) {
                maxIndex = midIndex-1;
            }
            else
                return midIndex;
        }
        return -minIndex-1;
    }
}
