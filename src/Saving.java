/**
 * This class represents the Accounts of type Saving.
 * 
 * @author Anderson Cossul
 *
 */
public class Saving extends Account {
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	public Saving(String name, int socialSecurityNumber, double balance) {
		super(name, socialSecurityNumber, balance);
	}

	// List any methods specific to the Savings Account
}
