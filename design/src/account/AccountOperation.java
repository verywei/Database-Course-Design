package account;

import java.util.List;

public interface AccountOperation {
	public List<Account> selectByCreater(String creater);
	public void insertAccount(Account account);
	public void deleteAccount(Account account);
	public String updateAccount(Account account);
}
