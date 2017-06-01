/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author jerry
 */
public class Customer {
    
    String email;
    String firstName;
    String lastName;
    
    public Customer(String email, String firstName, String lastName)
    {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
   
    
}
