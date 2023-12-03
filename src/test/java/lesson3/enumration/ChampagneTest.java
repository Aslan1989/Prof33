package lesson3.enumration;

import lesson3.homework.Champagne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampagneTest {
    @Test
    public void qualityTest()
    {
        assertEquals(90, Champagne.PREMIER.getQuality());
    }
}
