/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro6.jaxb.domain.jaxbhelper;

import gab.vargas.uabc.oop1.pro6.jaxb.domain.Customer;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gvargas
 */

@XmlRootElement(namespace="gab.vargas.uabc.oop1.pro6.jaxb.domain.jaxbhelper")
public class CustomerJaxbHelper {
    
    private ArrayList<Customer> customerList;

    public CustomerJaxbHelper() {
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
}
