package account;

import java.sql.Timestamp;

public class Account {
	String id,creator,kind;
	String time;
	double amount,sum;
	String locate;
	public String getLocate() {
		return locate;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public Account(String id, String creator, String kind, String time, double amount, double sum, String locate) {
		super();
		this.id = id;
		this.creator = creator;
		this.kind = kind;
		this.time = time;
		this.amount = amount;
		this.sum = sum;
		this.locate = locate;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", creator=" + creator + ", kind=" + kind + ", time=" + time + ", amount=" + amount
				+ ", sum=" + sum + ", locate=" + locate + "]";
	}
	public Account() {
		super();
	}
	
}
