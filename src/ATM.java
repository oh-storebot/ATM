import java.math.BigDecimal;

public class ATM {
	
	private int balanceInt;
	BigDecimal balance;
	private String requiredPin;

	public ATM(int i, String requiredPin) {
		
		this.balanceInt = i;
		BigDecimal myBD = new BigDecimal(balanceInt);
		balance = myBD;
		this.requiredPin = requiredPin;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public String getPin() {
		return requiredPin;
	}
	
	public void withdraw(BigDecimal amount) {
		//if(balance.) {
			balance = balance.subtract(amount);
			System.out.println(balance);
		//}else {
			//balance.subtract(balance);
		//}
		
	}

	public void deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
		
	}

	public boolean allowAccess(String enteredPin) {
		if(requiredPin.equals(enteredPin)) {
			return true;
		}
		return false;
	}


}
