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

	/**
	 * Prints parents info and add checking specific info.
	 */
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("----------\nSaving Account Specific Info:");
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

	/**
	 * The saving accounts will use .25 points less than the base rate defined
	 * in the API (accessed by getBaseRate()).
	 */
	@Override
	public double setRate() {
		return getBaseRate() - .25;
	}
}
