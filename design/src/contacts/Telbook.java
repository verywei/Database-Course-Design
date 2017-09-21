package contacts;

public class Telbook {
	String creater, name, phone;

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Telbook(String creater, String name, String phone) {
		super();
		this.creater = creater;
		this.name = name;
		this.phone = phone;
	}

	public Telbook() {

	}

	@Override
	public String toString() {
		return "Telbook [creater=" + creater + ", name=" + name + ", phone=" + phone + "]";
	}

}
