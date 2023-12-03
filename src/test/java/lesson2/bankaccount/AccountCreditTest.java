package lesson2.bankaccount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountCreditTest {

    @Test
    public void testAccountCredit() {
        BankAccount bankAccount = new BankAccount("test123", "Aslan Isaev", 6722);
        assertEquals(6822, bankAccount.credit(100));
        assertEquals(6822, bankAccount.getBalance());
    }

    @Test
    public void testAccountDebitOverdraft() {
        BankAccount bankAccount = new BankAccount("test123", "Aslan Isaev", 6722);
        assertEquals(0, bankAccount.debit(6900));
        assertEquals(6722, bankAccount.getBalance());
    }

    @Test
    public void testAccountDebit() {
        BankAccount bankAccount = new BankAccount("test123", "Aslan Isaev", 6722);
        assertEquals(6700, bankAccount.debit(6700));
        assertEquals(22, bankAccount.getBalance());
    }

    @Test
    public void testOverdraftTransfer() {
        BankAccount a = new BankAccount("test123", "Aslan Isaev", 20);
        BankAccount at = new BankAccount("test456", "Aslan Isaeva", 50);
        assertEquals(0, a.transfer(at, 100));
        assertEquals(a.getBalance(), 20);
        assertEquals(at.getBalance(), 50);
    }

    @Test
    public void testTransfer() {
        BankAccount a = new BankAccount("test123", "Aslan Isaev", 20);
        BankAccount b = new BankAccount("test456", "Aslan Isaeva", 50);
        assertEquals(10, a.transfer(b, 10));
        assertEquals(10, a.getBalance());
        assertEquals(60, b.getBalance());
    }

    @Test
    public void testToString() {
        BankAccount a = new BankAccount("test123", "Aslan Isaev", 20);
        String s = a.toString();
        System.out.println(a);
        assertEquals("account id: test123, holder: Aslan Isaev, balance: 20",s);
    }
}
