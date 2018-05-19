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
		safetyDepositBoxID = generateSafetyDepositBoxID();
		safetyDepositBoxKey = generateSafetyDepositBoxKey();
	}
	
	/**
	 * @return 3 digit random number.
	 */
	private int generateSafetyDepositBoxID() {
		return (int) (Math.random() * Math.pow(10, 3));
	}

	/**
	 * @return 4 digit random number.
	 */
	private int generateSafetyDepositBoxKey() {
		return (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("----------\nSaving Account Specific Info:");
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
