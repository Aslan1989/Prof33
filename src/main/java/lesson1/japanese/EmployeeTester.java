package lesson1.japanese;

import java.util.Arrays;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee akira = new Employee("Akira", " Kurasava", 11, 150_000);
        System.out.println(
                akira.calculateSalary()
        );
        Employee matsuo = new Employee("Matsuo", "Basho", 7,200_000);
        System.out.println(
                matsuo.calculateSalary()
        );
        System.out.println(
                matsuo.introduce()
        );
        // хранение данных и бизнес-логики в классе - инкапсуляция
        matsuo.setYears(8);

        Employee [] employees = new Employee[]{akira, matsuo};
        System.out.println(
                Employee.calculateBudget(employees)
        );


    }
}
