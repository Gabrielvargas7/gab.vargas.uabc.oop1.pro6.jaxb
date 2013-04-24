/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro6.jaxb.domain;

/**
 *
 * @author gvargas
 */
public class Customer {
    
    String name;
    int age;
    int id;

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        String s ="Name: "+this.name+" Age: "+this.age+" Id: "+this.id;
        return s;
    }
   
    
    
        
        
    
}
