/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerCat;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class ManageAirlinersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersWorkAreaJPanel
     */
    JPanel userProcessContainer;
    AirlinerCat airlinerCat;
    
    public ManageAirlinersWorkAreaJPanel(JPanel userProcessContainer, AirlinerCat airlinerCat) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.airlinerCat = airlinerCat;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblAirliners.getModel();
        dtm.setRowCount(0);
        
        for(Airliner airliner : airlinerCat.getAirliners()){
            Object[] row = new Object[2];
            row[0] = airliner;
            row[1] = airliner.getAirlinerName();
            
            dtm.addRow(row);
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

        btnDeleteAirliner = new javax.swing.JButton();
        btnViewAirlinerProfile = new javax.swing.JButton();
        txtSearchAirlinerID = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        tblAirliners = new javax.swing.JTable();
        btnSearchAirlinerID = new javax.swing.JButton();
        lblManageAirlinersWorkArea = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddNewAirliner = new javax.swing.JLabel();
        lblAirlinerID = new javax.swing.JLabel();
        lblAirlinerName = new javax.swing.JLabel();
        txtAirlinerID = new javax.swing.JTextField();
        txtAirlinerName = new javax.swing.JTextField();
        btnAddAirliner = new javax.swing.JButton();

        btnDeleteAirliner.setText("Delete Airliner");
        btnDeleteAirliner.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDeleteAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAirlinerActionPerformed(evt);
            }
        });

        btnViewAirlinerProfile.setText("View Airliner Profile");
        btnViewAirlinerProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerProfileActionPerformed(evt);
            }
        });

        txtSearchAirlinerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAirlinerIDActionPerformed(evt);
            }
        });

        tblAirliners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner ID", "Airliner Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(tblAirliners);
        if (tblAirliners.getColumnModel().getColumnCount() > 0) {
            tblAirliners.getColumnModel().getColumn(0).setResizable(false);
            tblAirliners.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSearchAirlinerID.setText("Search & View Airliner by ID");
        btnSearchAirlinerID.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSearchAirlinerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirlinerIDActionPerformed(evt);
            }
        });

        lblManageAirlinersWorkArea.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblManageAirlinersWorkArea.setText("Manage Airliners Work Area");
        lblManageAirlinersWorkArea.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblAddNewAirliner.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAddNewAirliner.setText("Add New Airliner");

        lblAirlinerID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAirlinerID.setText("Airliner ID:");

        lblAirlinerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAirlinerName.setText("Airliner Name:");

        btnAddAirliner.setText("Add Airliner");
        btnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnViewAirlinerProfile)
                            .addGap(343, 343, 343)
                            .addComponent(btnDeleteAirliner))
                        .addComponent(scrollPane)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(278, 278, 278)
                            .addComponent(lblAddNewAirliner)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAirlinerID)
                            .addComponent(lblAirlinerName))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAirlinerName)
                            .addComponent(txtAirlinerID)
                            .addComponent(btnAddAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtSearchAirlinerID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchAirlinerID))
                    .addComponent(lblManageAirlinersWorkArea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblManageAirlinersWorkArea)
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAirlinerID)
                    .addComponent(txtSearchAirlinerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAirliner)
                    .addComponent(btnViewAirlinerProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddNewAirliner)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirlinerID)
                    .addComponent(txtAirlinerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirlinerName)
                    .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddAirliner)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAirlinerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliners.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to DELETE the Airliner?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)tblAirliners.getValueAt(selectedRow, 0);
                airlinerCat.deleteAirliner(airliner);
                
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAirlinerActionPerformed

    private void btnViewAirlinerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerProfileActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliners.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to View Details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Airliner airliner = (Airliner)tblAirliners.getValueAt(selectedRow, 0);
            ViewAirlinerProfileJPanel panel = new ViewAirlinerProfileJPanel(userProcessContainer, airliner);
            userProcessContainer.add("ViewAirlinerProfileJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewAirlinerProfileActionPerformed

    private void btnSearchAirlinerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirlinerIDActionPerformed
        // TODO add your handling code here:
        if(txtSearchAirlinerID.getText().equals("") || !(txtSearchAirlinerID.getText().matches("[a-zA-Z]+"))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            Airliner result = airlinerCat.searchAirliner(txtSearchAirlinerID.getText());
            if(result == null){
                JOptionPane.showMessageDialog(null, "Airliner ID Does Not Exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                ViewAirlinerProfileJPanel panel = new ViewAirlinerProfileJPanel(userProcessContainer, result);
                userProcessContainer.add("ViewAirlinerProfileJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnSearchAirlinerIDActionPerformed

    private void btnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinerActionPerformed
        // TODO add your handling code here:
        String airlinerID = txtAirlinerID.getText();
        String airlinerName = txtAirlinerName.getText();
        
        if((airlinerID.equals("") || !(airlinerID.matches("[a-zA-Z0-9]+")))||
                (airlinerName.equals("") || !(airlinerName.matches("[a-zA-Z]+")))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            Airliner airliner = airlinerCat.addAirliner();
            airliner.setAirlinerID(airlinerID);
            airliner.setAirlinerName(airlinerName);

            JOptionPane.showMessageDialog(null, "Airliner Created Successfully");

            txtAirlinerID.setText("");
            txtAirlinerName.setText("");
        }
        
        populateTable();
    }//GEN-LAST:event_btnAddAirlinerActionPerformed

    private void txtSearchAirlinerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAirlinerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAirlinerIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAirliner;
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnSearchAirlinerID;
    private javax.swing.JButton btnViewAirlinerProfile;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddNewAirliner;
    private javax.swing.JLabel lblAirlinerID;
    private javax.swing.JLabel lblAirlinerName;
    private javax.swing.JLabel lblManageAirlinersWorkArea;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblAirliners;
    private javax.swing.JTextField txtAirlinerID;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtSearchAirlinerID;
    // End of variables declaration//GEN-END:variables
}
