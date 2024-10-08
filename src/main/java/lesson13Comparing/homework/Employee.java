package lesson13Comparing.homework;

import java.util.Comparator;

public class Employee  implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private double salary;
    public static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);

    public static Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);

    public static Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //Integer.compare(getId(),o.getId());
        return this.getId() - o.getId();
    }
}
