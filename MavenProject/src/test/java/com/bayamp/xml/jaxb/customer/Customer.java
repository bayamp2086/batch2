package com.bayamp.xml.jaxb.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

     private String firstName;
     private String lastName;
     
     private Address address;

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

     
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
     
    
     
}