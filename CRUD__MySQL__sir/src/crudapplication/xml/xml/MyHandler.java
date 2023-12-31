/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapplication.xml.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    // List to hold Employees object
    private List<Employee> empList = null;
    private Employee emp = null;
    private Address address = null;
    private StringBuilder data = null;

    // getter method for employee list
    public List<Employee> getEmpList() {
        return empList;
    }

    boolean bAge = false;
    boolean bName = false;
    boolean bGender = false;
    boolean bRole = false;
    boolean bAddressName = false;
    boolean bpostcode = false;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("---");
        System.out.println(qName);
        System.out.println("---");

        if (qName.equalsIgnoreCase("Employee")) {
            // create a new Employee and put it in Map
            String id = attributes.getValue("id");
            // initialize Employee object and set id attribute
            emp = new Employee();
            address = new Address();
            emp.setId(Integer.parseInt(id));
            // initialize list
            if (empList == null) {
                empList = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("name")) {
            // set boolean values for fields, will be used in setting Employee variables
            bName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            bGender = true;
        } else if (qName.equalsIgnoreCase("role")) {
            bRole = true;
        }else if (qName.equalsIgnoreCase("addressName")) {
            bAddressName = true;
        }else if (qName.equalsIgnoreCase("postcode")) {
            bpostcode = true;
        }
        // create the data container
        data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (bAge) {
            // age element, set Employee age
            emp.setAge(Integer.parseInt(data.toString()));
            bAge = false;
        } else if (bName) {
            emp.setName(data.toString());
            bName = false;
        } else if (bRole) {
            emp.setRole(data.toString());
            bRole = false;
        } else if (bGender) {
            emp.setGender(data.toString());
            bGender = false;
        }else if (bAddressName) {
            address.setAddressName(data.toString());
            bAddressName = false;
        }else if (bpostcode) {
            address.setPostCode(data.toString());
            bpostcode = false;
        }

        if (qName.equalsIgnoreCase("address")) {
            emp.setAddress(address);
        }
        
        if (qName.equalsIgnoreCase("Employee")) {
            empList.add(emp);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }
}
