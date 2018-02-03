/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SMAdminInterface.CompanyPerformanceInterface;

import Business.MarketOffers.MarketOffer;
import Business.MarketOffers.MarketOfferCatalog;
import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import Business.Sales.OrderItem;
import Business.SupplierPackage.Product;
import Business.SupplierPackage.Supplier;
import Business.SupplierPackage.SupplierDirectory;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class ProductSalesRevenueJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    OrderCatalog orderCatalog;
    MarketOfferCatalog marketOfferCatalog; 
    SupplierDirectory supplierDirectory;
    DecimalFormat dF;
    ArrayList<String> productStringList;
    ArrayList<OrderItem> newOrderItemList;
    ArrayList<Product> productList;
    ArrayList<Product> top3productList;

    /**
     * Creates new form ProductSalesRevenueJPanel
     */
    public ProductSalesRevenueJPanel(JPanel userProcessContainer, OrderCatalog orderCatalog, 
            MarketOfferCatalog marketOfferCatalog, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderCatalog = orderCatalog;
        this.marketOfferCatalog = marketOfferCatalog;
        this.supplierDirectory = supplierDirectory;
        this.productStringList = new ArrayList<>();
        this.dF = new DecimalFormat("#0.00");
        
        populateComboBox();
    }
    
    public void populateComboBox(){
        cmbMarketType.removeAllItems();
        cmbProduct.removeAllItems();
        
        
        for(MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()){
            String mkType = marketOffer.getMarket().getMarketType();
            cmbMarketType.addItem(mkType);
        }
        
        
        
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            for(Product product : supplier.getProductCatalog().getProductList()){
                String prodName = product.getProdName();
                if(!(productStringList.contains(prodName))){
                    productStringList.add(prodName);
                }
            }
        }
        for(String s : productStringList){
            cmbProduct.addItem(s);
        }
    }
    
    public void refreshTable(ArrayList<Product> refreshProductList){
        DefaultTableModel dtm = (DefaultTableModel)tblTop3Products.getModel();
        dtm.setRowCount(0);
        
        try{
            double totalRevenue = 0;
            for(Product product : refreshProductList){
                Object[] row = new Object[8];
                row[0] = product;
                row[1] = product.getProdName();
                
                for(Supplier supplier : supplierDirectory.getSupplierlist()){
                    Product searchedProduct = supplier.getProductCatalog().searchProduct(product.getProductID());
                    if(searchedProduct==product){
                        row[2] = supplier.getSupplierName();
                    }
                }
                
                
                row[3] = product.getCostPrice();
                row[4] = product.getQtytSold();
                row[5] = product.getQtytSold()*product.getCostPrice();
                row[6] = product.getTotalRevenueGenerated();
                row[7] = product.getTotalRevenueGenerated() - (product.getQtytSold()*product.getCostPrice());

                dtm.addRow(row);

                totalRevenue += product.getTotalRevenueGenerated();
            }
            txtTotalRevenueTop3.setText(dF.format(totalRevenue));
            
        }
        catch(Exception e){   
        }
    }
    
    public void bubbleSortByTotalRevenue(ArrayList<Product> sortedProductItemList){
        ArrayList top3OrderItemList = new ArrayList<>();
        int n = sortedProductItemList.size();
        System.out.println("element at zeroth pos "+sortedProductItemList.get(n-1));
        System.out.println("element at last pos "+sortedProductItemList.get(0));
        
        Product product = new Product();
        
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                Product product1 = sortedProductItemList.get(j);
                Product product2 = sortedProductItemList.get(j-1);
                
                if(product2.getTotalRevenueGenerated()>product1.getTotalRevenueGenerated()){
                    
                    product = product2;
                    
                    sortedProductItemList.set(j-1, product1);
                    sortedProductItemList.set(j, product);                  
                    
                }
            }
        }
        for(int i=(n-1); i > (n-4) ; i--){
             Product productFilter = sortedProductItemList.get(i);
             top3OrderItemList.add(productFilter);
        }
        refreshTable(top3OrderItemList);
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
        tblOrderItemList = new javax.swing.JTable();
        lblManageProducts = new javax.swing.JLabel();
        cmbMarketType = new javax.swing.JComboBox<>();
        lblObjectID = new javax.swing.JLabel();
        lblObjectID1 = new javax.swing.JLabel();
        cmbProduct = new javax.swing.JComboBox<>();
        btnFilter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTotalRevenue = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnTop3HotSelling = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTop3Products = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTotalRevenueTop3 = new javax.swing.JTextField();

        tblOrderItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderItemID", "Item Name", "Quantity", "Unit Cost Price", "Unit Selling Price", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderItemList);
        if (tblOrderItemList.getColumnModel().getColumnCount() > 0) {
            tblOrderItemList.getColumnModel().getColumn(0).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(1).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(2).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(3).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(4).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(5).setResizable(false);
        }

        lblManageProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProducts.setText("Product Sales Performance");

        cmbMarketType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMarketTypeItemStateChanged(evt);
            }
        });
        cmbMarketType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarketTypeActionPerformed(evt);
            }
        });

        lblObjectID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectID.setText("Market Type");

        lblObjectID1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblObjectID1.setText("Product");

        cmbProduct.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductItemStateChanged(evt);
            }
        });
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFilter.setText("<< Filter Market Wise >>");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Total Revenue");

        txtTotalRevenue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalRevenue.setForeground(new java.awt.Color(255, 0, 0));
        txtTotalRevenue.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtTotalRevenue.setEnabled(false);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTop3HotSelling.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTop3HotSelling.setText("Top 3 HOT Selling Products");
        btnTop3HotSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop3HotSellingActionPerformed(evt);
            }
        });

        tblTop3Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Product Name", "Supplier", "Unit Cost Price", "Quantity Sold", "Total Cost Price", "Total Revenue", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTop3Products);
        if (tblTop3Products.getColumnModel().getColumnCount() > 0) {
            tblTop3Products.getColumnModel().getColumn(0).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(1).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(2).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(3).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(4).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(5).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(6).setResizable(false);
            tblTop3Products.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Total Revenue");

        txtTotalRevenueTop3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalRevenueTop3.setForeground(new java.awt.Color(255, 0, 0));
        txtTotalRevenueTop3.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtTotalRevenueTop3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalRevenueTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblObjectID)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMarketType, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(lblObjectID1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTop3HotSelling, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageProducts)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObjectID)
                    .addComponent(cmbMarketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObjectID1)
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnTop3HotSelling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(txtTotalRevenueTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMarketTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMarketTypeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarketTypeItemStateChanged

    private void cmbMarketTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarketTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarketTypeActionPerformed

    private void cmbProductItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductItemStateChanged

    private void cmbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        String marketType = (String)cmbMarketType.getSelectedItem();
        String productName = (String)cmbProduct.getSelectedItem();
        
        System.out.println("-----------------------------------------");
        
        DefaultTableModel dtm = (DefaultTableModel)tblOrderItemList.getModel();
        dtm.setRowCount(0);
        
        double totalRevenue = 0;
        for(Order order : orderCatalog.getOrderList()){
//            System.out.println(order.getMarket().getMarketType());
            if(order.getMarket().getMarketType().compareTo(marketType)==0){
//                System.out.println("check after condition "+order.getMarket().getMarketType());
                
                
                try{
                    
                    System.out.println("Initial Total Revenue"+totalRevenue);
                    for(OrderItem orderItem : order.getOrderItemList()){
//                        System.out.println("check orderitem after condition "+orderItem.getProduct().getProdName());
                            System.out.println("After FOR Loop Total Revenue"+totalRevenue);
                        
                        if(orderItem.getProduct().getProdName().compareTo(productName)==0){
                            System.out.println("Selected Order Item after Condition "+orderItem.getProduct().getProdName());
                            System.out.println("After IF Condition Total Revenue"+totalRevenue);
                            
                            Object[] row = new Object[6];
                            
                            System.out.println("Order Item After New Row Created "+orderItem.getProduct().getProdName());
                            
                            row[0] = orderItem;
                            row[1] = orderItem.getProduct().getProdName();
                            row[2] = orderItem.getQuantity();
                            row[3] = orderItem.getProduct().getCostPrice();
                            row[4] = orderItem.getSellingPrice();
                            row[5] = orderItem.getQuantity()*(orderItem.getSellingPrice() - orderItem.getProduct().getCostPrice());

                            dtm.addRow(row);

                            totalRevenue += orderItem.getQuantity()*(orderItem.getSellingPrice());
                            System.out.println("At the END of IF Revenue Generated "+totalRevenue);
                            
                        }
                        System.out.println("IF Condition completed Revenue Generated "+totalRevenue);
                        
                    }
                    System.out.println("FOR LOOP completed Revenue Generated "+totalRevenue);
                    
                }
                catch(Exception e){
                    
                }
            }
        }
        txtTotalRevenue.setText(dF.format(totalRevenue));
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTop3HotSellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop3HotSellingActionPerformed
        // TODO add your handling code here:
        newOrderItemList = new ArrayList<>();
        for(Order order : orderCatalog.getOrderList()){
            for(OrderItem orderItem : order.getOrderItemList()){
                if(orderItem.getSoldItemBelowTarget()==0){
                    newOrderItemList.add(orderItem);
                }
            }
        }
        for(OrderItem orderItem : newOrderItemList){
            System.out.println("checking new orderitem list "+orderItem.getProduct().getProdName());
        }
        
        productList = new ArrayList<>();
        for(OrderItem orderItem : newOrderItemList){
            Product product = orderItem.getProduct();
            if(!(productList.contains(product))){
                productList.add(product);
            }
        }
        
        for(Product product : productList){
            double totalRevenueGenerated =0;
            int qtySold = 0;
            for(OrderItem orderItem : newOrderItemList){
                if(product.getProductID()==orderItem.getProduct().getProductID()){
                    int qty = orderItem.getQuantity();
                    double sellingPrice = orderItem.getSellingPrice();
                    totalRevenueGenerated += qty*sellingPrice;
                    qtySold += qty;
                }
            }
            product.setTotalRevenueGenerated(totalRevenueGenerated);
            product.setQtytSold(qtySold);
        }
        
        bubbleSortByTotalRevenue(productList);
    }//GEN-LAST:event_btnTop3HotSellingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnTop3HotSelling;
    private javax.swing.JComboBox<String> cmbMarketType;
    private javax.swing.JComboBox<String> cmbProduct;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageProducts;
    private javax.swing.JLabel lblObjectID;
    private javax.swing.JLabel lblObjectID1;
    private javax.swing.JTable tblOrderItemList;
    private javax.swing.JTable tblTop3Products;
    private javax.swing.JTextField txtTotalRevenue;
    private javax.swing.JTextField txtTotalRevenueTop3;
    // End of variables declaration//GEN-END:variables
}
