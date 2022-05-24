package domain;
/**
 * @author EtherN
 *
 */
public class Account {

	private String userName;

	private String password;

	private Double balance;


	public Account(String userName, String password, Double balance, Boolean frozen) {
		super();
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
