import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositWontAcceptNegative() {
        Account account = new Account(0);
        Assert.assertFalse(account.deposit(-10));
    }

    @Test
    public void withdrawWontAcceptNegative() {
        Account account = new Account(0);
        Assert.assertFalse(account.withdraw(-10));
    }

    @Test
    public void accountCannotOverstepOverdraftLimit() {
        Account account = new Account(0);
        Assert.assertFalse(account.withdraw(100));
    }

    @Test
    public void depositCorrectAmount() {
        Account account = new Account(0);
        account.deposit(10);
        Assert.assertEquals(10d,account.getBalance(),epsilon);
    }

    @Test
    public void withdrawCorrentAmount() {
        Account account = new Account(0);
        account.deposit(10);
        account.withdraw(10);
        Assert.assertEquals(0d,account.getBalance(),epsilon);
    }

    @Test
    public void depositIsWorking() {
        Account account = new Account(0);
        Assert.assertTrue(account.deposit(10));
    }

    @Test
    public void withdrawIsWorking() {
        Account account = new Account(0);
        account.deposit(10);
        Assert.assertTrue(account.withdraw(10));
    }
}