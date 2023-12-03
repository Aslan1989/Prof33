package lesson2.homework;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        if (!isValid(year,month,day))
            throw new IllegalArgumentException("Can't create date: " + day + "/" + month + "/" + year);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public void addDay()
    {
        if (isValid(year,month,day+1))
        {
            day++;
        }
        else {
            day = 1;
            if (month == 12){
                month = 1;
                year ++;
            }
            else month++;
        }
    }


    public static boolean isValid(int year,int month, int day)
    {
        // месяцы могут быть от 1 до 12
        if (month < 1 || month > 12)
            return false;
        // в феврале может быть 29е число только в высокосный год
        if (day ==29 && month ==2 && isLeapYear(year))
            return true;
        // в 2 месяце у нас не может быть 30 числа
        if (month == 2 && day == 30)
            return false;
        // во всех месяцах кроме второго от 1 до 30 дней
        if (month != 2 && day >= 1 && day <= 30)
            return true;
        // и в месяцах 1 3 5 7 8 10 12 может быть 31 день
        if (day == 31 && (month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
            return true;
        return false;
    }

    private static boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}
