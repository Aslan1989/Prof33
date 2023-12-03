package lesson4.lines;

public class Triangle implements Figure{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getPerimeter() {
        return p1.getLength(p2)+p2.getLength(p3)+p3.getLength(p1);
    }
}
