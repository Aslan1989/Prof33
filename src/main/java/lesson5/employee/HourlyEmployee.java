package lesson5.employee;

public class HourlyEmployee extends Employee { // работник почасовой оплате
    private int monthlyHours;

    public HourlyEmployee(String name, int baseSalary, int monthlyHours) {
        super(name, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    @Override
    public int getSalary() {
        return getBaseSalary()+monthlyHours/180;
        //return super.getSalary();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "monthlyHours=" + monthlyHours +
                '}';
    }
}
