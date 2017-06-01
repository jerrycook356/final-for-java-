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
       
        String EMAIL_PATTERN = "^[A-Za-z0-9-\\+]+(.\\[_A-Za-z0-9-]+)*@"+
                "[A-Za-z0-9-]+(\\.[.A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(c.getText());
        if(matcher.matches())
            return true;
        else
            showEmailMessage(c,"Invalid Email Address");
        return false;
      
   }
   private void showMessage(JTextComponent c, String message)
   {
       JOptionPane.showMessageDialog(c,message,"Invalid Entry",
               JOptionPane.ERROR_MESSAGE);
   }
   private void showEmailMessage(JTextComponent c, String message)
   {
       JOptionPane.showMessageDialog(c,message + " \n "
               + "please use email format xxxx@xxx.xxx");
   }
}
