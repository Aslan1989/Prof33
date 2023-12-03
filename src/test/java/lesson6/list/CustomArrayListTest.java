package lesson6.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomArrayListTest {
    @Test
    public void testContains()
    {
        CustomArrayList l = new CustomArrayList();
        l.add(12);
        l.add(15);
        assertTrue(l.contains(12));
        assertFalse(l.contains(5));
    }
    @Test
    public void testRemove()
    {
        CustomArrayList l = new CustomArrayList();
        l.add(12);
        l.add(15);
        l.add(1);
        l.add(20);
        l.remove(1);
        assertEquals(1,l.get(1));
        assertEquals(20,l.get(2));
        assertEquals(3,l.size());
    }
}
