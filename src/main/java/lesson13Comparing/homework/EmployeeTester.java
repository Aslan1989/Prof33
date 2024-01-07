package lesson13Comparing.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> department = new ArrayList<>(
                List.of(
                        new Employee(2,"Michail Svetlov", 32,2_300),
                        new Employee(1,"Masha Golubeva", 24,2_400),
                        new Employee(11,"Sergey Minaev", 26,2_500),
                        new Employee(8,"Diana Arbenina", 24,2_400)
                )
        );
        System.out.println(department);
        Collections.sort(department);
        System.out.println(department);

        department.sort(Employee.nameComparator);
        System.out.println(department);
    }
}
