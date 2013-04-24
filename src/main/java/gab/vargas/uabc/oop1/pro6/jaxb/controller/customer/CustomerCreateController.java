/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro6.jaxb.controller.customer;

import gab.vargas.uabc.oop1.pro6.jaxb.controller.Controller;
import gab.vargas.uabc.oop1.pro6.jaxb.domain.Customer;
import gab.vargas.uabc.oop1.pro6.jaxb.repository.CustomerDao;
import gab.vargas.uabc.oop1.pro6.jaxb.repository.CustomerDaoJaxb;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author gvargas
 */
public class CustomerCreateController implements Controller{

    public void processRequest() {
        
        Customer customer1 = new Customer();
        
        customer1.setName("Juan");
        customer1.setAge(50);
        customer1.setId(1000);
        
        
        Customer customer2 = new Customer();
        
        customer2.setName("Pedro");
        customer2.setAge(25);
        customer2.setId(1001);
        
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        
        customerList.add(customer1);
        customerList.add(customer2);
        
        CustomerDao customerDao = new CustomerDaoJaxb();
        
        customerDao.createXml(customerList);
        
        ArrayList<Customer> customerList2 = new ArrayList<Customer>();
        
        
        customerList2 = customerDao.getXml();
        
        
        for (Iterator<Customer> it = customerList2.iterator(); it.hasNext();) {
            Customer customer = it.next();
            System.out.println(customer.toString());
        }
        
        
        
        
    }
    
    
}
