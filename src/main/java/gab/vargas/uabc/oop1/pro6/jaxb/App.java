package gab.vargas.uabc.oop1.pro6.jaxb;

import gab.vargas.uabc.oop1.pro6.jaxb.controller.Controller;
import gab.vargas.uabc.oop1.pro6.jaxb.controller.customer.CustomerCreateController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Controller customerCreateController = new CustomerCreateController();
        
        customerCreateController.processRequest();
        
    }
}
