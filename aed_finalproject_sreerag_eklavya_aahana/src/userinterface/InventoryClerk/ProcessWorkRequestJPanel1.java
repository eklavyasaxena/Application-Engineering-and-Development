/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryClerk;

import userinterface.Manufacture.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryDirectory;
import Business.Inventory.InventoryItem;
import userinterface.InventoryClerk.*;
import Business.WorkQueue.VaccinationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel1 extends javax.swing.JPanel {

    JPanel userProcessContainer;
    VaccinationRequest request;
    EcoSystem business;
    InventoryDirectory cart;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel1(JPanel userProcessContainer, VaccinationRequest request, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.business= business;
        this.cart = new InventoryDirectory();
        enterprisejTextField.setText(business.getEnterprise(request.getSender()).getName());
        quantityrequiredjTextField.setText(String.valueOf(request.getQuantity()));
        vaccinerequiredjTextField.setText(String.valueOf(request.getVaccination().getName()));
        if(request.getTansactionStatus()>1){
            jLabel6.setVisible(false);
            sellingPricejTextField.setVisible(false);
            jLabel10.setVisible(false);
            quantityjSpinner.setVisible(false);
            addItemjButton.setVisible(false);
            removeItemjButton.setVisible(false);
            submitJButton.setVisible(false);
        }
        populateAvailabletable();
        try{
            populateAvailableCarttable();
        }
        catch(Exception e){
            
        }
    }
    public void populateAvailabletable(){
        DefaultTableModel model = (DefaultTableModel)inverntoryJTable.getModel();
        Enterprise ent = business.getEnterprise(business.getCurrentUser());
        model.setRowCount(0);
        System.out.println(request.getVaccination().getName());
        for(InventoryItem items : ent.getInventoryDirectory().getInventoryDirectory()){
            System.out.println(items.getVacination().getName());
            if(items.getVacination().getName().equals(request.getVaccination().getName())){
                Object[] row = new Object[8];
                row[0] = items;
                row[1] = items.getVacination().getName();
                row[2] = items.getVacination().getManufacturingDate();
                row[3] = items.getVacination().getExpiryDate();
                row[4] = items.getVacination().getBatchNo();
                row[5] = items.getQuantity();
                if(cart.getInventoryDirectory().size()>0){
                    int f =0;
                    for(InventoryItem i : cart.getInventoryDirectory()){
                        
                        
                        if(items.getVacination()==i.getVacination()){
                            row[6] = items.getQuantity()-i.getQuantity();
                            f=1;
                        }
                        
                    }
                    
                    if(f==0){
                        row[6] = items.getQuantity();
                    }
                }
                else{
                    row[6] = items.getQuantity();
                }
                System.out.println(items.getVacination());
                System.out.println(request.getVaccination());
                    model.addRow(row);
                
            }
            
        }
    }
    public void populateAvailableCarttable(){
        DefaultTableModel model = (DefaultTableModel)inverntoryCartJTable.getModel();
        Enterprise ent = business.getEnterprise(business.getCurrentUser());
        model.setRowCount(0);
        double price = 0;
        if(request.getTansactionStatus()>1){
            for(InventoryItem items : request.getCart().getInventoryDirectory()){
                Object[] row = new Object[8];
                row[0] = items;
                row[1] = items.getVacination().getName();
                row[2] = items.getVacination().getManufacturingDate();
                row[3] = items.getVacination().getExpiryDate();
                row[4] = items.getVacination().getBatchNo();
                row[5] = items.getQuantity();
                row[6] = items.getPrice();
                row[7] = items.getPrice()*items.getQuantity();
                price += items.getPrice()*items.getQuantity();
                model.addRow(row);
                
            }
            totaljTextField.setText(String.valueOf(price));
        }
        else{
            for(InventoryItem items : cart.getInventoryDirectory()){
                Object[] row = new Object[8];
                row[0] = items;
                row[1] = items.getVacination().getName();
                row[2] = items.getVacination().getManufacturingDate();
                row[3] = items.getVacination().getExpiryDate();
                row[4] = items.getVacination().getBatchNo();
                row[5] = items.getQuantity();
                row[6] = items.getPrice();
                row[7] = items.getPrice()*items.getQuantity();
                price += items.getPrice()*items.getQuantity();
                model.addRow(row);
                
            }
            totaljTextField.setText(String.valueOf(price));
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

        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vaccinerequiredjTextField = new javax.swing.JTextField();
        quantityrequiredjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enterprisejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inverntoryJTable = new javax.swing.JTable();
        quantityjSpinner = new javax.swing.JSpinner();
        addItemjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inverntoryCartJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        sellingPricejTextField = new javax.swing.JTextField();
        removeItemjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totaljTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(203, 203, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submitJButton.setText("Send to requester");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Process Vaccine Request");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Vaccine Required:");

        vaccinerequiredjTextField.setEditable(false);
        vaccinerequiredjTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        vaccinerequiredjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinerequiredjTextFieldActionPerformed(evt);
            }
        });

        quantityrequiredjTextField.setEditable(false);
        quantityrequiredjTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        quantityrequiredjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityrequiredjTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Quantity Required:");

        enterprisejTextField.setEditable(false);
        enterprisejTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        enterprisejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisejTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Requesting Enterprise :");

        inverntoryJTable.setBackground(new java.awt.Color(255, 203, 203));
        inverntoryJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inverntoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Id", "Vaccine Name", "Manufacturign Date", "Expiry Date", "Batch Number", "Quantity", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inverntoryJTable);
        if (inverntoryJTable.getColumnModel().getColumnCount() > 0) {
            inverntoryJTable.getColumnModel().getColumn(0).setResizable(false);
            inverntoryJTable.getColumnModel().getColumn(1).setResizable(false);
            inverntoryJTable.getColumnModel().getColumn(2).setResizable(false);
            inverntoryJTable.getColumnModel().getColumn(5).setResizable(false);
            inverntoryJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        quantityjSpinner.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        addItemjButton.setBackground(new java.awt.Color(137, 255, 137));
        addItemjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addItemjButton.setText("Add Item to Cart");
        addItemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemjButtonActionPerformed(evt);
            }
        });

        inverntoryCartJTable.setAutoCreateRowSorter(true);
        inverntoryCartJTable.setBackground(new java.awt.Color(255, 203, 203));
        inverntoryCartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Id", "Vaccine Name", "Manufacturign Date", "Expiry Date", "Batch Number", "Quantity", "Cost Per tiem", "Total Item cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(inverntoryCartJTable);

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Selling Price : ");

        sellingPricejTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        removeItemjButton.setBackground(new java.awt.Color(255, 138, 138));
        removeItemjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        removeItemjButton.setText("Remove from Cart");
        removeItemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemjButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Total Selling Price : ");

        totaljTextField.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Only Vaccine in Allowable Expiry Date listed:");

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cart:");

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterprisejTextField))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vaccinerequiredjTextField)
                            .addComponent(quantityrequiredjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sellingPricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addItemjButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(removeItemjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vaccinerequiredjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(quantityrequiredjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(enterprisejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemjButton)
                    .addComponent(sellingPricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeItemjButton)
                    .addComponent(jLabel7)
                    .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
       int k = 0;
        for(InventoryItem item : cart.getInventoryDirectory()){
           k=k+item.getQuantity();
       }
        if(k>request.getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity is more than requested, please remove items");
            return;
        }
        else if (k<request.getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity is less than requested, please add more items items");
            return;
        }
        else{
            request.setCart(cart);
       request.setTansactionStatus(1);
       request.setReceiver(business.getCurrentUser());
       request.setStatus("Sent to price verification");
       JOptionPane.showMessageDialog(null, "Business Rates Send to Distributor");
        }
       
//       for(InventoryItem item : request.getCart().getInventoryDirectory()){
//           for(InventoryItem item2 : business.getEnterprise(business.getCurrentUser()).getInventoryDirectory().getInventoryDirectory()){
//               if(item.getVacination()==item2.getVacination()){
//                   item2.setQuantity(item2.getQuantity()-item.getQuantity());
//               }
//           }
//       }
       
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void vaccinerequiredjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinerequiredjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccinerequiredjTextFieldActionPerformed

    private void enterprisejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterprisejTextFieldActionPerformed

    private void addItemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemjButtonActionPerformed
        
        
         int selectedRow = inverntoryJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a batch from the above table");
            return;
        }
        
        InventoryItem request = (InventoryItem)inverntoryJTable.getValueAt(selectedRow, 0);
        int found =0;
        for(InventoryItem i : cart.getInventoryDirectory()){
            if(i.getVacination()==request.getVacination()){
                found =1;
            }
        }
        
        
        if(!sellingPricejTextField.getText().isEmpty() && sellingPricejTextField.getText().matches("[0-9]+\\.+[0-9]+") && !String.valueOf(quantityjSpinner.getValue()).isEmpty() && String.valueOf(quantityjSpinner.getValue()).matches("[0-9]+")){
            int quant = Integer.valueOf(String.valueOf(quantityjSpinner.getValue()));
            double price = Double.valueOf(sellingPricejTextField.getText());
            if(found ==1){
                JOptionPane.showMessageDialog(null, "Please delete the same batch from cart to add more quantity");
            }
            else if(quant > request.getQuantity()){
                JOptionPane.showMessageDialog(null, "You are trying to add more quantity than in inventory");
            }
            else if(quant<=0){
                JOptionPane.showMessageDialog(null, "Quantity must be more than zero");
            }
            else if(quant<=0){
                JOptionPane.showMessageDialog(null, "Quantity must be more than zero");
            }
            else{
                InventoryItem item = cart.addItem();
                item.setQuantity(quant);
                item.setPrice(price);
                item.setVacination(request.getVacination());
                populateAvailableCarttable();
                populateAvailabletable();
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Qauntity is not a number");
            return;
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_addItemjButtonActionPerformed

    private void removeItemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemjButtonActionPerformed
         int selectedRow = inverntoryCartJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a batch from the above table");
            return;
        }
        
        InventoryItem request = (InventoryItem)inverntoryCartJTable.getValueAt(selectedRow, 0);
        cart.removeItem(request);
        populateAvailableCarttable();
        populateAvailabletable();
        
    }//GEN-LAST:event_removeItemjButtonActionPerformed

    private void quantityrequiredjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityrequiredjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityrequiredjTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField enterprisejTextField;
    private javax.swing.JTable inverntoryCartJTable;
    private javax.swing.JTable inverntoryJTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantityjSpinner;
    private javax.swing.JTextField quantityrequiredjTextField;
    private javax.swing.JButton removeItemjButton;
    private javax.swing.JTextField sellingPricejTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField totaljTextField;
    private javax.swing.JTextField vaccinerequiredjTextField;
    // End of variables declaration//GEN-END:variables
}
