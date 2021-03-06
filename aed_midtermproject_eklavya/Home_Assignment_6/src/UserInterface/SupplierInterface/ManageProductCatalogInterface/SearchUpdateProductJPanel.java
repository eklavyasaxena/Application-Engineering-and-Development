/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierInterface.ManageProductCatalogInterface;

import Business.SupplierPackage.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class SearchUpdateProductJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Product product; 
    /**
     * Creates new form SearchUpdateUserAccountJPanel
     */
    public SearchUpdateProductJPanel(JPanel userProcessContainer, Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product = product;
        
        txtProductName.setEnabled(false);
        txtCostPrice.setEnabled(false);
        txtAvailNum.setEnabled(false);
        txtProductID.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        txtProductName.setText(product.getProdName());
        txtProductID.setText(product.getProductID());        
        txtCostPrice.setText(String.valueOf(product.getCostPrice()));
        txtAvailNum.setText(String.valueOf(product.getAvailNum()));
    }

   
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewProducts = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblObjectID = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtAvailNum = new javax.swing.JTextField();
        txtCostPrice = new javax.swing.JTextField();

        lblViewProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblViewProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewProducts.setText("View Product's Details");

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setText("Product Name:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setText("Cost Price:");

        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtProductName.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtProductName.setEnabled(false);

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

        lblObjectID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectID.setText("Avail Num");

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserID.setText("Product ID:");

        txtProductID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtProductID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtProductID.setEnabled(false);

        txtAvailNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtAvailNum.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtAvailNum.setEnabled(false);

        txtCostPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCostPrice.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtCostPrice.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(lblViewProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword)
                    .addComponent(lblObjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblViewProducts)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObjectID)
                    .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductJPanel manageUserAccountsJPanel = (ManageProductJPanel) component;
        manageUserAccountsJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtProductName.setEnabled(true);
        txtCostPrice.setEnabled(true);
        txtAvailNum.setEnabled(true);
        txtProductID.setEnabled(false);
        
        btnSave.setEnabled(true);
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String productName = txtProductName.getText();
        String costPrice  = txtCostPrice.getText();
        String availNum = txtAvailNum.getText();
        
        if((productName.equals("") || !(productName.matches("[a-zA-Z]+")))||
                (costPrice.equals("") || !(costPrice.matches("[0-9]+(?:\\.[0-9]+)?")))||
                (availNum.equals("") || !(availNum.matches("[0-9]+")))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        
        
        else{
            product.setProdName(productName);
            product.setCostPrice(Double.parseDouble(costPrice));
            product.setAvailNum(Integer.parseInt(availNum));
            
            JOptionPane.showMessageDialog(null, "Product Updated Successfully");
            
            txtAvailNum.setText("");
            txtProductName.setText("");
            txtCostPrice.setText("");
        }
       
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblObjectID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblViewProducts;
    private javax.swing.JTextField txtAvailNum;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
