package lesson5.employee;

public class OfficeEmployee extends Employee {

    private int monthlyBonus;

    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public OfficeEmployee(String name, int baseSalary, int monthlyBonus) {
        super(name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    public OfficeEmployee(String name, int baseSalary, int monthlyBonus, Manager manager) {
        super(name, baseSalary);
        this.monthlyBonus = monthlyBonus;
        this.manager = manager;
    }

    //     @Override - переопределение метода объявленного в базовом классе в дочернем классе

    @Override
    public int getSalary() {
        //return super.getSalary();
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public String toString() {
        return "OfficeEmployee{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", salary=" + getSalary()+
                (manager == null ? ", 'no Manager'" : ", manager='" + manager.getName() + "'") +
                '}';
    }

}
