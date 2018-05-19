/**
 * This class represents the Accounts of type Saving.
 * 
 * @author Anderson Cossul
 *
 */
public class Saving extends Account {
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	/**
	 * As soon as setting the passing params, we'll modify the generated
	 * accountNumber and append a "2" to it.
	 * 
	 * @param name
	 * @param socialSecurityNumber
	 * @param initialDeposit
	 */
	public Saving(String name, int socialSecurityNumber, double balance) {
		super(name, socialSecurityNumber, balance);
		accountNumber = "2" + accountNumber;
		System.out.println("Account number: " + accountNumber);
	}

	// List any methods specific to the Savings Account
}
