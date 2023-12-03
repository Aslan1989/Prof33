package lesson1.japanese;

public class Employee {
    // класс - объединение чего-либо по характерным признакам
    // класс - шаблон для описания его представителенй
    // класс - набор свойств и действий
    // свойства == переменные класса == поля класса
    // методы == функции == действия

    // уровень доступа к понял и методам класса
    // если ниего не указывать, package private - все классы в package - все классы имеют доступ
    // private - досутп только в самом классе
    // public - досутп из всх классов вообще
    // protected - в классе и в производных классах (в наследника)

    private String firstName;
    private String lastName;
    private int years; // выслуга лет - сколько работает в нашей комнапии
    private double baseSalary; // базовая зарплата

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; // this - ссылка на экземпляр класса
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // конструктор нужен дял правильной иницилизации экземпляра класса

    public Employee(String firstName, String lastName, int years, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
        this.baseSalary = baseSalary;
    }

    // метод - не статическая функция
    // зарплата = 50000 йен за каждый год + базовая зарплата

    // зарплатный год на год
    // static - функция будет вызываться не для экземпляра класса
    public static double calculateBudget(Employee[] e)
    {
        // нужно пройтись по всем работникам из массива
        double sum = 0;
        for (Employee emp: e // foreach
             ) {
            sum += emp.calculateSalary();
        }
//        for (int i = 0; i < e.length; i++) {
//            sum += e[i].calculateSalary();
//        }
        // и сложить из зарплаты
        // возвратить результат
        return sum;
    }

    public double calculateSalary() {
        return baseSalary + 50000 * years;
    }

    public String introduce() {
        if (years >= 12)
            return "Уважаемый " + firstName + " " + lastName;
        else
            // Если работни работает больше 12 лет возвращать уважаемый Имя Фамилия

            return "Привет " + firstName;
    }
}
