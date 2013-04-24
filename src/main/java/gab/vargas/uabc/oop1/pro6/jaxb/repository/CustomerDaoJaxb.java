/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro6.jaxb.repository;

import gab.vargas.uabc.oop1.pro6.jaxb.domain.Customer;
import gab.vargas.uabc.oop1.pro6.jaxb.domain.jaxbhelper.CustomerJaxbHelper;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author gvargas
 */
public class CustomerDaoJaxb implements CustomerDao{

   private static final String CUSTOMER = "./src/main/resources/jaxb/CUSTOMER.xml";
   private JAXBContext  jaxbContext;
   private CustomerJaxbHelper customerJaxbHelper = new CustomerJaxbHelper();


   
   

    
   public void createXml(ArrayList<Customer> customerList) {
        
      try{
            customerJaxbHelper.setCustomerList(customerList);
            jaxbContext = JAXBContext.newInstance(CustomerJaxbHelper.class);
            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(customerJaxbHelper, System.out);
            
            m.marshal(customerJaxbHelper, new File(CUSTOMER));
             m.marshal(customerJaxbHelper, System.out);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    
   }

    public ArrayList<Customer> getXml() {
        
       ArrayList<Customer> customerList = new ArrayList<Customer>();
       try{
            jaxbContext = JAXBContext.newInstance(CustomerJaxbHelper.class);
        
            Unmarshaller um = jaxbContext.createUnmarshaller();
            customerJaxbHelper = (CustomerJaxbHelper) um.unmarshal(new FileReader(CUSTOMER));
            customerList = customerJaxbHelper.getCustomerList();
            
        }
        catch (Exception e){
        }

        return customerList;
        
        
    }

    
    
}
