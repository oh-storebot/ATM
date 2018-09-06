import java.math.BigDecimal;

public class ATM {
	
	private int balanceInt; //used to convert to BD. see line 12
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
		int difference = balance.compareTo(amount);
		if(difference == -1) {
			balance = balance.subtract(balance);
			System.out.println(balance);
		}else {
			balance = balance.subtract(amount); //this doesn't work now
		}
		
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
