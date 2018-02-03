/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierInterface.ManageProductCatalogInterface;

import Business.SupplierPackage.Product;
import Business.SupplierPackage.Supplier;
import Business.SupplierPackage.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class AddProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    Supplier supplier;
    /**
     * Creates new form AddUserAccountJPanel
     */
    public AddProductJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.supplier = supplier;
        
        txtProductID.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtCostPrice = new javax.swing.JTextField();
        lblAddProduct = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        lblObjectAssociated = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtAvailNum = new javax.swing.JTextField();

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setText("Cost Price:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setText("Availability Number:");

        txtCostPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCostPrice.setDisabledTextColor(new java.awt.Color(0, 0, 149));

        lblAddProduct.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblAddProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddProduct.setText("Add New Product");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblObjectAssociated.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectAssociated.setText("Product ID:");

        txtProductID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtProductID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtProductID.setEnabled(false);

        lblUserID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserID.setText("Product Name:");

        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtProductName.setDisabledTextColor(new java.awt.Color(0, 0, 149));

        txtAvailNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtAvailNum.setDisabledTextColor(new java.awt.Color(0, 0, 149));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblObjectAssociated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblAddProduct)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblObjectAssociated)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtAvailNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnAddProduct))))
                .addContainerGap(120, Short.MAX_VALUE))
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

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:     
        String productName = txtProductName.getText();
        String costPrice  = txtCostPrice.getText();
        String availNum = txtAvailNum.getText();
        
        if((productName.equals("") || !(productName.matches("[a-zA-Z]+")))||
                (costPrice.equals("") || !(costPrice.matches("[0-9]+(?:\\.[0-9]+)?")))||
                (availNum.equals("") || !(availNum.matches("[0-9]+")))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
            System.out.println(supplier);
        }
        
        
        else{
            Product product = supplier.getProductCatalog().addProduct();
            product.setProdName(productName);
            product.setCostPrice(Double.parseDouble(costPrice));
            product.setAvailNum(Integer.parseInt(availNum));
            
            JOptionPane.showMessageDialog(null, "Product Added Successfully");
            
            txtAvailNum.setText("");
            txtProductName.setText("");
            txtCostPrice.setText("");
        }
      
        
    }//GEN-LAST:event_btnAddProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblAddProduct;
    private javax.swing.JLabel lblObjectAssociated;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtAvailNum;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}