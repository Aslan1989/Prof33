package lesson1.credit;

public class LoanTaker {
    // потенициальный кредитополучатель
    private String firstName;
    private  String lastName;
    private int age;
    private double yearlyIncome; // годовой доход

    public LoanTaker(String firstName, String lastName, int age, double yearlyIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearlyIncome = yearlyIncome;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
}
