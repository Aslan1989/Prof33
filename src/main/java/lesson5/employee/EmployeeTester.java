package lesson5.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee dima = new Employee("Dima Goborov",2_200);
        OfficeEmployee masha = new OfficeEmployee("Masha Simonova", 2_350, 500);
        Employee max = new HourlyEmployee("Max Kotkov", 1_200,2400);
        Manager alex = new Manager("Alex Isaev",2_000,200,1.8);
        System.out.println(
                masha.getId()

        );
        System.out.println("Dimas salary is: "+ dima.getSalary());
        System.out.println("Mashas salary is: " +masha.getSalary());

//        Dimas salary is: 2200
//        Mashas salary is: 2850
//        Max's salary is: 1213
//        Alex's salary is: 3960

        System.out.println("Max's salary is: "+max.getSalary());

        System.out.println("Alex's salary is: "+alex.getSalary());

        List<Employee> workers = new ArrayList<>(Arrays.asList(dima,masha,max,alex));
//        workers.add(dima);
//        workers.add(masha);
//        workers.add(max);
//        workers.add(alex);

        for (Employee e: workers
             ) {
            System.out.println("Name " + e.getName()+ " salary " + e.getSalary());
        }

        System.out.println(dima);
        System.out.println(alex);
        System.out.println(masha);
        masha.setManager(alex);
        System.out.println(masha);

    }
}
