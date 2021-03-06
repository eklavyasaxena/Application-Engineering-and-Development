/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminInterface.ManageUserAccountsInterface;

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
public class SearchUpdateUserAccountJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    UserAccountDirectory userAccountDirectory;

    /**
     * Creates new form SearchUpdateUserAccountJPanel
     */
    public SearchUpdateUserAccountJPanel(JPanel userProcessContainer, UserAccount userAccount, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.userAccountDirectory = userAccountDirectory;
        
        populateUserAccount();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    private void populateUserAccount(){
        
        if(userAccount.getPerson()!=null){
        
            txtObjectAssociated.setText(userAccount.getPerson().getFirstName()+" "+userAccount.getPerson().getLastName());
            txtObjectID.setText(String.valueOf(userAccount.getPerson().getPersonID()));
        }
        else{
            txtObjectAssociated.setText(userAccount.getSupplier().getSupplierName());
            txtObjectID.setText(userAccount.getSupplier().getSupplierID());
        }
        
        txtPassword.setText(userAccount.getPassword());
        txtUserID.setText(String.valueOf(userAccount.getUserID()));
        txtUserName.setText(userAccount.getUserName());
        
        if(userAccount.getStatus().compareTo("Active")==0){
            radBtnActive.setSelected(true);
            radBtnDisabled.setSelected(false);
        }
        else{
            radBtnActive.setSelected(false);
            radBtnDisabled.setSelected(true);
        }
        
        cmbRole.getModel().setSelectedItem(userAccount.getRole());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageUserAccounts = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        radBtnActive = new javax.swing.JRadioButton();
        radBtnDisabled = new javax.swing.JRadioButton();
        lblAccountStatus = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblObjectAssociated = new javax.swing.JLabel();
        lblObjectID = new javax.swing.JLabel();
        txtObjectAssociated = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtObjectID = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();

        lblManageUserAccounts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageUserAccounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUserAccounts.setText("View User Account's Details");

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setText("Password:");

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblRole.setText("Role:");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUserName.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtUserName.setEnabled(false);

        radBtnActive.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radBtnActive.setText("Active");
        radBtnActive.setEnabled(false);
        radBtnActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnActiveActionPerformed(evt);
            }
        });

        radBtnDisabled.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        radBtnDisabled.setText("Disabled");
        radBtnDisabled.setEnabled(false);
        radBtnDisabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnDisabledActionPerformed(evt);
            }
        });

        lblAccountStatus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblAccountStatus.setText("Account Status");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblObjectAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectAssociated.setText("Object Associated:");

        lblObjectID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectID.setText("Object ID:");

        txtObjectAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtObjectAssociated.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtObjectAssociated.setEnabled(false);

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserID.setText("User ID:");

        txtUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUserID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtUserID.setEnabled(false);

        txtObjectID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtObjectID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtObjectID.setEnabled(false);

        cmbRole.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales Person", "Supplier", "S&M Admin", "System Admin" }));
        cmbRole.setToolTipText("Select a Role");
        cmbRole.setEnabled(false);
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });

        txtPassword.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(111, 111, 111)
                        .addComponent(btnUpdate)
                        .addGap(33, 33, 33)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblManageUserAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblObjectID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblObjectAssociated))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtObjectAssociated, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(txtUserID)
                                        .addComponent(txtObjectID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblRole)
                                                .addComponent(lblUserName)
                                                .addComponent(lblPassword))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbRole, 0, 193, Short.MAX_VALUE)
                                                .addComponent(txtPassword))))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(radBtnActive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radBtnDisabled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblManageUserAccounts)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblAccountStatus)
                                .addGap(18, 18, 18)
                                .addComponent(radBtnActive)
                                .addGap(18, 18, 18)
                                .addComponent(radBtnDisabled))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblObjectID)
                                    .addComponent(txtObjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRole)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(106, Short.MAX_VALUE))
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

    private void radBtnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnActiveActionPerformed
        // TODO add your handling code here:
        radBtnDisabled.setSelected(false);
    }//GEN-LAST:event_radBtnActiveActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtPassword.setEnabled(true);
        if(String.valueOf(userAccount).compareTo("UA501")==0||String.valueOf(userAccount).compareTo("UA502")==0){
            System.out.println("print"+userAccount);
        }
        else{
            cmbRole.setEnabled(true);
            radBtnActive.setEnabled(true);
            radBtnDisabled.setEnabled(true);
        }
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void radBtnDisabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnDisabledActionPerformed
        // TODO add your handling code here:
        radBtnActive.setSelected(false);
    }//GEN-LAST:event_radBtnDisabledActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String pswd = txtPassword.getText();
        
        if((pswd.equals("") || !(pswd.matches("[a-zA-Z0-9]{6,}")))){
            JOptionPane.showMessageDialog(null,"Password Less than 6 Characters");
        }
        else{
            try {
                userAccount.setPassword(userAccount.hash_SHA_512_SecurePassword(pswd, "COEXIST"));

                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);

                JOptionPane.showMessageDialog(null, "User Account Updated Successfully");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(SearchUpdateUserAccountJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String s = (String)cmbRole.getSelectedItem();
            userAccount.setRole(s);
            
            if(radBtnActive.isSelected()){
                userAccount.setStatus("Active");
            }
            else{
                userAccount.setStatus("Disabled");
            }
            System.out.println(userAccount.getStatus());
            
            txtPassword.setEnabled(false);
            cmbRole.setEnabled(false);
            radBtnActive.setEnabled(false);
            radBtnDisabled.setEnabled(false);
            
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblAccountStatus;
    private javax.swing.JLabel lblManageUserAccounts;
    private javax.swing.JLabel lblObjectAssociated;
    private javax.swing.JLabel lblObjectID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton radBtnActive;
    private javax.swing.JRadioButton radBtnDisabled;
    private javax.swing.JTextField txtObjectAssociated;
    private javax.swing.JTextField txtObjectID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
