package lesson1.credit;

public class LoanTester {
    public static void main(String[] args) {
        LoanTaker dima = new LoanTaker("Dmirtiy", "Vlasov", 55,23000.0);
        LoanIssuer masha = new LoanIssuer("Maria", "Konovalova", true,true);
        System.out.println(
                masha.toIssue(dima)
        );

    }
}
