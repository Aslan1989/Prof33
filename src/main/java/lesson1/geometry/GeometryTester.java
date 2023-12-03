package lesson1.geometry;

public class GeometryTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(
                new Point(1,1),
                new Point(5,5)
        );

        System.out.println(r.area());
    }
}
