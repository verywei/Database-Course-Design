package contacts;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name = "people")
public class People {
	String id, name, address, phone, image;

	public People(String id, String name, String address, String phone, String image) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.image = image;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", image=" + image
				+ "]";
	}

	public People() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
