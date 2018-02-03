/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HRAdminInterface.ManagePersonDirectoryInterface;

import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class SearchUpdatePersonJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Person person;
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;

    /**
     * Creates new form SearchUpdatePersonJPanel
     */
    public SearchUpdatePersonJPanel(JPanel userProcessContainer, Person person, PersonDirectory personDirectory, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.personDirectory = personDirectory;
        this.userAccountDirectory = userAccountDirectory;
        
        populateTable();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        populatePerson();
    }
    
    private void populatePerson(){
        txtEmail.setText(person.getEmail());
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtPersonID.setText(String.valueOf(person.getPersonID()));
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblUserName.getModel();
        dtm.setRowCount(0);
        
        int check = person.getPersonID();
        for(UserAccount userAccount : userAccountDirectory.getUserList()){
            if(check==userAccount.getPerson().getPersonID()){
                Object[] row = new Object[1];
                row[0] = userAccount.getUserName();
                dtm.addRow(row);
            }
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

        btnBack = new javax.swing.JButton();
        txtPersonID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblManageUserAccounts = new javax.swing.JLabel();
        lblPersonAssociated = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        lblUserName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserName = new javax.swing.JTable();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPersonID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPersonID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtPersonID.setEnabled(false);

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtFirstName.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtFirstName.setEnabled(false);

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtLastName.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtLastName.setEnabled(false);

        lblManageUserAccounts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageUserAccounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUserAccounts.setText("View Person's Details");

        lblPersonAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPersonAssociated.setText("Person ID:");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setText("First Name:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setText("Last Name:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblUserName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserNames Linked"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserName);
        if (tblUserName.getColumnModel().getColumnCount() > 0) {
            tblUserName.getColumnModel().getColumn(0).setResizable(false);
        }

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtEmail.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblManageUserAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPersonAssociated)
                                    .addGap(108, 108, 108)
                                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUserName)
                                        .addComponent(lblPassword)
                                        .addComponent(btnBack))
                                    .addGap(99, 99, 99)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnUpdate)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblManageUserAccounts)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonAssociated)
                            .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePersonDirectoryJPanel panel = (ManagePersonDirectoryJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtEmail.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String fname = txtFirstName.getText();
        String lname = txtLastName.getText();
        
        if((email.equals("") || !(email.matches("[0-9a-zA-Z@.]+")))||
                (fname.equals("") || !(fname.matches("[a-zA-Z]+")))||
                (lname.equals("") || !(lname.matches("[a-zA-Z]+")))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            person.setEmail(email);
            person.setFirstName(fname);
            person.setLastName(lname);

            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            
            txtEmail.setEnabled(false);
            txtFirstName.setEnabled(false);
            txtLastName.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Person Details Updated Successfully");
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblManageUserAccounts;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPersonAssociated;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUserName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPersonID;
    // End of variables declaration//GEN-END:variables
}
