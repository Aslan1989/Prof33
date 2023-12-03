package lesson3.enumeration;

public enum Fruits {
    APPLE(52),ORANGE(57),BANANA(89),GRAPES(67),KIWI(61);
    // набор констант
    // нельзя расширить после создание
    // все экземпляры этого класса создаются один раз
    private int calories;

    Fruits(int calories)
    {
        this.calories =calories;
    }

    public int getCalories()
    {
        return calories;
    }



}
