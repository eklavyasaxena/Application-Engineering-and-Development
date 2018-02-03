/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPersonInterface.BookNewOrderInterface;

import Business.Market.Customer;
import Business.MarketOffers.MarketOffer;
import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import Business.Sales.OrderItem;
import Business.SupplierPackage.Product;
import Business.SupplierPackage.Supplier;
import Business.SupplierPackage.SupplierDirectory;
import Business.UserAccountPackage.UserAccount;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class BookOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    MarketOffer marketOffer;
    OrderCatalog orderCatalog;
    SupplierDirectory supplierDirectory;
    UserAccount userAccount;
    Customer customer;
    DecimalFormat dF;
    Order order;
    
    private boolean isCheckedOut = false;
    /**
     * Creates new form BookOrderJPanel
     */
    public BookOrderJPanel(JPanel userProcessContainer, MarketOffer marketOffer, OrderCatalog orderCatalog, 
                            SupplierDirectory supplierDirectory, UserAccount userAccount, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.marketOffer = marketOffer;
        this.orderCatalog = orderCatalog;
        this.supplierDirectory = supplierDirectory;
        this.userAccount = userAccount;
        this.customer = customer;
        
        
        
        this.dF = new DecimalFormat("#0.00");
        
        if(!isCheckedOut){
            this.order = new Order();
        }
        
        txtMarketType.setText(marketOffer.getMarket().getMarketType());
        txtCustomer.setText(customer.getCustomerName());
        
        populateSupplierComboBox();
    }
    
    public void calculateRewards(){
        double compensationEarned = 0;
        for(OrderItem orderItem : order.getOrderItemList()){
            if(orderItem.getSellingPrice()>(orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1))){
                compensationEarned += orderItem.getQuantity()
                                        * (((orderItem.getSellingPrice()
                                        - (orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1)))*0.1)
                                        + ((orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1))*0.05));
            }
            else{
                compensationEarned += orderItem.getQuantity()
                                        * (((orderItem.getSellingPrice()
                                        - (orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1)))*0.1));
            }
        }
        System.out.println(compensationEarned);
        txtRewards.setText(dF.format(compensationEarned));
        
        double totalSellingPrice = 0;
            for(OrderItem orderItem : order.getOrderItemList()){
                totalSellingPrice += orderItem.getQuantity()*orderItem.getSellingPrice();
            }
        txtGrandTotal.setText(String.valueOf(totalSellingPrice));
    }
    
    public void populateSupplierComboBox(){
        cmbSupplier.removeAllItems();;
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            String s = supplier.getSupplierName();
            cmbSupplier.addItem(s);
            
            populateProductTable();
        }
    }
    
    public void populateProductTable(){
        
        DefaultTableModel model = (DefaultTableModel)tblProductList.getModel();
        model.setRowCount(0);
        
        String s = (String)cmbSupplier.getSelectedItem();  
        System.out.println("BookOrderJPanel"+s);
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            if(supplier.getSupplierName().compareTo(s)==0){
                for(Product p : supplier.getProductCatalog().getProductList()) {
                    Object row[] = new Object[6];
                    row[0] = p;
                    row[1] = p.getProdName();
                    
                    row[2] = dF.format(p.getCostPrice()*(((marketOffer.getFloorPercentage())/100)+1));
                    row[3] = dF.format(p.getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1));
                    row[4] = dF.format(p.getCostPrice()*(((marketOffer.getCeilingPercentage())/100)+1));
                    row[5] = p.getAvailNum();
                    model.addRow(row);
                }
            }
        }
    }

    public void refreshProductTable(String productID){
        
        DefaultTableModel model = (DefaultTableModel)tblProductList.getModel();
        model.setRowCount(0);
        
        
        for(Supplier s : supplierDirectory.getSupplierlist()){
            for(Product p : s.getProductCatalog().getProductList()){
                if(p.getProductID().compareTo(productID)==0){
                    Object row[] = new Object[6];
                    row[0] = p;
                    row[1] = p.getProdName();
                    
                    row[2] = dF.format(p.getCostPrice()*(((marketOffer.getFloorPercentage())/100)+1));
                    row[3] = dF.format(p.getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1));
                    row[4] = dF.format(p.getCostPrice()*(((marketOffer.getCeilingPercentage())/100)+1));
                    row[5] = p.getAvailNum();
                    model.addRow(row);
                }
            }
        }    
    }
    
    public void refreshOrderTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrderItemList.getModel();
        model.setRowCount(0);

        for(OrderItem oi : order.getOrderItemList()){
            Object row[] = new Object[5];
            row[0] = oi;
            row[1] = oi.getProduct().getProdName();
            row[2] = oi.getQuantity();
            row[3] = oi.getSellingPrice();
            row[4] = dF.format(oi.getQuantity()*oi.getSellingPrice());
            model.addRow(row);
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
        jLabel1 = new javax.swing.JLabel();
        txtMarketType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSearchProduct = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        txtSellingPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spnQty = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItemList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNewQty = new javax.swing.JTextField();
        btnModifyQty = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        btnDeleteOrderItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRewards = new javax.swing.JTextField();
        txtGrandTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        lblManageProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProducts.setText("Book a New Order - Work Responsibility");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Market Type:");

        txtMarketType.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtMarketType.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtMarketType.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Customer:");

        txtCustomer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCustomer.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtCustomer.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Supplier:");

        cmbSupplier.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Floor Price", "Target Price", "Ceiling Price", "Avail Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductList);
        if (tblProductList.getColumnModel().getColumnCount() > 0) {
            tblProductList.getColumnModel().getColumn(0).setResizable(false);
            tblProductList.getColumnModel().getColumn(1).setResizable(false);
            tblProductList.getColumnModel().getColumn(2).setResizable(false);
            tblProductList.getColumnModel().getColumn(3).setResizable(false);
            tblProductList.getColumnModel().getColumn(4).setResizable(false);
            tblProductList.getColumnModel().getColumn(5).setResizable(false);
            tblProductList.getColumnModel().getColumn(5).setHeaderValue("Avail Qty");
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Supplier Product Catalog");

        txtSearchProduct.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSearchProduct.setText("Enter Product ID");
        txtSearchProduct.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtSearchProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchProductFocusGained(evt);
            }
        });

        btnSearchProduct.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        txtSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSellingPrice.setText("Enter Selling Price");
        txtSellingPrice.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtSellingPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSellingPriceFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Sales Price");

        spnQty.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAddToCart.setText("Add To Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        tblOrderItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderItem ID", "Item Name", "Quantity", "Unit Price", "Total Sales Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderItemList);
        if (tblOrderItemList.getColumnModel().getColumnCount() > 0) {
            tblOrderItemList.getColumnModel().getColumn(0).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(1).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(2).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(3).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Order Cart");

        txtNewQty.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNewQty.setText("Enter New Qty");
        txtNewQty.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtNewQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewQtyFocusGained(evt);
            }
        });

        btnModifyQty.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnModifyQty.setText("Modify Qty");
        btnModifyQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQtyActionPerformed(evt);
            }
        });

        btnCheckout.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCheckout.setText("<< CheckOut >>");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        btnDeleteOrderItem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDeleteOrderItem.setText("<<Delete An Order Item>>");
        btnDeleteOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderItemActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("<< Cancel & Go Back>>");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Rewards:");

        txtRewards.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtRewards.setForeground(new java.awt.Color(255, 0, 0));
        txtRewards.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtRewards.setEnabled(false);

        txtGrandTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtGrandTotal.setForeground(new java.awt.Color(255, 0, 0));
        txtGrandTotal.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtGrandTotal.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("GRAND TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMarketType)
                                    .addComponent(cmbSupplier, 0, 174, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRewards, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)
                                        .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(455, 455, 455)
                                .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDeleteOrderItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(93, 93, 93)
                                    .addComponent(txtNewQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnModifyQty)
                                    .addGap(153, 153, 153)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblManageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMarketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct)
                    .addComponent(jLabel7)
                    .addComponent(txtRewards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNewQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModifyQty)
                        .addComponent(jLabel8)
                        .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteOrderItem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCheckout))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        populateProductTable();
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // TODO add your handling code here:
        String productID = txtSearchProduct.getText();
        
        refreshProductTable(productID);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void txtSearchProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchProductFocusGained
        // TODO add your handling code here:
        txtSearchProduct.setText("");
    }//GEN-LAST:event_txtSearchProductFocusGained

    private void txtSellingPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSellingPriceFocusGained
        // TODO add your handling code here:
        txtSellingPrice.setText("");
    }//GEN-LAST:event_txtSellingPriceFocusGained

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductList.getSelectedRow();
        if(selectedRow< 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to Add it to CART", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product selectedProduct = (Product)tblProductList.getValueAt(selectedRow, 0);
        int fetchQty = (Integer) spnQty.getValue();
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity Cannot be ZERO");
            return;
        }
        try{
            double sellingPrice = Double.parseDouble(txtSellingPrice.getText());
            if(sellingPrice<(selectedProduct.getCostPrice()*(((marketOffer.getFloorPercentage())/100)+1))){
                JOptionPane.showMessageDialog(null, "Sales Price Cannot be Less Than FLOOR Price");
                System.out.println(selectedProduct.getCostPrice()*(((marketOffer.getFloorPercentage())/100)+1));
                return;         
            }
            
            if(fetchQty<=selectedProduct.getAvailNum()){
                boolean alreadyPresent = false;
                for(OrderItem oi : order.getOrderItemList()){
                    if(oi.getProduct()==selectedProduct&&oi.getSellingPrice()==Double.parseDouble(txtSellingPrice.getText())){
                        int oldAvailability = selectedProduct.getAvailNum();
                        int newAvailability = oldAvailability - fetchQty;
                        selectedProduct.setAvailNum(newAvailability);

                        oi.setQuantity(fetchQty+oi.getQuantity());

                        alreadyPresent = true;
                        
                        calculateRewards();
                        populateProductTable();
                        refreshOrderTable();
                        break;
                    }
                }
                
                if(!alreadyPresent){
                    int oldAvailability = selectedProduct.getAvailNum();
                    int newAvailability = oldAvailability - fetchQty;
                    selectedProduct.setAvailNum(newAvailability);
                    
                    OrderItem orderItem = order.addOrderItem();
                    
                    orderItem.setProduct(selectedProduct);
                    orderItem.setQuantity(fetchQty);
                    orderItem.setSellingPrice(sellingPrice);
                    
                    
                    calculateRewards();
                    populateProductTable();
                    refreshOrderTable();
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Quantity is Greater than the Listed Quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Price");
            return;
        }
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtNewQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewQtyFocusGained
        // TODO add your handling code here:
        txtNewQty.setText("");
    }//GEN-LAST:event_txtNewQtyFocusGained

    private void btnModifyQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQtyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderItemList.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select a ROW from the Table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrderItem oi = (OrderItem) tblOrderItemList.getValueAt(selectedRow, 0);
        
        int currentAvail = oi.getProduct().getAvailNum();
        int oldqty = oi.getQuantity();
        int newqty = Integer.parseInt(txtNewQty.getText());
        
        if(newqty > (currentAvail+oldqty)){
            JOptionPane.showMessageDialog(null, "Quantity is GREATER than Available Quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            if(newqty<=0){
                JOptionPane.showMessageDialog(null, "Quantity should be greater than ZERO", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            oi.setQuantity(newqty);
            oi.getProduct().setAvailNum(currentAvail + (oldqty - newqty));
            
            calculateRewards();
            populateProductTable();
            refreshOrderTable();
        }
    }//GEN-LAST:event_btnModifyQtyActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        if(order.getOrderItemList().size()>0){
           
           orderCatalog.addOrder(order);
           
           order.setPerson(userAccount.getPerson());
           order.setMarket(marketOffer.getMarket());
           order.setCustomer(customer);
           order.setRewardsEarned(Double.parseDouble(txtRewards.getText()));
           System.out.println("Rewards "+ Double.parseDouble(txtRewards.getText()));
           
           double totalSellingPrice = 0;
           for(OrderItem orderItem : order.getOrderItemList()){
               totalSellingPrice += orderItem.getQuantity()*orderItem.getSellingPrice();
           }
           order.setTotalSellingPrice(totalSellingPrice);
           System.out.println("totalSellingPrice"+ totalSellingPrice);
           
           double totalTargetPrice = 0;
           for(OrderItem orderItem : order.getOrderItemList()){
               totalTargetPrice += orderItem.getQuantity()*(orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1));
           }
           order.setTotalTargetPrice(totalTargetPrice);
           System.out.println("totalTargetPrice "+totalTargetPrice);
           
           double totalCostPrice = 0;
           for(OrderItem orderItem : order.getOrderItemList()){
               totalCostPrice += orderItem.getQuantity()*(orderItem.getProduct().getCostPrice());
           }
           order.setTotalCostPrice(totalCostPrice);
           
           if(totalTargetPrice>totalSellingPrice){
               order.setSoldBelowTarget(1);
           }
           
           JOptionPane.showMessageDialog(null, "Order Placed Sucessfully");
           
           order = new Order();
           
           refreshOrderTable();
           populateProductTable();
           txtGrandTotal.setText("");
           txtRewards.setText("");
           
           isCheckedOut = true;
           
           for(OrderItem orderItem : order.getOrderItemList()){
               int qty = orderItem.getQuantity();
               double sp = orderItem.getSellingPrice();
               double tp = (orderItem.getProduct().getCostPrice()*(((marketOffer.getTargetPercentage())/100)+1));
               if(sp<tp){
                   orderItem.setSoldItemBelowTarget(1);
               }
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Cart is Empty", "Warning", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnDeleteOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderItemActionPerformed
        // TODO add your handling code here:
        int row = tblOrderItemList.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please Select an Item to be Deleted", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderItem oi = (OrderItem)tblOrderItemList.getValueAt(row, 0);
        int oldAvail = oi.getProduct().getAvailNum();
        int oldqty = oi.getQuantity();
        int newqty = oldAvail + oldqty;
        
        oi.getProduct().setAvailNum(newqty);
        
        order.removeOrderItem(oi);
        
        JOptionPane.showMessageDialog(null, "Order Removed from the Cart");
        
        calculateRewards();
        refreshOrderTable();
        populateProductTable();
    }//GEN-LAST:event_btnDeleteOrderItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnDeleteOrderItem;
    private javax.swing.JButton btnModifyQty;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageProducts;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTable tblOrderItemList;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtMarketType;
    private javax.swing.JTextField txtNewQty;
    private javax.swing.JTextField txtRewards;
    private javax.swing.JTextField txtSearchProduct;
    private javax.swing.JTextField txtSellingPrice;
    // End of variables declaration//GEN-END:variables
}
