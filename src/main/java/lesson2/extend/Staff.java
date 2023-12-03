package lesson2.extend;

public class Staff extends Person {

    private String faculty;
    private int salary;

    public Staff(String name, String address, String faculty, int salary) {
        super(name, address);
        this.faculty = faculty;
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{ " + getName() + ", " + getAddress() +
                ", faculty='" + faculty + '\'' +
                ", salary=" + salary +
                '}';
    }
}
