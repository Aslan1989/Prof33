package lesson3.date;

import lesson2.homework.Date;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class DateTest {
    @Test
    public void checkIsValid()
    {
        assertTrue(Date.isValid(2022,9,3));
        assertFalse(Date.isValid(2022,-4,14));
        assertFalse(Date.isValid(22022,4,31));
        assertFalse(Date.isValid(2022,2,30));
    }

    @Test
    public void checkAddTest()
    {
        Date date = new Date(2022,3,23);
        date.addDay();
        assertEquals(2022,date.getYear());
        assertEquals(3,date.getMonth());
        assertEquals(24,date.getDay() );

        Date date1 = new Date(2022,12,31);
        date1.addDay();
        assertEquals(2023, date1.getYear());
        assertEquals(1,date1.getMonth());
        assertEquals(1,date1.getDay());
    }
}
