package com.bayamp.xml.jaxb.customer.xpath;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XpathCustomerParseXMLJaxB {

	public static void main(String[] args) throws JAXBException {
		
        JAXBContext jc = JAXBContext.newInstance(MyCustomer.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("src/main/resources/customer-xpath.xml");
        MyCustomer response = (MyCustomer) unmarshaller.unmarshal(xml);
        
        System.out.println(response); 
	}

}
