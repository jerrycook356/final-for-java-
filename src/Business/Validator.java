/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author jerry
 */
public class Validator {
    
   public boolean isPresent(JTextComponent c , String FieldName)
   {
       if(c.getText().length() == 0)
       {
           showMessage(c,FieldName + " is a required field.");
           c.requestFocusInWindow();
           return false;
       }
       return true;
   }
   public boolean isEmail(JTextComponent c, String FieldName)
   {
       Pattern pattern;
       Matcher matcher;
       
        final String EMAIL_PATTERN = "^[A-Za-z0-9-\\+]+(.\\[_A-Za-z0-9-]+)*@"+
                "[A-Za-z0-9-]+(\\.[.A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(c.getText());
        if(matcher.matches())
            return true;
        else
            showMessage(c,"Invalid Email Address \n"
            +"should be xxxx@xxxx.com format");
        c.requestFocusInWindow();
        return false;
      
   }
   public boolean isValidNameLength(JTextComponent c,int size, String FieldName)
   {
       
       if(c.getText().length() > size)
       {
           
           showMessage(c,FieldName+" Has to be 15 characters or less");
           c.requestFocusInWindow();
           return false;
       }
      return true;
   }
   public boolean isValidEmailLength(JTextComponent c, int size, String FieldName)
   {
       if(c.getText().length() > size)
       {
           showMessage(c, FieldName +" Has to be 30 characters or less");
           c.requestFocusInWindow();
           return false;
       }
       return true;
   }
   private void showMessage(JTextComponent c, String message)
   {
       JOptionPane.showMessageDialog(c,message,"Invalid Entry",
               JOptionPane.ERROR_MESSAGE);
   }
}
