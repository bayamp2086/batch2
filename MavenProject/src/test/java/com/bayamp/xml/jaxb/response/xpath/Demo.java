package com.bayamp.xml.jaxb.response.xpath;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Demo {

    public static void main(String[] args) throws Exception {
//        JAXBContext jc = JAXBContext.newInstance(Response.class);
//
//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        File xml = new File("src/main/resources/response.xml");
//        Response response = (Response) unmarshaller.unmarshal(xml);
//        
//        System.out.println(response);
//        
		/*
		 * Marshaller marshaller = jc.createMarshaller();
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 * marshaller.marshal(response, System.out);
		 */
        
        listProgram();
        
    }
    
    public static void listProgram() {

    	String str = "[1,[2,3],4,[10,22,33]]";
    	
    	str = str.replaceAll("\\[","");
    	str = str.replaceAll("\\]","");
    	  	
    	System.out.println(str);
    	
    	StringBuffer buffer = new StringBuffer();
    	buffer.append("[");
    	 	
    	String[] numbers = str.split(",");
    	
    	for(String number : numbers) {
    		buffer.append(number+",");
    	}
    	
    	buffer.append("]");
    	
    	System.out.println(buffer);
    	
    	
    }
    	
}
