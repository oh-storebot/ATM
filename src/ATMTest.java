import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ATMTest {

	@Test
	public void shouldHaveDefaultBalanceof100() {
		ATM underTest = new ATM(100, "");
		BigDecimal balance = underTest.getBalance();
		assertEquals(100, balance, 0);
	}

	@Test
	public void shouldHaveDefaultBalanceOf200() {
		ATM underTest = new ATM(200, "");
		BigDecimal balance = underTest.getBalance();
		assertEquals(200, balance, 0);
	}
	
	@Test
	public void shouldHaveBalanceOf100AfterWithdrawOf100() {
		ATM underTest = new ATM(200, "");
		underTest.withdraw(100);
		double balance = underTest.getBalance();
		assertEquals(100, balance, 0);
	}
	
	@Test
	public void shouldHaveBalanceOf0AfterWithdrawOf300() {
		ATM underTest = new ATM(200, "");
		underTest.withdraw(300);
		double balance = underTest.getBalance();
		assertEquals(0, balance, 0);
	}
	
	@Test
	public void shouldHaveBalanceOf100AfterDeposit() {
		ATM underTest = new ATM(0, "");
		underTest.deposit(100);
		double balance = underTest.getBalance();
		assertEquals(100, balance, 0);
	}
	
	@Test
	public void shouldAllowAccessByPin() {
		ATM underTest = new ATM(0, "1234");
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
	}
	
	@Test
	public void shouldDenyAccessByPin() {
		ATM underTest = new ATM(0, "1234");
		boolean access = underTest.allowAccess("1235");
	}
	
	
	
}
