package lesson3.enumration;

import lesson3.homework.Weekend;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDays {
    @Test
    public void testWeekDay()
    {
        assertTrue(Weekend.MONDAY.isWeekDay());
        assertFalse(Weekend.FRIDAY.isWeekend());
    }

    @Test
    public void testWeekend()
    {
        assertTrue(Weekend.SATURDAY.isWeekend());
        assertFalse(Weekend.SATURDAY.isWeekDay());
    }


}
