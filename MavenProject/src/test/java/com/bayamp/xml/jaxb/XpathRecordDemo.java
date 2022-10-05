package com.bayamp.xml.jaxb;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

public class XpathRecordDemo {

	public static void main(String[] args) throws XPathExpressionException {
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();

        InputSource xml = new InputSource("src/main/resources/record.xml");
        //String streetName = (String) xpath.evaluate("/root/record/address/street", xml, XPathConstants.STRING);
        String address = (String) xpath.evaluate("/root/record/address/street", xml,XPathConstants.STRING);
    
        System.out.println(address);

	}

}
