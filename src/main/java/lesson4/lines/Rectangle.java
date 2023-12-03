package lesson4.lines;

public class Rectangle implements Figure{

    private Point p1,p2,p3,p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public double getPerimeter() {
        return p1.getLength(p2)+p2.getLength(p3)+p3.getLength(p4)+p4.getLength(p1);
    }

    // в ява однократное наследнование - можно наследовать (extends) только один класс (конкретный или абстрактный)
    // можно реализовывать (implements) неограниченное кол -во интерфейсов

    // модно отнаслдеоваться от конкретного класса унаследовав его релаизвацию

    // можно отнаслдеоваться от абстрактного класса - при этом можно получить готовую реализацию и
    // дописат абстрастные функции

    // можно реализовывать инстерфейс, дописав все его абстрактные функции
}
