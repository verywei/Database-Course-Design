package account;

import java.util.List;

public class Accounts {
	List<Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Accounts [accounts=" + accounts + "]";
	}

	public Accounts(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}

	public Accounts() {
		super();
	}
	
}
