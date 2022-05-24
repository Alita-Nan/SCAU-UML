package domain;

/**
 *  Entity of Card.
 * @author Ether
 *
 */
public class Card {
	
	private String ID;
	
	private Account account;
	
	public Card(String iD, Account account) {
		ID = iD;
		this.account = account;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
}
