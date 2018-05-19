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
		System.out.println("Account number: " + accountNumber);
	}

	// List any methods specific to the Checking Account
}