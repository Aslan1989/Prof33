package lesson4.lines;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PolylineTest {
    @Test
    public void testPolylinePerimeter()
    {
        List<Point> points = new ArrayList<>();

        points.add(new Point(0,0));
        points.add(new Point(2,0));
        points.add(new Point(2,2));
        points.add(new Point(0,2));

        Polyline f = new Polyline(points);
        assertEquals(8,f.getPerimeter(),0.0);


    }
}
