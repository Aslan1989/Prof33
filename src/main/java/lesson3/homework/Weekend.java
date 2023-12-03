package lesson3.homework;

public enum Weekend {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public boolean isWeekDay()
    {
        return ordinal() <5;
    }

    public boolean isWeekend()
    {
        return ordinal() >=5;
    }
}
