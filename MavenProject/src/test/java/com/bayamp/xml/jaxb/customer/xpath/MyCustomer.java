package com.bayamp.xml.jaxb.customer.xpath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyCustomer {

	private String firstName;
	private String lastName;

	//@XmlPath("customer/billingAddress") : WRONG
	//@XmlPath("billingAddress")
	@XmlPath("addresses/address/billingAddress")
	private MyAddress billingAddress;

	//@XmlPath("customer/shippingAddress") : WRONG
	//@XmlPath("shippingAddress")
	@XmlPath("addresses/address/shippingAddress")
	private MyAddress shippingAddress;

	@Override
	public String toString() {
		return "CustomerXpath [firstName=" + firstName + ", lastName=" + lastName + ", billingAddress=" + billingAddress
				+ ", shippingAddress=" + shippingAddress + "]";
	}
	

}