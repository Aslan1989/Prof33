package lesson1.credit;

public class LoanIssuer {
    // работник банка принимающий решение выдавать или не выдавать кредит
    private String firstName;
    private String lastName;
    private boolean isLazy;
    private boolean isKind;


    public boolean toIssue(LoanTaker taker) // выдавать или не выдавть кредит заемщику
    {
        LoanIssuer masha = new LoanIssuer("Maria", "Konovalova", true, true);
        // если работник ленивый , он одобрит кредит если доход не меньше 20 тыщ в год
        if (taker.getYearlyIncome() < 20000 && masha.isLazy)
            return true;
        // если работник не ленивый и добрый, он одобрит кредит если доход не меньше 25 тыщ
        else if (!masha.isLazy && masha.isKind && taker.getYearlyIncome() < 25000) {
            return true;
            // если работник не ленивый и злой, то он одобрит кредит если доход не меньше 27 тыщ
        } else if (!masha.isKind && !masha.isLazy && taker.getYearlyIncome() < 27000) {
            return true;
        }

        return false;
    }

    public LoanIssuer(String firstName, String lastName, boolean isLazy, boolean isKind) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isLazy = isLazy;
        this.isKind = isKind;
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

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }


}

