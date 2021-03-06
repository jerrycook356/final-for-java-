/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import Business.CustomerDAO;
import Business.DAOFactory;
import javax.swing.DefaultListModel;
import Business.Customer;
import Business.StringUtil;
import Business.Validator;
import java.util.*;


/**
 *
 * @author jerry
 */
public class CustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerForm
     */
    private static CustomerDAO cDAO = null;
    public DefaultListModel<String> listModel = new DefaultListModel<>() ;
    public ArrayList<Customer> newArrayList;
    public Validator val = new Validator();
    
     
    public CustomerForm() {
        cDAO = DAOFactory.getCustomerDAO();
        initComponents();   
        buttonGroup();
        setListModel();
       
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        UpdateButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        HelpButton = new javax.swing.JToggleButton();
        ExitButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerList = new javax.swing.JList<>();
        UpButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SortButton = new javax.swing.JButton();
        AscendingRadioButton = new javax.swing.JRadioButton();
        DescendingRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpdateButton.setMnemonic('p');
        UpdateButton.setText("Update");
        UpdateButton.setToolTipText("Update customer information");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ListButton.setMnemonic('L');
        ListButton.setText("List");
        ListButton.setToolTipText("Display customers");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        AddButton.setMnemonic('a');
        AddButton.setText("Add");
        AddButton.setToolTipText("Add a new customer");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setMnemonic('d');
        DeleteButton.setText("Delete");
        DeleteButton.setToolTipText("Remove a customer");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        HelpButton.setMnemonic('h');
        HelpButton.setText("Help");
        HelpButton.setToolTipText("Command help");
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });

        ExitButton.setMnemonic('x');
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Email Address: ");

        EmailTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name: ");

        FirstNameTextField.setEnabled(false);

        LastNameTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name: ");

        OkButton.setMnemonic('o');
        OkButton.setText("OK");
        OkButton.setEnabled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        CancelButton.setMnemonic('c');
        CancelButton.setText("Cancel");
        CancelButton.setEnabled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CustomerList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(CustomerList);

        UpButton.setMnemonic('u');
        UpButton.setText("Update");
        UpButton.setEnabled(false);
        UpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cook's Record Keeper");

        SortButton.setMnemonic('s');
        SortButton.setText("Sort:");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });

        AscendingRadioButton.setText("Ascending: ");

        DescendingRadioButton.setText("Descending: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sort by email address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescendingRadioButton)
                                    .addComponent(AscendingRadioButton)
                                    .addComponent(SortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(133, 133, 133)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(27, 27, 27)
                                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AscendingRadioButton)
                                        .addGap(35, 35, 35)
                                        .addComponent(DescendingRadioButton)
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31)
                                        .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(SortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void buttonGroup()
    {
        ButtonGroup sort = new ButtonGroup();
        sort.add(AscendingRadioButton);
        sort.add(DescendingRadioButton);
    }
   
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Thank you for using, Goodbye");
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:

        ListButton.setEnabled(false);
        UpdateButton.setEnabled(false);
        DeleteButton.setEnabled(false);
        HelpButton.setEnabled(false);
        ExitButton.setEnabled(false);
        
        
        OkButton.setEnabled(true);
        CancelButton.setEnabled(true);
        EmailTextField.setEnabled(true);
        FirstNameTextField.setEnabled(true);
        LastNameTextField.setEnabled(true);
        
      
       
            
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        if (!CustomerList.isSelectionEmpty()) {
            ListButton.setEnabled(false);
            AddButton.setEnabled(false);
            DeleteButton.setEnabled(false);
            HelpButton.setEnabled(false);
            ExitButton.setEnabled(false);
            UpdateButton.setEnabled(false);

            OkButton.setEnabled(false);
            CancelButton.setEnabled(true);
            //EmailTextField.setEnabled(true);
            FirstNameTextField.setEnabled(true);
            LastNameTextField.setEnabled(true);
            UpButton.setEnabled(true);

            ArrayList<Customer> updateArray = cDAO.getCustomers();

            int i = CustomerList.getSelectedIndex();
            Customer c = updateArray.get(i);
            EmailTextField.setText(c.getEmail());
            FirstNameTextField.setText(c.getFirstName());
            LastNameTextField.setText(c.getLastName());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You must select customer to update");
        }
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Customer> deleteArray = cDAO.getCustomers();
        if (!CustomerList.isSelectionEmpty()) {
            int i = CustomerList.getSelectedIndex();
            Customer c = deleteArray.get(i);
            cDAO.deleteCustomer(deleteArray.get(i));

            setListModel();
            CustomerList.setModel(listModel);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Must select a customer to delete.");
        }
       
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"List - press to refresh the list of customers"+
                "currently saved \n"+"Add - press to enable edit fields to add a customer \n"+
                "Update - Select customer in list then press update to update names information "+
                "\n"
                + "Delete - Select customer in list then press delete to remove customer information"+
                "\nExit - exit the program\n"
                +"Sort - will sort the display according to which radio button is selected");
        
        HelpButton.setEnabled(true);
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        // TODO add your handling code here:
      // listModel.removeAllElements();
      // CustomerList.setModel(listModel);
         setListModel();
         CustomerList.setModel(listModel);
    }//GEN-LAST:event_ListButtonActionPerformed
    public void setListModel()
    {
       listModel.removeAllElements();
       CustomerList.setModel(listModel);
       
        newArrayList = cDAO.getCustomers();
        
       
             for(Customer c : newArrayList)
             {
                 String a = (c.getEmail()+"    "+c.getFirstName()+"    "+
                 c.getLastName());
                 listModel.addElement(a);
             }
             CustomerList.setModel(listModel);                
    }
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        EmailTextField.setText("");
        FirstNameTextField.setText("");
        LastNameTextField.setText("");
        
        EmailTextField.setEnabled(false);
        FirstNameTextField.setEnabled(false);
        LastNameTextField.setEnabled(false);
       // OkButton.setEnabled(false);
        CancelButton.setEnabled(false);
        
        ListButton.setEnabled(true);
        AddButton.setEnabled(true);
        UpdateButton.setEnabled(true);
        DeleteButton.setEnabled(true);
        HelpButton.setEnabled(true);
        ExitButton.setEnabled(true);
        
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        // TODO add your handling code here:
        String email = EmailTextField.getText();
        String firstName = FirstNameTextField.getText();
        String lastName = FirstNameTextField.getText();
        if(isValidData())
        {
        Customer c = new Customer(email,firstName,lastName);
        cDAO.addCustomer(c);
        setListModel();

        ListButton.setEnabled(true);
        AddButton.setEnabled(true);
        UpdateButton.setEnabled(true);
        DeleteButton.setEnabled(true);
        HelpButton.setEnabled(true);
        ExitButton.setEnabled(true);
        OkButton.setEnabled(false);
        CancelButton.setEnabled(false);
        EmailTextField.setEnabled(false);
        FirstNameTextField.setEnabled(false);
        LastNameTextField.setEnabled(false);

        EmailTextField.setText("");
        FirstNameTextField.setText("");
        LastNameTextField.setText("");
        }

    }//GEN-LAST:event_OkButtonActionPerformed

    private void UpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpButtonActionPerformed
        // TODO add your handling code here:
      String email = EmailTextField.getText();
      String first = FirstNameTextField.getText();
      String last = LastNameTextField.getText();
      if(isValidData())
      {
      Customer c = new Customer(email,first,last);
      cDAO.updateCustomer(c);
       
       setListModel();
       CustomerList.setModel(listModel);
       
       UpdateButton.setEnabled(true);
       ExitButton.setEnabled(true);
       AddButton.setEnabled(true);
       ListButton.setEnabled(true);
       DeleteButton.setEnabled(true);
       HelpButton.setEnabled(true);
       UpButton.setEnabled(false);
       OkButton.setEnabled(false);
       CancelButton.setEnabled(false);
       FirstNameTextField.setEnabled(false);
       LastNameTextField.setEnabled(false);
       
       EmailTextField.setText("");
       FirstNameTextField.setText("");
       LastNameTextField.setText("");
      }
    }//GEN-LAST:event_UpButtonActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Customer> sortArrayList = new ArrayList<>();
        ArrayList<Customer> customers = cDAO.getCustomers();
        for(Customer c: customers)
        {
            sortArrayList.add(c);
        }
        if(AscendingRadioButton.isSelected())
        {
            Collections.sort(sortArrayList);             
            cDAO.updateArrayList(sortArrayList);         
        }   
        if(DescendingRadioButton.isSelected())
        {
            Collections.reverse(sortArrayList);
            cDAO.updateArrayList(sortArrayList);
        }
        
        setListModel();
        CustomerList.setModel(listModel);
    }//GEN-LAST:event_SortButtonActionPerformed
    
    public boolean isValidData()
    {
        return 
                val.isPresent(EmailTextField,"Email Address:")&&
                val.isPresent(FirstNameTextField,"First Name:")&&
                val.isPresent(LastNameTextField,"Last Name:")&&
                val.isEmail(EmailTextField, "Email Address:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new CustomerForm().setVisible(true);
               CustomerForm form = new CustomerForm();
               form.setVisible(true);
               form.setLocationRelativeTo(null);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JRadioButton AscendingRadioButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JList<String> CustomerList;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JRadioButton DescendingRadioButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JToggleButton HelpButton;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JButton ListButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton SortButton;
    private javax.swing.JButton UpButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
