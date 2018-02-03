/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Manufacture;

import userinterface.InventoryClerk.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InventoryClerkOrganization;
import Business.Organization.ManufactureInventoryClerkOrganization;
import Business.Organization.PharmacistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccinationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManufactureRequestWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ManufactureInventoryClerkOrganization labOrganization;
    private Enterprise enterprise;
    private Network network;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public ManufactureRequestWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Network network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.labOrganization = (ManufactureInventoryClerkOrganization)organization;
        this.network = network;
        populatenetworkTable();
        try{
            populatenetworkTable();
            
        }
        catch(Exception e){
            System.out.println("Network Request not there");
            
        }
        try{
            populateEcoRequests();
            
        }
        catch(Exception e){
            System.out.println("Network Reuest not there");
            
        }
        
    }
    public void populateEcoRequests() {
        DefaultTableModel model = (DefaultTableModel)ecoWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
            if(business.getEnterprise(request.getSender())!=enterprise){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getQuantity();
                String sender = business.getEnterprise(userAccount).getName()+","+business.getNetwork(userAccount);
                row[2] = sender;
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[4] = request.getStatus();

                model.addRow(row);
            }
            
        }
    }
    
    public void populatenetworkTable(){
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ecoWorkRequestJTable = new javax.swing.JTable();
        networkAssignJButton = new javax.swing.JButton();
        refreshJButton1 = new javax.swing.JButton();
        networkProcessJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manufacture Inventory Clerk Work Area");

        ecoWorkRequestJTable.setBackground(new java.awt.Color(255, 203, 203));
        ecoWorkRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ecoWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Quantity", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ecoWorkRequestJTable);
        if (ecoWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            ecoWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            ecoWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            ecoWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            ecoWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            ecoWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        networkAssignJButton.setBackground(new java.awt.Color(203, 203, 255));
        networkAssignJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        networkAssignJButton.setText("Assign to Me");
        networkAssignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkAssignJButtonActionPerformed(evt);
            }
        });

        refreshJButton1.setBackground(new java.awt.Color(203, 203, 255));
        refreshJButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshJButton1.setText("Refresh");
        refreshJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton1ActionPerformed(evt);
            }
        });

        networkProcessJButton.setBackground(new java.awt.Color(203, 203, 255));
        networkProcessJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        networkProcessJButton.setText("Process");
        networkProcessJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkProcessJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vaccine Request from Ecosystem");

        backButton.setBackground(new java.awt.Color(203, 203, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(networkAssignJButton)
                        .addGap(18, 18, 18)
                        .addComponent(refreshJButton1)
                        .addGap(18, 18, 18)
                        .addComponent(networkProcessJButton)
                        .addGap(383, 767, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkAssignJButton)
                    .addComponent(networkProcessJButton)
                    .addComponent(refreshJButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkAssignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkAssignJButtonActionPerformed
        int selectedRow = ecoWorkRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)ecoWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        try{
            populatenetworkTable();
            
        }
        catch(Exception e){
            System.out.println("Network Request not there");
            
        }
        try{
            populateEcoRequests();
            
        }
        catch(Exception e){
            System.out.println("Network Reuest not there");
            
        }
    }//GEN-LAST:event_networkAssignJButtonActionPerformed

    private void refreshJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshJButton1ActionPerformed

    private void networkProcessJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkProcessJButtonActionPerformed
         int selectedRow = ecoWorkRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        VaccinationRequest request = (VaccinationRequest)ecoWorkRequestJTable.getValueAt(selectedRow, 0);
     
        //request.setStatus("Processing");
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_networkProcessJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable ecoWorkRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton networkAssignJButton;
    private javax.swing.JButton networkProcessJButton;
    private javax.swing.JButton refreshJButton1;
    // End of variables declaration//GEN-END:variables

    
}
