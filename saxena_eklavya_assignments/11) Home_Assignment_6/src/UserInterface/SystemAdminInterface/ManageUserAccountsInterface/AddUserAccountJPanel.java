/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminInterface.ManageUserAccountsInterface;

import Business.PersonPackage.Person;
import Business.PersonPackage.PersonDirectory;
import Business.SupplierPackage.Supplier;
import Business.SupplierPackage.SupplierDirectory;
import Business.UserAccountPackage.UserAccount;
import Business.UserAccountPackage.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class AddUserAccountJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;
    SupplierDirectory supplierDirectory;
    /**
     * Creates new form AddUserAccountJPanel
     */
    public AddUserAccountJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, 
            UserAccountDirectory userAccountDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.supplierDirectory = supplierDirectory;
        
        txtObjectAssociated.setEnabled(false);
        txtUserID.setEnabled(false);
        
        radBtnActive.setSelected(true);
        radBtnDisabled.setSelected(false);
        
        populateComboBox();
    }
    
    public void populateComboBox(){
        cmbObjectID.removeAllItems();
        for(Person person : personDirectory.getPersonList()){
            String s = String.valueOf(person.getPersonID());
            cmbObjectID.addItem(s);
        }
        
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            String s = supplier.getSupplierID();
            cmbObjectID.addItem(s);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblObjectID = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblAddUserAccount = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        radBtnActive = new javax.swing.JRadioButton();
        radBtnDisabled = new javax.swing.JRadioButton();
        lblAccountStatus = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        lblObjectAssociated = new javax.swing.JLabel();
        txtObjectAssociated = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        cmbObjectID = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();

        btnAddUser.setText("Add User Account");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblObjectID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectID.setText("Object ID:");

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setText("Password:");

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblRole.setText("Role:");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUserName.setDisabledTextColor(new java.awt.Color(0, 0, 149));

        lblAddUserAccount.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblAddUserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUserAccount.setText("Add New User Account");

        cmbRole.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cmbRole.setToolTipText("Select a Role");
        cmbRole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRoleItemStateChanged(evt);
            }
        });
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });

        radBtnActive.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radBtnActive.setText("Active");
        radBtnActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnActiveActionPerformed(evt);
            }
        });

        radBtnDisabled.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radBtnDisabled.setText("Disabled");
        radBtnDisabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnDisabledActionPerformed(evt);
            }
        });

        lblAccountStatus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblAccountStatus.setText("Account Status");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblObjectAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectAssociated.setText("Object Associated:");

        txtObjectAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtObjectAssociated.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtObjectAssociated.setEnabled(false);

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserID.setText("User ID:");

        txtUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUserID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtUserID.setEnabled(false);

        cmbObjectID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbObjectIDItemStateChanged(evt);
            }
        });
        cmbObjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObjectIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbRole, 0, 193, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblObjectID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblObjectAssociated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtObjectAssociated, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(cmbObjectID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radBtnActive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radBtnDisabled, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblAddUserAccount)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAccountStatus)
                        .addGap(18, 18, 18)
                        .addComponent(radBtnActive)
                        .addGap(18, 18, 18)
                        .addComponent(radBtnDisabled))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblObjectID)
                            .addComponent(cmbObjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblObjectAssociated)
                            .addComponent(txtObjectAssociated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRole)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnAddUser))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageUserAccountsJPanel manageUserAccountsJPanel = (ManageUserAccountsJPanel) component;
        manageUserAccountsJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        
        String username = txtUserName.getText().toLowerCase();
        String pswd = txtPassword.getText();
        String objectID = (String)cmbObjectID.getSelectedItem();
        
        for(UserAccount userAccount : userAccountDirectory.getUserList()){
            if(username.compareTo(userAccount.getUserName())==0){
                JOptionPane.showMessageDialog(null, "UserName Already Exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }    
        if((username.equals("") || !(username.matches("[a-zA-Z0-9]{6,}")))||
            (pswd.equals("") || !(pswd.matches("[a-zA-Z0-9]{6,}")))){

            JOptionPane.showMessageDialog(null,"User Name / Password Less than 6 Characters");
        }
        else{
            UserAccount newUserAccount = userAccountDirectory.addUserAccount();
            try {
                newUserAccount.setPassword(newUserAccount.hash_SHA_512_SecurePassword(pswd, "COEXIST"));


                newUserAccount.setUserName(username);

                String s = (String)cmbRole.getSelectedItem();
                newUserAccount.setRole(s);

                if(radBtnActive.isSelected()){
                    newUserAccount.setStatus("Active");
                }
                else{
                    newUserAccount.setStatus("Disabled");
                }
                
                try{
                    Person person = personDirectory.searchPerson(Integer.valueOf(objectID));
                    newUserAccount.setPerson(person);
                }catch(Exception e){
                    System.err.println("Exception: " + e.getMessage());
                }
                
                    Supplier supplier = supplierDirectory.searchSupplier(objectID);
                    newUserAccount.setSupplier(supplier);

                JOptionPane.showMessageDialog(null, "User Account Created Successfully");

                txtUserName.setText("");
                txtPassword.setText("");
                radBtnActive.setSelected(true);
                radBtnDisabled.setSelected(false);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(AddUserAccountJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void cmbObjectIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbObjectIDItemStateChanged
        // TODO add your handling code here:
        cmbRole.removeAllItems();
        String s = (String)cmbObjectID.getSelectedItem();
        for(Person p : personDirectory.getPersonList()){
            if(String.valueOf(p.getPersonID()).compareTo(s)==0){
                txtObjectAssociated.setText(p.getFirstName()+" "+p.getLastName());
                cmbRole.addItem("Sales Person");
                cmbRole.addItem("S&M Admin");
                cmbRole.addItem("System Admin");
            }
        }
        
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            if(supplier.getSupplierID().compareTo(s)==0){
                txtObjectAssociated.setText(supplier.getSupplierName());
                cmbRole.addItem("Supplier");
            }
        }
    }//GEN-LAST:event_cmbObjectIDItemStateChanged

    private void radBtnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnActiveActionPerformed
        // TODO add your handling code here:
        radBtnDisabled.setSelected(false);
    }//GEN-LAST:event_radBtnActiveActionPerformed

    private void radBtnDisabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnDisabledActionPerformed
        // TODO add your handling code here:
        radBtnActive.setSelected(false);
    }//GEN-LAST:event_radBtnDisabledActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void cmbObjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObjectIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbObjectIDActionPerformed

    private void cmbRoleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRoleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoleItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbObjectID;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblAccountStatus;
    private javax.swing.JLabel lblAddUserAccount;
    private javax.swing.JLabel lblObjectAssociated;
    private javax.swing.JLabel lblObjectID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton radBtnActive;
    private javax.swing.JRadioButton radBtnDisabled;
    private javax.swing.JTextField txtObjectAssociated;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}