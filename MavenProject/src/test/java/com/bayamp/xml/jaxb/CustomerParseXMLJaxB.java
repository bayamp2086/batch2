package com.bayamp.xml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bayamp.xml.jaxb.customer.Address;
import com.bayamp.xml.jaxb.customer.Customer;

public class CustomerParseXMLJaxB {

	public static void main(String[] args) {
		
		try {  
			   
	        File file = new File("src/main/resources/customer.xml");  
	        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);  
	   
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	        Customer customer= (Customer) jaxbUnmarshaller.unmarshal(file);  
	          
	      //  System.out.println("First Name :" + customer.getFirstName());  
	
	      //  Address address = customer.getAddress();
	        
	        System.out.println(customer);
	   
	      } catch (JAXBException e) {  
	        e.printStackTrace();  
	      }  
	}

}
