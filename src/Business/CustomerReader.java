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
import java.util.ArrayList;
public interface CustomerReader {
    
    public Customer getCustomer(String email);
    public ArrayList<Customer> getCustomers();    
}
