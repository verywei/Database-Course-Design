package contacts;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttachmentRef;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "peoples")
public class Peoples {

	private List<People> people;

	public List<People> getPeoples() {
		return people;
	}

	public void setPeoples(List<People> peoples) {
		this.people = peoples;
	}

	public People getPeople(int index) {
		return people.get(index);
	}

	@Override
	public String toString() {
		return "Peoples [people=" + people + "]";
	}

}
