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
	}

	// List any methods specific to the Savings Account
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("----------\nSaving Account Specific Info:");
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
