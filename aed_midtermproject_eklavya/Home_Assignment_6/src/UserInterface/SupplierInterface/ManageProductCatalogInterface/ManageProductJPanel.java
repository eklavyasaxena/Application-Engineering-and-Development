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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class ManageProductJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    Supplier supplier;

    /**
     * Creates new form ManageUserAccountsJPanel
     */
    public ManageProductJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.supplier = supplier;
        
        populateTable();
    }
    
    public void populateTable(){

        DefaultTableModel model = (DefaultTableModel)tblProductList.getModel();
        model.setRowCount(0);
             

        
        try{
            for(Product p : supplier.getProductCatalog().getProductList()){
                Object row[] = new Object[4];
                row[0] = p;
                row[1] = p.getProdName();
                row[2] = p.getCostPrice();
                row[3] = p.getAvailNum();
                model.addRow(row);
            }
        }catch(Exception e){
            System.err.println("Exception: " + e.getMessage());
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

        lblManageProducts = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        txtProductID = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManageProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProducts.setText("Manage Products - Work Responsibility");

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Cost Price", "Availability Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblProductList);
        if (tblProductList.getColumnModel().getColumnCount() > 0) {
            tblProductList.getColumnModel().getColumn(0).setResizable(false);
            tblProductList.getColumnModel().getColumn(1).setResizable(false);
            tblProductList.getColumnModel().getColumn(2).setResizable(false);
            tblProductList.getColumnModel().getColumn(3).setResizable(false);
        }

        txtProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProductID.setText("Enter Product ID Here");
        txtProductID.setToolTipText("Enter User Name");
        txtProductID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProductID.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtProductID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductIDFocusGained(evt);
            }
        });

        btnSearchProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnAddProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddProduct.setText("Add Product>>");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdateProduct.setText("View/Update Product >>");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteProduct.setText("<< Delete Product >>");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
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
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblManageProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchProduct)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddProduct)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProduct)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteProduct)
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // TODO add your handling code here:
        if(txtProductID.getText().equals("") || !(txtProductID.getText().matches("[0-9A-Z]+"))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            String id= txtProductID.getText();
            Product product=supplier.getProductCatalog().searchProduct(id);
        
            
            if(product == null){
                JOptionPane.showMessageDialog(null, "Product Does Not Exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                SearchUpdateProductJPanel panel = new SearchUpdateProductJPanel(userProcessContainer, product);
                userProcessContainer.add("SearchUpdateUserAccountJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                
                txtProductID.setText("Enter Product ID Here");
            }
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

        

    private void txtProductIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIDFocusGained
        // TODO add your handling code here:
        txtProductID.setText("");
    }//GEN-LAST:event_txtProductIDFocusGained

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
       int row = tblProductList.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product s = (Product)tblProductList.getValueAt(row, 0);
        supplier.getProductCatalog().removeProduct(s);
        populateTable();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to View Details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Product product = (Product)tblProductList.getValueAt(selectedRow, 0);
            SearchUpdateProductJPanel panel = new SearchUpdateProductJPanel(userProcessContainer, product);
            userProcessContainer.add("SearchUpdateUserAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        AddProductJPanel panel = new AddProductJPanel(userProcessContainer, supplierDirectory, supplier);
        userProcessContainer.add("AddProductJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        System.out.println("Passed Supplier: "+supplier);
    }//GEN-LAST:event_btnAddProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblManageProducts;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtProductID;
    // End of variables declaration//GEN-END:variables
}
