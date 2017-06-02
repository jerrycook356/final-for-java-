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
import java.util.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jerry
 */
public class CustomerTextFile  extends Exception implements CustomerDAO {
    private ArrayList<Customer> customers = null;
    private Path customerPath = null;
    private File customerFile = null;
    
    private final String FIELD_SEP = "\t";
    
    public CustomerTextFile()
    {
        customerPath = Paths.get("customers.txt");
        customerFile = customerPath.toFile();
        customers = new ArrayList<>();
        
    }
    public ArrayList<Customer> getCustomers()
    {
        
       
        customers = new ArrayList<>();
        if(Files.exists(customerPath))
        {
            try(BufferedReader in = new BufferedReader(
            new FileReader(customerFile)))
            {
                //fill arraylist
                String line = in.readLine();
                
                while(line != null)
                {
                    String[] parts = line.split(FIELD_SEP);
                    String email = parts[0];
                    String firstName = parts[1];
                    String lastName = parts[2];
                    
                    Customer c = new Customer(email,firstName,lastName);
                    
                    customers.add(c);                    
                    line = in.readLine();                  
                    
                }
            }
            catch(IOException e)
            {
                System.err.println(e);              
            }
            
        }
       return customers;
    }

    @Override
    public Customer getCustomer(String email) {
        for(Customer c : customers)
        {
            if(c.getEmail().equals(email))
                return c;
        }
        return null;
    }
    public boolean saveCustomer()
    {
        try(PrintWriter out = new PrintWriter(
        new BufferedWriter(new FileWriter(customerFile))))
        {
            //write array
            for(Customer c: customers)
            {
                out.print(c.getEmail()+FIELD_SEP);
                out.print(c.getFirstName()+FIELD_SEP);
                out.println(c.getLastName()+FIELD_SEP);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);   
        }
        return true;
    }

    @Override
    public boolean addCustomer(Customer c) {
       customers.add(c);
       return this.saveCustomer();
    }

    @Override
    public boolean updateCustomer(Customer c) {
       //remove old info
       Customer oldCustomer = this.getCustomer(c.getEmail());
       int i = customers.indexOf(oldCustomer);
       customers.remove(i);
       //add new
       customers.add(i,c);
       return this.saveCustomer();
    }

    @Override
    public boolean deleteCustomer(Customer c) {
       customers.remove(c);
       return this.saveCustomer();
    }
    
    @Override
    public void updateArrayList(ArrayList<Customer> newList)
    {
        
        customers.clear();
        for(Customer c: newList)
            addCustomer(c);
        
    }
}
