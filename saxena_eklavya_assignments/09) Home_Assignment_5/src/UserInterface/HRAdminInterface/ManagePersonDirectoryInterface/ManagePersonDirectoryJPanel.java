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
import UserInterface.SystemAdminInterface.ManageUserAccountsInterface.AddUserAccountJPanel;
import UserInterface.SystemAdminInterface.ManageUserAccountsInterface.SearchUpdateUserAccountJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class ManagePersonDirectoryJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;

    /** Creates new form ManagePersonDirectoryJPanel */
    public ManagePersonDirectoryJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.userAccountDirectory = userAccountDirectory;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblPersonList.getModel();
        dtm.setRowCount(0);
        
        for(Person person : personDirectory.getPersonList()){
            Object[] row = new Object[4];
            row[0] = person;
            row[1] = person.getFirstName();
            row[2] = person.getLastName();
            
            int check = person.getPersonID();
            for(UserAccount userAccount : userAccountDirectory.getUserList()){
                if(check==userAccount.getPerson().getPersonID()){
                    row[3] = userAccount.getUserName();
                }
            }
            
            dtm.addRow(row);
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdatePersonDetails = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        lblManagePersonDirectory = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblPersonList = new javax.swing.JTable();
        txtSearchEmployeeID = new javax.swing.JTextField();
        btnSearchPerson = new javax.swing.JButton();
        btnAddPerson = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnUpdatePersonDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdatePersonDetails.setText("View/Update Person Details >>");
        btnUpdatePersonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonDetailsActionPerformed(evt);
            }
        });

        btnDeletePerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeletePerson.setText("<< Delete the Person >>");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        lblManagePersonDirectory.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManagePersonDirectory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePersonDirectory.setText("Manage Person Directory - Work Responsibility");

        tblPersonList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person ID", "First Name", "Last Name", "First User Name *"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblPersonList);
        if (tblPersonList.getColumnModel().getColumnCount() > 0) {
            tblPersonList.getColumnModel().getColumn(0).setResizable(false);
            tblPersonList.getColumnModel().getColumn(1).setResizable(false);
            tblPersonList.getColumnModel().getColumn(2).setResizable(false);
            tblPersonList.getColumnModel().getColumn(3).setResizable(false);
        }

        txtSearchEmployeeID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchEmployeeID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchEmployeeID.setText("Enter Person ID Here");
        txtSearchEmployeeID.setToolTipText("Enter Person ID");
        txtSearchEmployeeID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearchEmployeeID.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtSearchEmployeeID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchEmployeeIDFocusGained(evt);
            }
        });
        txtSearchEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEmployeeIDActionPerformed(evt);
            }
        });

        btnSearchPerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchPerson.setText("Search Person >>");
        btnSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonActionPerformed(evt);
            }
        });

        btnAddPerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddPerson.setText("Add New Person >>");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManagePersonDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAddPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearchPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdatePersonDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeletePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblManagePersonDirectory)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchPerson)
                    .addComponent(txtSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnUpdatePersonDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDeletePerson)
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchEmployeeIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchEmployeeIDFocusGained
        // TODO add your handling code here:
        txtSearchEmployeeID.setText("");
    }//GEN-LAST:event_txtSearchEmployeeIDFocusGained

    private void btnSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonActionPerformed
        // TODO add your handling code here:
        if(txtSearchEmployeeID.getText().equals("") || !(txtSearchEmployeeID.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            Person result = personDirectory.searchPerson(Integer.valueOf(txtSearchEmployeeID.getText()));
            if(result == null){
                JOptionPane.showMessageDialog(null, "Person ID Does Not Exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                SearchUpdatePersonJPanel panel = new SearchUpdatePersonJPanel(userProcessContainer, result, personDirectory, userAccountDirectory);
                userProcessContainer.add("SearchUpdatePersonJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                
                txtSearchEmployeeID.setText("Enter Person ID Here");
            }
        }
    }//GEN-LAST:event_btnSearchPersonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmployeeIDActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel panel = new AddPersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("AddPersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnUpdatePersonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to View Details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Person person = (Person)tblPersonList.getValueAt(selectedRow, 0);
            SearchUpdatePersonJPanel panel = new SearchUpdatePersonJPanel(userProcessContainer, person, personDirectory, userAccountDirectory);
            userProcessContainer.add("SearchUpdatePersonJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdatePersonDetailsActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();
        if(selectedRow >= 0){
            Person person = (Person)tblPersonList.getValueAt(selectedRow, 0);
            if(String.valueOf(person).compareTo("1")==0||String.valueOf(person).compareTo("2")==0){
                System.out.println("print"+person);
                    JOptionPane.showMessageDialog(null, "ADMIN CANNOT BE DELETED", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to DELETE the Account?", "Warning", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    personDirectory.deletePerson(person);
                    populateTable();
                }           
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JButton btnUpdatePersonDetails;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblManagePersonDirectory;
    private javax.swing.JTable tblPersonList;
    private javax.swing.JTextField txtSearchEmployeeID;
    // End of variables declaration//GEN-END:variables

}
