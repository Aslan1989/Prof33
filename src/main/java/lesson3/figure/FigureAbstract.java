package lesson3.figure;

public abstract class FigureAbstract {
    public abstract double area(); // абстрактный метод должен быть реализован производными классами
    public abstract double perimeter();

    public static double calculateArea(FigureAbstract[] figureAbstracts)
    {
        double area = 0;
        for (FigureAbstract f: figureAbstracts
             ) {
            area += f.area();
        }
        return area;

//        for (int i = 0; i < figureAbstracts.length; i++) {
//            area += figureAbstracts[i].area();
//        }

    }
}
