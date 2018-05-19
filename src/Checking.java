/**
 * This class represents the Accounts of type Checking.
 * 
 * @author Anderson Cossul
 *
 */
public class Checking extends Account {
	private int debitCardNumber;
	private int debitCardPIN;
	
	public Checking(String name, int socialSecurityNumber, double balance) {
		super(name, socialSecurityNumber, balance);
	}
	
	// List any methods specific to the Checking Account
}