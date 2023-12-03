package lesson4.lines;

import java.util.ArrayList;
import java.util.List;

public class Polyline implements Figure {
    private List<Point> points = new ArrayList<>();

    public Polyline(List<Point> points) {
        this.points = points;
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    @Override
    public double getPerimeter() {

        double p = 0;
        if (points.size() >= 1){
            for (int i = 0; i < points.size()-1; i++) {
                Point current = points.get(i);
                Point next = points.get(i+1);

                p = p + current.getLength(next);
            }
            Point first = points.get(0);
            Point last = points.get(points.size()-1);
            p = p + first.getLength(last);
        }
            return p;
    }
}
