import java.math.BigDecimal;
import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM myATM = new ATM(500, "1111");

		System.out.println("Enter your PIN: ");
		String enteredPin = input.nextLine();

		if (myATM.getPin().equals(enteredPin)) {
			System.out.println("Welcome to Bank of We Can Code It");
		}

		while (!myATM.getPin().equals(enteredPin)) { // only works once.
			System.out.println("Enter your PIN again: ");
			enteredPin = input.nextLine();
		}

		System.out.println("Choose an option: ");
		System.out.println("Press 1 to deposit funds");
		System.out.println("Press 2 to withdraw funds");
		System.out.println("Press 3 to check your balance");
		System.out.println("Press 4 to exit");
		String menuOption = input.nextLine();

		while (!menuOption.equals("4")) {
			if (menuOption.equals("1")) {
				System.out.println("Enter the amount you would like to deposit: ");
				BigDecimal amountToDeposit = input.nextBigDecimal();
				myATM.deposit(amountToDeposit);
				input.nextLine();
			} else if (menuOption.equals("2")) {
				System.out.println("Enter the amount you would like to withdraw: ");
				BigDecimal amountToWithdraw = input.nextBigDecimal();
				myATM.withdraw(amountToWithdraw);
				input.nextLine();
			} else if (menuOption.equals("3")) {
				System.out.println("Your currennt balance is " + myATM.getBalance());
			} else {
				System.out.println("Goodbye... Thanks for banking with us today!"); //out of the loop already? That why it skips?
				System.exit(0);
			}

			System.out.println("Choose another option: ");
			System.out.println("Press 1 to deposit funds");
			System.out.println("Press 2 to withdraw funds");
			System.out.println("Press 3 to check your balance");
			System.out.println("Press 4 to exit");
			menuOption = input.nextLine();
		}
		System.out.println("Goodbye... Thanks for banking with us today!"); // not sure why line 44 doesn't work had to add this
																			
		System.exit(0);
		input.close();

	}

}
