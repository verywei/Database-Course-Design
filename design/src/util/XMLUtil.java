package util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sun.org.apache.regexp.internal.recompile;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import contacts.Telbooks;

public class XMLUtil {
	/*
	 * ¶ÔÏó×ªxml
	 */
	public static String convertToXml(Object obj) {
		XStream xStream = new XStream();
		xStream.setMode(XStream.NO_REFERENCES);
		String xml = xStream.toXML(obj);
		return xml;
	}

	public static <T> T converyToJavaBean(String in, Class<T> clazz) {
		XStream stream = new XStream(new DomDriver());
		stream.processAnnotations(clazz);
		Object obj = stream.fromXML(in);
		try {
			return clazz.cast(obj);
		} catch (ClassCastException e) {
			return null;
		}
	}

}
