package Lesson1.japanese;

import lesson1.credit.LoanIssuer;
import lesson1.credit.LoanTaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoanTester {
    @Test
    public void testToIssue()
    {
        LoanTaker dima = new LoanTaker("Dmirtiy", "Vlasov", 55,23000.0);
        LoanIssuer masha = new LoanIssuer("Maria", "Konovalova", true,true);
        assertEquals(false, masha.toIssue(dima));
    }
}
