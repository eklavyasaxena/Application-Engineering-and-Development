/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = network;
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deleteJButton1 = new javax.swing.JButton();
        updateJButton2 = new javax.swing.JButton();
        passwordStrengthTextField = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 229));

        enterpriseJTable.setBackground(new java.awt.Color(255, 203, 203));
        enterpriseJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Username");

        usernameJTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        submitJButton.setBackground(new java.awt.Color(137, 255, 137));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submitJButton.setText("Add Admin");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Password");

        nameJTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Name");

        passwordJPasswordField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        passwordJPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordJPasswordFieldKeyReleased(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(203, 203, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Enterprise Admin Menu");

        deleteJButton1.setBackground(new java.awt.Color(255, 138, 138));
        deleteJButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteJButton1.setText("Select & Delete Admin");
        deleteJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButton1ActionPerformed(evt);
            }
        });

        updateJButton2.setBackground(new java.awt.Color(255, 138, 138));
        updateJButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateJButton2.setText("Select & Update Admin");
        updateJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButton2ActionPerformed(evt);
            }
        });

        passwordStrengthTextField.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backJButton)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateJButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passwordStrengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(deleteJButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteJButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateJButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordStrengthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        try {
            Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
            
            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            
            
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            
            if((username.equals("") || !(username.matches("[a-zA-Z0-9]+")))||
                    (password.equals("") || !(password.matches("[a-zA-Z0-9]+")))||
                      (name.equals("") || !(name.matches("[a-zA-Z]+")))){
                
                JOptionPane.showMessageDialog(null,"Only User Name & Password Can Be AlphaNumeric.");
            }
            else{
                String pswd = enterprise.getUserAccountDirectory().hash_SHA_512_SecurePassword(password, "ALERT");
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, pswd, employee, new AdminRole(),system);
                if(account == null){
                    JOptionPane.showMessageDialog(null, "User name already Exists");
                }
            }
            
            populateTable();
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ManageEnterpriseAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void deleteJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButton1ActionPerformed

        int selectRow = (Integer) enterpriseJTable.getSelectedRow();
        
        if(selectRow < 0) {
         JOptionPane.showMessageDialog(null, "please select any row from the first table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        UserAccount useraccount = (UserAccount) enterpriseJTable.getValueAt(selectRow,2);
        
        Network net = new Network();
        Enterprise enterprise = system.getEnterprise(useraccount);
       
        for(Network network : system.getNetworkList()){
            for(Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()){
                for( UserAccount useract : en.getUserAccountDirectory().getUserAccountList())
                if(useraccount == useract){
                    net = network;
                    enterprise = en;
                    break;          // if we don't use it then it will give us concurrent modification exception
                }   
            }
        }
        
        
        enterprise.getUserAccountDirectory().deleteUserAccount(useraccount);
        populateTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteJButton1ActionPerformed

    private void updateJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButton2ActionPerformed

          
        int selectRow = (Integer) enterpriseJTable.getSelectedRow();

        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "please select any row from the first table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        UserAccount useraccount = (UserAccount) enterpriseJTable.getValueAt(selectRow, 2);

        Network net = new Network();
        Enterprise enterprise = system.getEnterprise(useraccount);

        for (Network network : system.getNetworkList()) {
            for (Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount useract : en.getUserAccountDirectory().getUserAccountList()) {
                    if (useraccount == useract) {
                        net = network;
                        enterprise = en;
                        break;          // if we don't use it then it will give us concurrent modification exception
                    }
                }
            }
        }

      //  enterprise.getUserAccountDirectory().deleteUserAccount(useraccount);
       
        try {
            Enterprise enterp = (Enterprise) enterpriseJComboBox.getSelectedItem();

            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();

            Employee employee = enterp.getEmployeeDirectory().createEmployee(name);

            if ((username.equals("") || !(username.matches("[a-zA-Z0-9]+")))
                    || (password.equals("") || !(password.matches("[a-zA-Z0-9]+")))
                    || (name.equals("") || !(name.matches("[a-zA-Z]+")))) {

                JOptionPane.showMessageDialog(null, "Only User Name & Password Can Be AlphaNumeric.");
            } else {
                String pswd = enterprise.getUserAccountDirectory().hash_SHA_512_SecurePassword(password, "ALERT");
                UserAccount accou = enterprise.getUserAccountDirectory().updateUserAccount(useraccount,username,pswd, employee, new AdminRole(), system);
                if (accou == null) {
                    JOptionPane.showMessageDialog(null, "User name already Exists");
                }
            }

            populateTable();

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ManageEnterpriseAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        populateTable();


        // TODO add your handling code here:
    }//GEN-LAST:event_updateJButton2ActionPerformed

    private void passwordJPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldKeyReleased
        System.out.println(passwordJPasswordField.getText());   
        if(passwordJPasswordField.getText().matches("[a-z]{0,1}")){
            passwordStrengthTextField.setText("Password must be atleat 2 Characters");
         }
         else if(passwordJPasswordField.getText().matches("[a-z]{2,}")){
            passwordStrengthTextField.setText("Very weak");
    }
         else if(passwordJPasswordField.getText().matches("[a-zA-Z]{2,}")){
            passwordStrengthTextField.setText("weak");
    }
         else if(passwordJPasswordField.getText().matches("[a-zA-Z0-9]{2,}")){
            passwordStrengthTextField.setText("Strong");
        }
         else if(passwordJPasswordField.getText().matches("[a-zA-Z0-9]{2,}")){
            passwordStrengthTextField.setText("Strong");
        }
        
        
    }//GEN-LAST:event_passwordJPasswordFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton1;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JLabel passwordStrengthTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateJButton2;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
