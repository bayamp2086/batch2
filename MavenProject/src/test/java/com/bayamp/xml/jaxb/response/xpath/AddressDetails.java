package com.bayamp.xml.jaxb.response.xpath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AddressDetails {
	private String street;

	@Override
	public String toString() {
		return "AddressDetails [street=" + street + "]";
	}

	
}
