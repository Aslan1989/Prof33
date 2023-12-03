package lesson2.extend;

public class PersonTester {
    public static void main(String[] args) {
        Person misha = new Person("Михаил Светлов", "ул. Пасечная 14");
        System.out.println(misha);

        Student kostya = new Student("Магомед Исаев","ул. Лизы Чайкина 10а", "физика",2);
        System.out.println(kostya);

        Staff ivan = new Staff("Иван Иваныч", "переулок яблочная 44", "физкультура", 25_000);
        System.out.println(ivan);

    }
}
