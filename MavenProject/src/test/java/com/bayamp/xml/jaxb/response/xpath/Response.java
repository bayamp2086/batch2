package com.bayamp.xml.jaxb.response.xpath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response{
	
	@XmlPath("record/addressDetails")
	private AddressDetails addressDetails;

	@Override
	public String toString() {
		return "Response [details=" + addressDetails + "]";
	}
	
//    @XmlPath("record/AddressDetails/street/text()")
//    String street;
//
//	@Override
//	public String toString() {
//		return "Response [street=" + street + "]";
//	}

  
    
}