package lesson1.geometry;

public class Rectangle {
    Point sw;
    Point ne;

    public Rectangle(Point sw, Point ne) {
        this.sw = sw;
        this.ne = ne;
    }

    public int area()
    {
        return (sw.getX()- ne.getX()) * (sw.getY()-ne.getY());
    }

    public Point getSw() {
        return sw;
    }

    public void setSw(Point sw) {
        this.sw = sw;
    }

    public Point getNe() {
        return ne;
    }

    public void setNe(Point ne) {
        this.ne = ne;
    }
}
