/**
 * jbpm5processdocTest.java
 *
 * This file was generated by XMLSpy 2009sp1 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */

package com.jbpm5processdocTest;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

import com.jbpm5processdoc.*;

public class jbpm5processdocTest {
	protected static void example() throws Exception {
		//
		// TODO:
		// Insert your code here...
		//
		// Example code to create and save a structure:
		// com.jbpm5processdoc.jbpm5processdoc2 doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();
		//
		// com.jbpm5processdoc.waypointType root = doc.waypoint.append();
		// ...
		// doc.saveToFile("jbpm5processdoc1.xml", true);
		//
		// Example code to load and save a structure:
		// com.jbpm5processdoc.jbpm5processdoc2 doc = com.jbpm5processdoc.jbpm5processdoc2.loadFromFile("jbpm5processdoc1.xml");
		// 
		// com.jbpm5processdoc.waypointType root = doc.waypoint.first();
		// ...
		// doc.saveToFile("jbpm5processdoc1.xml", true);

	}

	
	public static void showJBPM5Doc() {
		try {
			com.jbpm5processdoc.jbpm5processdoc2 doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();
			//doc = com.jbpm5processdoc.jbpm5processdoc2.loadFromFile("E:/java/myeisdocs/jbpm3-jbpm5-migration/xml-files/jbpm5processdoc.xml");
			doc = com.jbpm5processdoc.jbpm5processdoc2.loadFromFile("E:/java/myeis/struts2-projs/jbpm5model/src/main/java/com/jbpm5model/bp/Product_Marketing_Manager_Resolving_Sales_Order_Holds/Product_Marketing_Manager_Resolving_Sales_Order_Holds.bpmn");
			
            //dump xml string
            TransformerFactory transformerFactory;
            Transformer transformer;            
            transformerFactory = TransformerFactory.newInstance();
            transformer = transformerFactory.newTransformer();            
            DOMSource source = new DOMSource(doc.getNode());
            StringWriter buffer = new StringWriter(  );
            PrintWriter out = new PrintWriter(buffer);		
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
            transformer.transform(source, result);
            String results = buffer.toString(  );
            System.out.println("results\n" + results);            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String args[]) {
		try {
			System.out.println("jbpm5processdoc Test Application");
			//example();
			showJBPM5Doc();
			System.out.println("OK");
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
