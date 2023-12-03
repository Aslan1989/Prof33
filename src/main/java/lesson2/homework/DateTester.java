package lesson2.homework;

public class DateTester {
    public static void main(String[] args) {
        Date date = new Date(2023,1,2);
        System.out.println(date);

        Date notValid = new Date(2035,12,45);
        System.out.println(notValid);
    }
}
