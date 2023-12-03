package Lesson1.japanese;

import lesson1.japanese.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryTest {
    // тест это публичная функция без параметров
    @Test
    public void testSalary()
    {
        Employee takeshi = new Employee("Takeshi", "Kitano", 10,100_000);
        // идея теста - зарплата такеши должна быть 50000*years+baseSalary
        assertEquals(600_000, takeshi.calculateSalary(), 0.001);
        // TDD - Test-Driven-Development - Разработка ПО на основе тестов
    }
    @Test
    public void testYoungIntroduction()
    {
        Employee y = new Employee("NAME", "LAST",4,200_000);
        assertEquals("Привет NAME", y.introduce());
    }

    @Test
    public void testOldIntroduction()
    {
        Employee y = new Employee("NAME", "LAST",12,200_000);
        assertEquals("Уважаемый NAME LAST", y.introduce());
    }
}
