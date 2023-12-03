package lesson3.figure;

public class Rectangle extends FigureAbstract{
    private int wight;
    private int height;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }

    public double area()
    {
        return wight*height;
    }

    @Override
    public double perimeter() {
        return 2*(wight+height);
    }
}
