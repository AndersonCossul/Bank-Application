/**
 * This class represents the Accounts of type Checking.
 * 
 * @author Anderson Cossul
 *
 */
public class Checking extends Account {
	private int debitCardNumber;
	private int debitCardPIN;

	/**
	 * As soon as setting the passing params, we'll modify the generated
	 * accountNumber and append a "1" to it.
	 * 
	 * @param name
	 * @param socialSecurityNumber
	 * @param initialDeposit
	 */
	public Checking(String name, int socialSecurityNumber, double initialDeposit) {
		super(name, socialSecurityNumber, initialDeposit);
		accountNumber = "1" + accountNumber;
		debitCardNumber = generateDebitCardNumber();
		debitCardPIN = generateDebitCardPIN();
	}

	/**
	 * @return 12 random digit number.
	 */
	private int generateDebitCardNumber() {
		return (int) (Math.random() * Math.pow(10, 12));
	}

	/**
	 * @return 4 random digit number.
	 */
	private int generateDebitCardPIN() {
		return (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("----------\nChecking Account Specific Info:");
		System.out.println("Debit Card Number: " + debitCardNumber);
		System.out.println("Debit Card PIN: " + debitCardPIN);
	}
}