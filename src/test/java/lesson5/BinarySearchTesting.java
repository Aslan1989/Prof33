package lesson5;

import lesson5.homework.BinarySearchTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTesting {
    int [] a = {1,4,5,7,12,20};
    @Test
    public void BinarySearchTest()
    {
        assertEquals(4,BinarySearchTest.binarySearch(a,12));
    }
}
