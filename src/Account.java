/**
 * This parent class shares all account shared info.
 * 
 * @author Anderson Cossul
 *
 */
public abstract class Account implements IBaseRate {
	protected String name;
	protected int socialSecurityNumber;
	protected double balance;
	protected String accountNumber;
	protected double rate;
	protected static int accountCounter = 10000;
	
	public Account(String name, int socialSecurityNumber, double initialDeposit) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		balance = initialDeposit;
		accountNumber = setAccountNumber();
		System.out.println("Account number: " + accountNumber);
	}

	/**
	 * Generated with the following process: 1 or 2 depending on Savings or
	 * Checking, last two digits of SSN, unique 5-digit number, and random
	 * 3-digit number.
	 * The first digit (1 for savings and 2 for checking will be done in the override).
	 * 
	 * @return accountNumber
	 */
	private String setAccountNumber() {
		int lastTwoOfSocialSecurityNumber = socialSecurityNumber % 100;
		int unique5DigitNumber = accountCounter++;
		int random3digitNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSocialSecurityNumber + "" + unique5DigitNumber + "" + random3digitNumber;
	}
}
