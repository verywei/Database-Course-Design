package contacts;

public class Login {
	String id,phone,password;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	@Override
	public String toString() {
		return "Login [id=" + id + ", phone=" + phone + ", password=" + password + "]";
	}

	public Login(String id, String phone, String password) {
		super();
		this.id = id;
		this.phone = phone;
		this.password = password;
	}

	public Login() {
		super();
	}
	
}
