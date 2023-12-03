package lesson4.lines;

public class Point {
    private int x;
    private  int y;

    public double getLength( Point point)
    {
      return  Math.sqrt((point.getX() - x)*(point.getX() - x) + (point.getY() - y)*(point.getY() - y));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
