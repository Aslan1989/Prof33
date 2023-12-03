package lesson2.extend;

public class Student  extends Person{

    public Student(String name, String address, String program, int year) {
        super(name, address); // вызов конструктора суперкласса
        this.program = program;
        this.year = year;
    }

    private String program;
    private int year;
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{ " +getName()+ ", " + getAddress() +
                ", program='" + program + '\'' +
                ", year=" + year +
                '}';
    }
}
