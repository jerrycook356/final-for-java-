/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

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
  // public boolean isEmail(JTextComponent c, String FieldName)
   {
      // if(c.getText()
   }
   private void showMessage(JTextComponent c, String message)
   {
       JOptionPane.showMessageDialog(c,message,"Invalid Entry",
               JOptionPane.ERROR_MESSAGE);
   }
}
