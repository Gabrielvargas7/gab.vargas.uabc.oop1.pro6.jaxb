/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro6.jaxb.repository;

import gab.vargas.uabc.oop1.pro6.jaxb.domain.Customer;
import java.util.ArrayList;

/**
 *
 * @author gvargas
 */
public interface CustomerDao {
    
    public void createXml(ArrayList<Customer> customerList);
    public ArrayList<Customer> getXml();
    
    
}
