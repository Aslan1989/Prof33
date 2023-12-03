package lesson5.employee;

public class Employee {
    // решение делать или нет базовый класс конкретный(не абстрактным)
    // определяется тем, потребуется ли нам когда-либо создавать экземпляры этого базового класса
    // если да, делаем его конкретным

    private int id;
    public int getId() {
        return id;
    }
    private String name;
    private int baseSalary;

    private static int counter = 0;

    public Employee( String name, int baseSalary) {
        this.id = counter++;
        this.name = name;
        this.baseSalary = baseSalary;
    }



    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getSalary(){ // зарплата в дочерних классах будет рассчитываться исходя из других параметров
        return  baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
