package contacts;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class Telbooks {
	
	private List<Telbook> telbooks;

	public List<Telbook> getTelbooks() {
		return telbooks;
	}

	public void setTelbooks(List<Telbook> telbooks) {
		this.telbooks = telbooks;
	}

	@Override
	public String toString() {
		return "Telbooks [telbooks=" + telbooks + "]";
	}

}
