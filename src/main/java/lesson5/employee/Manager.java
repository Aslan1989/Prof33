package lesson5.employee;

public class Manager extends OfficeEmployee{

    private double coefficient;

    public Manager(String name, int baseSalary, int monthlyBonus, double coefficient) {
        super(name, baseSalary, monthlyBonus);
        this.coefficient = coefficient;
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary()*coefficient);
        //return super.getSalary();
    }

    @Override
    public String toString() {
        return "Manager{" + "id= " + getId() +
                ", name='" + getName() + "'"+ ", salary=" + getSalary() +
                '}';
    }
}
